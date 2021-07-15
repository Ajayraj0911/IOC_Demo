package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import config.ConfigurationClass;

@SuppressWarnings("unused")
public class Client3 {

	public static void main(String[] args) {
		
		//ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/SpringAnnotation.xml");
		AnnotationConfigApplicationContext ctx = new  AnnotationConfigApplicationContext(ConfigurationClass.class);
		EmployeeBean emp = ctx.getBean("employee",EmployeeBean.class);
		EmployeeBean emp1 = ctx.getBean("employee",EmployeeBean.class);
		System.out.println(emp);
		System.out.println(emp1);
		emp.display();
	
		ctx.close();
	}
}
