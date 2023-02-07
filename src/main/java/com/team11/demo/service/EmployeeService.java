package com.team11.demo.service;

import java.io.FileNotFoundException;
import java.util.List;

import com.team11.demo.model.Employee;

import net.sf.jasperreports.engine.JRException;

public interface EmployeeService {	
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(int id);
	void deleteEmployeeById(int id);
	String exportReport(String format) throws FileNotFoundException, JRException;
}
