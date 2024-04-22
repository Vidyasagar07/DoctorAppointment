package com.surnoi.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.surnoi.Dto.EmployeeDTO;

@Service
@Component
public interface EmployeeService {

	String addEmployee(EmployeeDTO employeeDTO);

}
