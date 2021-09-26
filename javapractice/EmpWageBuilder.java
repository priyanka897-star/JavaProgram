package javapractice;

public class EmpWageBuilder {
	
	public static void main(String[] args) {
		//Variable
		final int EMP_FULL_TIME = 1;
		final int EMP_PART_TIME = 2;
		final int EMP_RATE_PER_HOUR = 20;
		final int NUM_OF_WORKING_DAYS = 20;
		int empHours = 0,empWage = 0,totalEmpWage = 0;
		//Computation
		for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
			
            //computation
		
		  int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		  int i=(int)empCheck;
		  switch(i) {
		  case EMP_FULL_TIME:
			empHours = 8;
			break;
		  case EMP_PART_TIME:
			empHours = 4;
			break;
		  default:
			empHours = 0;
		}
       
	    empWage = empHours  * EMP_RATE_PER_HOUR;
        totalEmpWage = totalEmpWage + empWage;
	    System.out.println(" Employee Wage for day :"+ day + " is :" + empWage);
	    System.out.println("Total Employee Wage:"+totalEmpWage);
		}
		
	}
				
}
