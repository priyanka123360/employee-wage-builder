package com.bridgelabz.demo;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		int present = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == present) {
			System.out.println("Employee is present");
		} else
			System.out.println("Employee is Absent");

	}

}
