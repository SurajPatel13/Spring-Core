package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;

public class AddressMain {
public static void main(String[] args) {
	System.out.println("Main Start");
	
	ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("spring.xml");
	System.out.println("Application Context is created");
	Address address=applicationcontext.getBean("address",Address.class);
	System.out.println(address);
	System.out.println();
	Address address2=applicationcontext.getBean("address",Address.class);
	System.out.println(address2);
	System.out.println(address.hashCode());
	System.out.println(address2.hashCode());
	System.out.println("Main End");
	
}
}
