package com.bridgelabz.demo;

public class EmployeeWage {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private int maxHoursPerMonth;
	private int totalEmpWage;

	EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void computeEmpWage() {

		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#:" + totalWorkingDays + " Emp Hr: " + empHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage for " + company + " Company: " + totalEmpWage);

	}

	@Override
	public String toString() {
		return "EmployeeWage [company=" + company + ", totalEmpWage=" + totalEmpWage + "]";
	}

	public static void main(String[] args) {

		EmployeeWage BigBazar = new EmployeeWage("BigBazar", 30, 50, 100);
		EmployeeWage ShreeMall = new EmployeeWage("ShreeMall", 40, 30, 120);
		BigBazar.computeEmpWage();
		System.out.println(BigBazar);
		ShreeMall.computeEmpWage();
		System.out.println(ShreeMall);

	}
}
