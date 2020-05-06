import java.util.*;

public class EmployeeWageBuilder {
	// Contants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String Company;
	private final int empRate;
	private final int numOfDays;
	private final int maxHrs;
	
	//Dictonary to store totalWage for each Company
	public static final Dictionary<String, Integer> totalEmpWageForCompany = new Hashtable<String, Integer>();
	
	public EmployeeWageBuilder(String Company, int empRate, int numOfDays, int maxHrs) {
		this.Company = Company;
		this.empRate = empRate;
		this.numOfDays = numOfDays;
		this.maxHrs = maxHrs;
	
	}
	
	public int calcEmpWageForCompany() {
		// Variable
		int totalEmpWage = 0, totalWorkingDays = 0;
		int totalEmpHrs = 0, empHrs = 0; 
      
		
      
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
		
		return 0;
	}
	
	public static void main(String[] args) {
		EmployeeWageBuilder dMart = new EmployeeWageBuilder("DMart", 20, 2, 10);
		dMart.calcEmpWageForCompany();
		EmployeeWageBuilder reliance = new EmployeeWageBuilder("Reliance", 10, 4, 20);		
		reliance.calcEmpWageForCompany();
		
	}
}

 

