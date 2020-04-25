package org.capg.Lab1b.pojo;

public class Employee1 {
    
	private int age;
	private int employeeId;
	private String employeeName;
	private double salary;
	private SBU buisinessUnit;
	private int empAge;
	
	
	public Employee1() {
		System.out.println("Employee Class - no args ");
	}

	public Employee1(int empAge,int employeeId, String employeeName, double salary, SBU buisinessUnit) {
		super();
		this.empAge=empAge;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.buisinessUnit = buisinessUnit;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
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

	public SBU getBuisinessUnit() {
		return buisinessUnit;
	}

	public void setBuisinessUnit(SBU buisinessUnit) {
		this.buisinessUnit = buisinessUnit;
	}
	public void getSbuDetails() {
		
	}
	
	@Override
	public String toString() {
		return "Employee [empAge="+empAge+" employeeId=" + employeeId + ", employeeName=" + employeeName
				+ ", salary=" + salary + ", sbu details=" + buisinessUnit + "]";
	}
	

}
