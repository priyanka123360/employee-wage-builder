package com.bridgelabz.demo;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		int full_time = 1;
		int part_time = 2;
		int emp_rate_per_hrs = 20;
		int emp_wage = 0;
		int emp_hrs = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == full_time) 
			emp_hrs = 8;
					
		else 
			if (empCheck == part_time) 
				emp_hrs = 4;
				
			else 
				 emp_hrs = 0;
			
		
	    	emp_wage = emp_hrs * emp_rate_per_hrs ; 
			System.out.println("Employee Wage :" + emp_wage );
			

	}

}
