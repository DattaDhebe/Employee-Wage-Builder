public class EmpWageBuilderUC1 {
	// Contants
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
   public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HOURS_IN_MONTH = 10;

	public static void main(String[] args) {
		// Variable
		int totalEmpWage = 0, totalWorkingDays = 0;
		int totalEmpHrs = 0;	
		//Computation
		while (totalEmpHrs <= MAX_HOURS_IN_MONTH &&  totalWorkingDays < NUM_OF_WORKING_DAYS) { 
			int empHrs = 0;
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
		int empWage = empHrs * EMP_RATE_PER_HOUR;
		totalEmpWage += empWage;
		System.out.println("For EveryDay Wage: " + empWage);

		}
	System.out.println("Total employee Wage : " + totalEmpWage);
	}
}
