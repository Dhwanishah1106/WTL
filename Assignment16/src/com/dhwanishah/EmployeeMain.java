package com.dhwanishah;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		//1.Configure spring container
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2. get bean
		//Employee employee = context.getBean("employee", Employee.class);
		Employee employee = factory.getBean("employee", Employee.class);
		
		//3. call pojo
		System.out.println(employee);
		
		//Employee employee2 = context.getBean("employee", Employee.class);
		Employee employee2 = factory.getBean("employee", Employee.class);
		
		if(employee == employee2) {
			System.out.println("It is singleton");
		}
		
		else {
			System.out.println("It is prototype");
		}
		//4. close context - XmlApplicationContext
		//context.close();

	}

}
