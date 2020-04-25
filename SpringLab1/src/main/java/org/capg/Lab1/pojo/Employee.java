package org.capg.Lab1.pojo;

public class Employee 
{
	private int employeeId;
	private String employeeName;
	private double salary;
	private String buisinessUnit;
	private int age;
	
	public Employee() {
		System.out.println("Employee Class - no args ");
	}

	public Employee(int employeeId, String employeeName, double salary, String buisinessUnit, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.buisinessUnit = buisinessUnit;
		this.age = age;
	}

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

	public String getBuisinessUnit() {
		return buisinessUnit;
	}

	public void setBuisinessUnit(String buisinessUnit) {
		this.buisinessUnit = buisinessUnit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void display(){  
	    System.out.println("Employee ID: "+employeeId);
	    System.out.println("Employee Name: "+employeeName); 
	    System.out.println("Employee Salary: "+salary); 
	    System.out.println("Employee BU: "+buisinessUnit);
	    System.out.println("Employee Age: "+age); 
	}  

}
	
	