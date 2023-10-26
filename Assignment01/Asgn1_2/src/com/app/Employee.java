package com.app;

import java.util.Scanner;

public class Employee {

	private int empid;
	private String name;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee ID:");
		empid = sc.nextInt();
		
		System.out.print("Enter Employee Name:");
		name = sc.next();
		
		System.out.print("Enter Employee Salary:");
		salary = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	
}
