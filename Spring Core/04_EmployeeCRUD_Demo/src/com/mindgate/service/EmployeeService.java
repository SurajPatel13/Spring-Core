package com.mindgate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mindgate.repository.EmployeeRepositoryInterface;

@Service
public class EmployeeService implements EmployeeServiceInterface {
	@Autowired
	private EmployeeRepositoryInterface employeerepositoryinterface;

	public EmployeeRepositoryInterface getEmployeerepositoryinterface() {
		return employeerepositoryinterface;
	}

	public void setEmployeerepositoryinterface(EmployeeRepositoryInterface employeerepositoryinterface) {
		this.employeerepositoryinterface = employeerepositoryinterface;
	}

	@Override
	public boolean addEmployee() {

		System.out.println("EmployeeService addEmployee() Method");
		return employeerepositoryinterface.addEmployee();
	}

}
