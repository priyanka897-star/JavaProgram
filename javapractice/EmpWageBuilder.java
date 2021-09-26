package javapractice;

public class EmpWageBuilder {
	
	public static void main(String[] args) {
		//Variable
		 final int EMP_FULL_TIME = 1;
		 final int EMP_PART_TIME = 2;
		 final int EMP_RATE_PER_HOUR = 20;
		 final int NUM_OF_WORKING_DAYS=20;
		 final int MAX_HRS_IN_MONTH = 100;
		  int totalEmpHrs = 0,totalEmpWage = 0,totalWorkingDays = 0;
		  while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
		  {
			  int empHrs;
			  totalWorkingDays++;
			  double empCheck = Math.floor(Math.random() * 10) % 3;
			  int i = (int)empCheck;
			  switch(i) {
			  case EMP_FULL_TIME:
				  empHrs = 8;
				  break;
			  case EMP_PART_TIME:
				  empHrs = 4;
				  break;
			 default:
				 empHrs = 0;
			    }
	            totalEmpHrs = totalEmpHrs + empHrs;
	            totalEmpWage = EMP_RATE_PER_HOUR * totalEmpHrs;
		        System.out.println(" Day:" + totalWorkingDays + "Employee Hours:" +empHrs +"Employee Wage:" +totalEmpWage );
		  }
		  totalEmpWage = EMP_RATE_PER_HOUR * totalEmpHrs;
		  System.out.println( "Total Employee Wage:" +totalEmpWage);
	  
		  
	}
}	
