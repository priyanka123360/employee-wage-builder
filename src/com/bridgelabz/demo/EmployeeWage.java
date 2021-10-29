package com.bridgelabz.demo;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		int present = 1;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == present) {
			int emp_rate_per_hrs = 20;
			int emp_hrs = 8;
			int emp_wage = 0;
			emp_wage = emp_rate_per_hrs * emp_hrs; 
			System.out.println("Employee Wage :" + emp_wage );
			
		} else
			
			System.out.println("Employee Wage is zero");

	}

}
