package org.capg.Lab1.pojo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		AbstractApplicationContext context=
				new ClassPathXmlApplicationContext("mybean.xml");
		
		Employee employee=(Employee)context.getBean("emp");
		//System.out.println(employee.getMaps());
		System.out.println("Employee Details--");
		System.out.println("------------------------------");
        employee.display();
		
		
	}    

}
