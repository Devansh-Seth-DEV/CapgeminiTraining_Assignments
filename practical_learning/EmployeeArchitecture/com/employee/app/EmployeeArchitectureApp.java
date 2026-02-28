package com.employee.app;

import com.employee.service.EmployeeQueryService;

public class EmployeeArchitectureApp {
	public static final EmployeeQueryService service;
	
	static {
		service = new EmployeeQueryService();
	}

	public static void main(String[] args) {
		System.out.println("1. Find out the sum of salary of all employees.");
		service.salarySumEmployee();

		System.out.println("\n2. List out department names and count of employees in each department.");
		service.employeesInEachDepartment();
		
		System.out.println("\n3 Find out the senior most employee of an organization.");
		service.seniorMost();
		
		System.out.println("\n4 List employee name and duration of their service in months and days.");
		service.getServicePeriod();
		
		System.out.println("\n5 Find out employees without department.");
		service.employeeWithoutDepartment();
		
		System.out.println("\n6 Find out department without employees.");
		service.departmentWithoutEmployee();
		
		System.out.println("\n7 Find departments with highest count of employees.");
		service.departmentWithHighestEmployeeCount();
	}
}
