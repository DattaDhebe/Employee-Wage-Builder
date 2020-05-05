public class EmployeeWageBuilder {
	// Contants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final int EMP_RATE_PER_HOUR = 20;
	private final int NUM_OF_WORKING_DAYS = 2;
	private final int MAX_HOURS_IN_MONTH = 10;
	
	public static int calcEmpWageForCompany(String Company, int empRate, int numOfDays, int maxHrs) {
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
   	System.out.println("Total employee Wage for Company " +Company+ " is : " + totalEmpWage);
		return totalEmpWage;
   }
	
	public static void main(String[] args) {
		calcEmpWageForCompany("DMart", 20, 2, 10);
		calcEmpWageForCompany("Reliance", 10, 4, 20);
	}
}
