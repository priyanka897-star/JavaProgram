package javapractice;

public class EmpWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int isPresent = 1;
		double empCheck = Math.floor(Math.random()*10)%2;
		if (empCheck == isPresent) {
			int empRatePerHr = 20;
		    int empHrs = 8;
		    int  salary = ( empHrs * empRatePerHr );
		    System.out.println("Employee is Present and Daily Wage : "+salary);
			
		}
		else {
			int salary = 0;
		
			System.out.println(" Employee is Absent and Daily Wage :"+salary);
			
		}
	}

}
