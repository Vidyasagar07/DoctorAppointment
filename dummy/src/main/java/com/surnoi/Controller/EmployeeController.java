package com.surnoi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surnoi.Dto.EmployeeDTO;
import com.surnoi.Service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	
	
	public String saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
		String id = employeeService.addEmployee(employeeDTO);
		return id;
	}

}
