package surnoi.login.EmployeeLogin;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import surnoi.login.EmployeeLogin.data.Employee;
import surnoi.login.EmployeeLogin.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin("http://localhost:4200/")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Employee>>getAllEmployees() {
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }


@GetMapping("get/{id}")
public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
    Employee employee = employeeService.findEmployeeById(id);
    return new ResponseEntity<>(employee, HttpStatus.OK);
}



    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee newemployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newemployee,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee updatedEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


//    @PostMapping("/login")
//    public ResponseEntity<Employee> employeeLogin(@RequestParam String employeeUsername, @RequestParam String employeePassword) {
//        Employee employee = employeeService.authenticateEmployee(employeeUsername, employeePassword);
//        return new ResponseEntity<>(employee, HttpStatus.OK);
//    }


//    @PostMapping("/login")
//    public ResponseEntity<Employee> employeeLogin(@RequestParam String employeeUsername, @RequestParam String employeePassword) {
//        Employee employee = employeeService.authenticateEmployee(employeeUsername, employeePassword);
//        if (employee != null) {
//            return new ResponseEntity<>(employee, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//        }
//    }

}
