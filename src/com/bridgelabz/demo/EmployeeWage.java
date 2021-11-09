package com.bridgelabz.demo;

public class EmployeeWage {
	public static final int full_time = 1;
	public static final int part_time = 2;
	public static final int emp_rate_per_hrs = 20;
	public static final int num_of_working_days = 20;
	public static final int hrs_in_month = 100;

	public static int computeEmpWage() {

		int emp_hrs = 0;
		int total_emp_hrs = 0;
		int total_working_days = 0;
		int emp_wage = 0;
		while (total_emp_hrs <= hrs_in_month && total_working_days < num_of_working_days) {
			total_working_days++;

			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case full_time:
				emp_hrs = 8;
				break;
			case part_time:
				emp_hrs = 4;
				break;
			default:
				emp_hrs = 0;
			}

			total_emp_hrs = total_emp_hrs + emp_wage;
			System.out.println("Day# :" + total_working_days + "Emp Hr :" + emp_wage);
		}
		emp_wage = emp_hrs * emp_rate_per_hrs;
		System.out.println("Total Emp Wage :" + emp_wage);
		return emp_wage;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		EmployeeWage.computeEmpWage();
	}
}
