package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
					CustomerService cus =(CustomerService)context.getBean("customer");
					cus.setMessage("hello this is ");
					System.out.println(cus.getMessage());
					
					CustomerService cus1 =(CustomerService)context.getBean("customer");
					System.out.println(cus1.getMessage());
					
					System.out.println(cus==cus1);
	}

}
