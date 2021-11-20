package com.bridgelabz.demo;

import java.util.ArrayList;

public class EmployeeWage implements EmployeeService {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private ArrayList<CompanyEmployeeWage> companyEmpWageList;

	public EmployeeWage() {
		companyEmpWageList = new ArrayList<CompanyEmployeeWage>();
	}

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		CompanyEmployeeWage companyEmpWage = new CompanyEmployeeWage(company, empRatePerHour, numOfWorkingDays,
				maxHoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
	}

	public void computeEmpWage() {
		for (int i = 0; i < companyEmpWageList.size(); i++) {

			CompanyEmployeeWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	

	private int computeEmpWage(CompanyEmployeeWage companyEmpWage) {
		// variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= companyEmpWage.getMaxHoursPerMonth()
				&& totalWorkingDays < companyEmpWage.getNumOfWorkingDays()) {
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
			System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
		}
		return totalEmpHrs * companyEmpWage.getEmpRatePerHour();
	}
	public static void main(String[] args) {
		EmployeeWage employeeWage = new EmployeeWage();
		employeeWage.addCompanyEmpWage("BigBazar", 30, 50, 100);
		employeeWage.addCompanyEmpWage("ShreeMall", 40, 30, 120);
		employeeWage.computeEmpWage();
	}
}
	