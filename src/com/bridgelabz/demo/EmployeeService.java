package com.bridgelabz.demo;

public interface EmployeeService {

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfworkingDays, int maxHoursPerMonth);

	public void computeEmpWage();

	public int getTotalWage(String company);
}
