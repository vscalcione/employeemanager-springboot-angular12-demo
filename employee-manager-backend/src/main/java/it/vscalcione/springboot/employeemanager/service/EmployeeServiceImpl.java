package it.vscalcione.springboot.employeemanager.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import it.vscalcione.springboot.employeemanager.exception.UserNotFoundException;
import it.vscalcione.springboot.employeemanager.model.Employee;
import it.vscalcione.springboot.employeemanager.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee findEmployeeById(Long id) {
		return employeeRepository.findEmployeeById(id)
				.orElseThrow(() -> new UserNotFoundException("User with id: " + id + " not found "));
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteEmployeeById(id);
	}
	

}
