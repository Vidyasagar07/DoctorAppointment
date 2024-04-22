package surnoi.login.EmployeeLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import surnoi.login.EmployeeLogin.data.LeaveAction;
import surnoi.login.EmployeeLogin.data.RequestLeave;
import surnoi.login.EmployeeLogin.repo.LeaveActionRepo;
import surnoi.login.EmployeeLogin.repo.LeaveRepo;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(allowedHeaders = "*",origins ="*")
@RequestMapping("/leave")
public class LeaveController {
    @Autowired
    LeaveRepo leaveRepo;
    @Autowired
    LeaveActionRepo leaveActionRepo;

    @PostMapping("/api/requestLeave")
    public ResponseEntity<RequestLeave> saveRequest(@RequestBody RequestLeave requestLeave){
        return new ResponseEntity<>(leaveRepo.save(requestLeave), HttpStatus.CREATED);
    }

    @GetMapping("/api/employees")
    public ResponseEntity<List<RequestLeave>> getEmployees(){
        return new ResponseEntity<>(leaveRepo.findAll(), HttpStatus.OK);
    }
    @PostMapping("/api/LeaveAction")
    public ResponseEntity<LeaveAction> saveRequest(@RequestBody LeaveAction leaveaction){
        return new ResponseEntity<>(leaveActionRepo.save(leaveaction), HttpStatus.CREATED);
    }
    @GetMapping("/api/LeaveAction/{id}")
    public ResponseEntity<LeaveAction> getEmployee(@PathVariable long id ) {
        Optional<LeaveAction> employee= leaveActionRepo.findById(id);
        if (employee.isPresent()) {
            return new ResponseEntity<>(employee.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}