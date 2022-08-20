package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Address {
private int employeeId;
private String name;
private double salary;

public Address() {
	System.out.println("Default Constructor of Address Class");
}

public Address(int employeeId, String name, double salary) {
	super();
	this.employeeId = employeeId;
	this.name = name;
	this.salary = salary;
}

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Address [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
}



}
