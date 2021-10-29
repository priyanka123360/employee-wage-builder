package com.bridgelabz.demo;

public class EmployeeWage {
	public static final int full_time = 1;
	public static final int part_time = 2;
	public static final int emp_rate_per_hrs = 20;
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		int emp_wage = 0;
		int emp_hrs = 0;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck ) {
		case full_time:
		    emp_hrs = 8;
			break;		
		case  part_time :
			emp_hrs = 4;
			break;
			default:
				 emp_hrs = 0;
		}
		
	    	emp_wage = emp_hrs * emp_rate_per_hrs ; 
			System.out.println("Employee Wage :" + emp_wage );
			

	}

}
