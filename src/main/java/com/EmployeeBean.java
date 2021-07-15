package com;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//convert this class to spring bean class..
//4 annotation are there...
//stereo type annotation
//@component
//@service
//@repository
//@controller 
//component -->generic annotation
//service -->business logic
//repository -->dao -->spring ->database pre compiled...
//controller -->class ->spring servlet -->spring mvc 

@SuppressWarnings("unused")
@Component("employee")
//@Service("employee")
//@Repository("employee")
//@Scope("prototype")
public class EmployeeBean {

	@Value("101")
	private int eId;
	@Autowired
	private EmployeeDetail employeeDetail;
	
	@Autowired
	private Date date;
	public void display() {
		
		System.out.println("id ="+eId+"-"+employeeDetail.getEmpCity());
		System.out.println("Date= "+date.getDate());
	}
	@PostConstruct
	public void initmethod() {
		
		System.out.println("init method...");
	}
	@PreDestroy
	public void destroymethod() {
		
		System.out.println("destroy method");
	}
}
