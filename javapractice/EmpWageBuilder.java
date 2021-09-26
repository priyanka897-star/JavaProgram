package javapractice;

public class EmpWageBuilder {
	
	public static void main(String[] args) {
		final int EMP_FULL_TIME = 1;
		final int EMP_PART_TIME = 2;
		final int EMP_RATE_PER_HOUR = 20;
		int empWorkingHour;
		double empCheck = Math.floor(Math.random() * 10) % 3;
	    if(empCheck == EMP_FULL_TIME) 
			empWorkingHour = 8; 
		else if(empCheck == EMP_PART_TIME)
		    empWorkingHour = 4;
		else
		    empWorkingHour = 0;
	    int salary =EMP_RATE_PER_HOUR  * empWorkingHour;   
	    System.out.println(" Employee Salary is :" + salary);	
	}
				
}	
