package com.java.emp.wage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee\r\n" + "Wage Computation\r\n" + "Program on Master Branch");
		
		Random random  = new Random();
		int randomNum = random.nextInt(3);
	
		int wagePerHour = 20;
		int fullDayHour = 8;
		int halfDayHour = 4;
		int dailyWage = 0;
		
		
		if(randomNum == 1)
		{
			System.out.println("Employee worked fulltime");
			dailyWage = fullDayHour * wagePerHour;
		}
		else if(randomNum ==  2)
		{
			System.out.println("Employee worked parttime");
			dailyWage = halfDayHour * wagePerHour;
		}
		else
			System.out.println("Employee is absent");
		
		System.out.println("Daily wage: "+dailyWage);
	
	}

}
