package com.java.emp.wage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee\r\n" + "Wage Computation\r\n" + "Program on Master Branch");
		
		Random random  = new Random();
		int randomNum = random.nextInt(2);
		
		if(randomNum == 1)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	
	}

}
