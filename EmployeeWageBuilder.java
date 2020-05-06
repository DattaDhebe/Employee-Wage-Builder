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
	
	
	public EmployeeWageBuilder(CompanyEmpWage comapny) {
		this.Company = comapny.Company;
		this.empRate = comapny.empRate;
		this.numOfDays = comapny.numOfDays;
		this.maxHrs = comapny.maxHrs;
	
	}
	
	public static void computeEmpWage(ArrayList<CompanyEmpWage> companies) {
		for(CompanyEmpWage company:companies) {
			new EmployeeWageBuilder(company).calcEmpWageForCompany();
		}
	}
	
	public void calcEmpWageForCompany() {
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
		System.out.println("Total Employee Wage For "+Company+" is : "+totalEmpWageForCompany.get(Company));
	}
	
	public static void main(String[] args) {
		
		ArrayList<CompanyEmpWage> companyList=new ArrayList<CompanyEmpWage>();
		companyList.add(new CompanyEmpWage("DMart", 20, 2, 10));
		companyList.add(new CompanyEmpWage("Reliance", 10, 4, 20));		
		computeEmpWage(companyList);
		
	}
}

class CompanyEmpWage {
	
	public final String Company;
	public final int empRate;
	public final int numOfDays;
	public final int maxHrs;
	

	public CompanyEmpWage(String Company, int empRate, int numOfDays, int maxHrs){
		this.Company=Company;
		this.empRate=empRate;
		this.numOfDays=numOfDays;
		this.maxHrs=maxHrs;
	}
}

