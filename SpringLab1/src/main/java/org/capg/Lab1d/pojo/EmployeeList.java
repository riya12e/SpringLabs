package org.capg.Lab1d.pojo;

import java.util.List;

import org.capg.Lab1d.pojo.Employee;

public class EmployeeList {
   private List<Employee> empList;
   
   public EmployeeList() {
	   
   }

   public EmployeeList(List<Employee> empList) {
	super();
	this.empList = empList;
  }

   public List<Employee> getEmpList() {
	return empList;
  }

   public void setEmpList(List<Employee> empList) {
	this.empList = empList;
  }
   
   
   
   
}
