package org.capg.Lab1d.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.capg.Lab1d.pojo.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
  
	public static void main(String args[]) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int id=ob.nextInt();
		
		AbstractApplicationContext context=
				new ClassPathXmlApplicationContext("clientbean.xml");
		
		EmployeeList empList=(EmployeeList)context.getBean("emplist");
		System.out.println("Employee Details--");
		System.out.println("------------------------------");
		
		for(int i=0;i<empList.getEmpList().size();i++) {
			if(empList.getEmpList().get(i).getEmployeeId()==id) {
				empList.getEmpList().get(i).display();
			}
		   
	      }
		
    
		
	}
}
