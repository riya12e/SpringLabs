package org.capg.Lab1c.pojo;

import org.capg.Lab1b.pojo.Employee1;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		AbstractApplicationContext context=
				new ClassPathXmlApplicationContext("sbubean.xml");
		
		SBU sbu=(SBU)context.getBean("sbu");
		System.out.println(sbu);
		
		
	}    
		
	}


