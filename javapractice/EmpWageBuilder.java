package javapractice;

public class EmpWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int isFullTime = 1;
		int isPartTime=0;
		double empCheck = Math.floor(Math.random()*10)%3;
		if (empCheck == isFullTime) {
			int empRatePerHr = 200;
		    int empHrs = 8;
		    int  salary = ( empHrs * empRatePerHr );
		    System.out.println("Daily Wage of Full Time Employee is : "+salary);
			
		}
		else if (empCheck == isPartTime) {
			
			int empRatePerHr = 200;
		    int empHrs = 4;
		    int  salary = ( empHrs * empRatePerHr );
			System.out.println(" Daily Wage of Part Time Employee is :"+salary);
			
		}
	}

}
