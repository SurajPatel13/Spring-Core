package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeMain {
public static void main(String[] args) {
	System.out.println("Main Start");
	ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("spring.xml");
    EmployeeServiceInterface employeeserviceinterface = applicationcontext.getBean("employeeService",EmployeeService.class);
    
    employeeserviceinterface.addEmployee();
	
    System.out.println("Main End");
}
}
