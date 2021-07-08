package it.vscalcione.springboot.employeemanager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import it.vscalcione.springboot.employeemanager.model.Employee;

@Service
public interface EmployeeService {
	
	Employee addEmployee(Employee employee);
	List<Employee> findAllEmployees();
	Employee updateEmployee(Employee employee);
	Employee findEmployeeById(Long id);
	void deleteEmployee(Long id);
	
}
