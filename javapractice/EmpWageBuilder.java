package javapractice;

public class EmpWageBuilder {
	public static void main(String[] args) {
		
	     final int EMP_FULL_TIME = 1;
	     final int EMP_PART_TIME = 2;
	     final int EMP_RATE_PER_HOUR = 20;
	     int empHours = 0;
	     int empWage  = 0;
	    //computation
	
	    int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	    switch(empCheck) {
	    case EMP_FULL_TIME:
		      empHours = 8;
		      break;
	    case EMP_PART_TIME:
		      empHours= 4;
		       break;
	    default:
		      empHours = 0;
	}
    empWage = empHours  * EMP_RATE_PER_HOUR;
    System.out.println(" Employee Wage is :" + empWage);	
  }	
}	
