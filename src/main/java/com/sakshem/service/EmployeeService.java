package com.sakshem.service;


import com.sakshem.entity.Employee;

import java.util.List;

public interface EmployeeService {
	public List<Employee> findAll(String keyword);
	public Employee findById(int theId);
	public void save(Employee theEmployee);
	public void deleteById(int theId);
}
