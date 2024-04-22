package surnoi.login.EmployeeLogin.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import surnoi.login.EmployeeLogin.data.Employee;
import surnoi.login.EmployeeLogin.exception.UserNotFoundException;
import surnoi.login.EmployeeLogin.repo.EmployeeRepo;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }


    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }


//    public Employee authenticateEmployee(String employeeUsername, String employeePassword) {
//        return employeeRepo.findByEmployeeUsernameAndEmployeePassword(employeeUsername, employeePassword)
//                .orElseThrow(() -> new UserNotFoundException("Invalid username or password"));
//    }
}



