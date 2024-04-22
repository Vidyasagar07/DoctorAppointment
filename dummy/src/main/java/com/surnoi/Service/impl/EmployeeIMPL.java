package com.surnoi.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.surnoi.Dto.EmployeeDTO;
import com.surnoi.Entity.Employee;
import com.surnoi.Repo.EmployeeRepo;
import com.surnoi.Service.EmployeeService;

@Service
public class EmployeeIMPL implements EmployeeService{

	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public String addEmployee(EmployeeDTO employeeDTO) {
		
		Employee employee = new Employee(
		
				employeeDTO.getId(),
				employeeDTO.getUsername(),
				employeeDTO.getEmail(),
				this.passwordEncoder.encode(employeeDTO.getPassword())	
		);
		
		employeeRepo.save(employee);
		return employee.getUsername();
	}

}
