import java.util.*;

public class EmployeeWageBuilder {
	// Contants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String COMPANY;
	private final int EMP_RATE_PER_HOUR;
	private final int NUM_OF_WORKING_DAYS;
	private final int MAX_HOURS_IN_MONTH;
	
	public EmployeeWageBuilder(String Company, int empRate, int numOfDays, int maxHrs) {
		this.COMPANY = Company;
		this.EMP_RATE_PER_HOUR = empRate;
		this.NUM_OF_WORKING_DAYS = numOfDays;
		this.MAX_HOURS_IN_MONTH = maxHrs;
	
	}
	
	public int calcEmpWageForCompany() {
		// Variable
      int totalEmpWage = 0, totalWorkingDays = 0;
      int totalEmpHrs = 0, empHrs = 0; 
      
		//Dictonary to store totalWage for each Company
		Dictionary<String, Integer> totalEmpWageForCompany = new Hashtable<String, Integer>();
      
      //Computation
      while (totalEmpHrs <= maxHrs &&  totalWorkingDays < numOfDays) {       
         totalWorkingDays++;
         int empCheck = (int) Math.floor(Math.random() * 10) % 3;
         switch (empCheck) {
            case IS_FULL_TIME:
               empHrs = 8;
               break;
            case IS_PART_TIME:
               empHrs = 4;
               break;
            default:
               empHrs = 0;
         }
		totalEmpHrs +=  empHrs;
		System.out.println("Days#: " + totalWorkingDays + " Emp Hrs : " +empHrs);
     }
	
		totalEmpWage = totalEmpHrs * empRate;
		totalEmpWageForCompany.put(Company, totalEmpWage);
		System.out.println("Total Employee Wage For Company is : "+totalEmpWageForCompany.get(Company));
		
   }
	
	public static void main(String[] args) {
			EmployeeWageBuilder dAMrt = new EmpWageBuilder("DMart", 20, 2, 10);
			EmployeeWageBuilder reliance = new EmpWageBuilder("Reliance", 10, 4, 20);
			dAMrt.calcEmpWageForCompany();
			reliance.calcEmpWageForCompany();
	}
}
