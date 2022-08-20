package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class DependencyMain {
public static void main(String[] args) {
	System.out.println("Main Start");
//	System.out.println("Creating the Address Object and Calling Set method");
//	
//	Address address = new Address();
//	
//	address.setAddressId(13);
//	address.setBuildingName("ShantiNagr");
//	address.setCity("mumbai");
//	address.setHouseNumber("240");
//	address.setPin("400075");
//	address.setStreet("Naidu Colony");
//	System.out.println(address);
//	System.out.println("-----------------");
//	System.out.println("Creating the Employee Object and Calling Set method");
//	
//	Employee employee= new Employee();
//	
//	employee.setEmployeeId(1998);
//	employee.setName("Suraj Patel");
//	employee.setSalary(100000);
//	employee.setHomeAddress(address);
//	System.out.println(employee);
//	

	Address address=new Address(06,"242","ShantiNagar","Ramabai","Mumbai", "400075");
	Employee employee = new Employee(101,"xyz", 9999,address);
	System.out.println(employee);
	System.out.println("Main End");
	
	
}
}
