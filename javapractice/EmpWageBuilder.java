package javapractice;

public class EmpWageBuilder {
	public static void main(String[] args) {
		
		int isFullTime = 1;
		int isPartTime = 2;
		
		int EmpRatePerHr = 20;
		int empHrs =0;
		int empWage =0;
		
		double empCheck = Math.floor(Math.random() *10 %3);
		int c = (int)empCheck;
		switch(c)	{  
		case 1 :
		 
				empHrs = 8;
				empWage = empHrs * EmpRatePerHr;
		break;
		case 2:
		 
				empHrs = 4;
		 empWage = empHrs * EmpRatePerHr;
		 break;
		 default:
			empHrs = 0;
		}
		System.out.println(empWage);
		}
	}
		