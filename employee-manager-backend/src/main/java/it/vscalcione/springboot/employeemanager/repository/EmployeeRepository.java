package it.vscalcione.springboot.employeemanager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.vscalcione.springboot.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	void deleteEmployeeById(Long id);
	Optional<Employee> findEmployeeById(Long id);

}
