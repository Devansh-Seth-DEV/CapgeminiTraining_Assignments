package com.employee.service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.employee.model.Department;
import com.employee.model.Employee;
import com.employee.repository.EmployeeDataSeeder;

public class EmployeeQueryService {
	private final List<Employee> employees = EmployeeDataSeeder.getEmployees();
	private final List<Department> departments = EmployeeDataSeeder.getDepartments();
	
	/**
	 * @question 1
	 * @brief Find out the sum of salary of all employees.
	 */
	public void salarySumEmployee() {
		Double totalSalary = employees.stream()
									  .mapToDouble(e -> e.getSalary())
									  .sum();
		
		System.out.println(totalSalary);
	}

	/**
	 * @question 2
	 * @brief List out department names and count of employees in each department. 
	 */
	public void employeesInEachDepartment() {
		departments.stream()
				   .forEach(d -> {
						long count = employees.stream()
											  // filtering null from the stream and
											  // given objects of department
											  .filter(e -> e.getDepartment() != null &&
													  e.getDepartment().equals(d)) 
											  .count();

						String message = "Total Employee from Department : %s is : %s"
										 .formatted(d.getDepartmentId(), count);
						System.out.println(message);
				   });
	}

	/**
	 * @question 3
	 * @brief Find out the senior most employee of an organization.
	 */
	public void  seniorMost() {
		Optional<Employee> e = employees.stream()
										.min((a, b) -> 
											a.getHireDate()
											 .compareTo( b.getHireDate() )
										 );

		String fmtEmp = e.toString();
		fmtEmp = fmtEmp.substring(9, fmtEmp.length()-1);
		System.out.println("employee: { %s }".formatted(fmtEmp));
	}
	
	/**
	 * @question 4
	 * @brief List employee name and duration of their service in months and days.
	 */
	public void getServicePeriod() {
		LocalDate d = LocalDate.now();

		employees.stream()
				 .forEach(e->  {
					LocalDate hire = e.getHireDate();

					int durationMonth, durationYear, durationDays;
					durationYear = d.getYear() - hire.getYear() ;
					durationMonth = Math.abs(hire.getMonthValue() - d.getMonthValue());

					// non negative value for month and days since it can be greater or small
					durationDays = Math.abs(hire.getDayOfMonth() - d.getDayOfMonth());

					String message = "Employee %s is working here for %s-Days %s-Months %s-Years."
									 .formatted(
										e.getFirstName(),
									    durationDays,
									    durationMonth,
									    durationYear
									 );

					System.out.println(message);
				 });
	}
	
	/**
	 * @question 5
	 * @brief Find out employees without department.
	 */
	public void employeeWithoutDepartment() {
		employees.stream()
				 .filter(e -> e.getDepartment() == null)
				 .forEach(e ->
				 	System.out.println("employee: { %s }".formatted(e))
				  );
	}

	/**
	 * @question 6
	 * @brief Find out department without employees.
	 */
	public void departmentWithoutEmployee() {
		departments.stream()
				   .forEach(d -> {
					   boolean isAnyMatch  = employees.stream()
													  .anyMatch(e ->
														  e.getDepartment() != null &&
														  e.getDepartment()
														   .getDepartmentId() == d.getDepartmentId()
													   );

					   if(!isAnyMatch) {
						   System.out.println("department: { %s }".formatted(d));
					   }
				   });
	}
	
	/**
	 * @question 7
	 * @brief Find departments with highest count of employees.
	 */
	public void departmentWithHighestEmployeeCount() {
		Department maxDepartment = departments.stream()
											  .max(
													Comparator.comparingLong(d -> 
														employees.stream()
																 .filter(e ->
																	e.getDepartment() != null &&
																	e.getDepartment()
																	 .getDepartmentId() == d.getDepartmentId()
																 )
																 .count()
													)
											  )
											  .orElse(null);
		
		if (maxDepartment == null) return;
		
		long count = employees.stream()
							  .filter(e ->
							  	e.getDepartment() != null &&
							  	e.getDepartment()
							  	 .getDepartmentId() == maxDepartment.getDepartmentId()
							  )
							  .count();
		System.out.println("department: { %s, employees_count: %s }"
						   .formatted(maxDepartment, count));
	}
}
