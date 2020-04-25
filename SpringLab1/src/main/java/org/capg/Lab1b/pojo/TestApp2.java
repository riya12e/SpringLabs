package org.capg.Lab1b.pojo;

import org.capg.Lab1.pojo.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		AbstractApplicationContext context=
				new ClassPathXmlApplicationContext("employeebean.xml");
		
		Employee1 employee=(Employee1)context.getBean("emp1");
		//System.out.println(employee.getMaps());
		System.out.println("Employee Details--");
		System.out.println("------------------------------");
        System.out.println(employee);
		
		
	}    

	
}
