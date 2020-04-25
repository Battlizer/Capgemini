package com;


public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private int age;
	private SBU businessUnit;
		
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public SBU getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}

	public void printEmployeeDetails() {
		System.out.println("Employee Details");
		System.out.println("----------------------");
		System.out.println("Employee [empAge="+age+", empId="+employeeId+", empName="+employeeName+", empSalary="+salary);
		System.out.println("sbu details=SBU [sbuCode="+businessUnit.getSbuId()+", subHhead="+businessUnit.getSbuHead()+", subName="+businessUnit.getSbuName()+"]]");
	}
}
