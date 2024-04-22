package com.surnoi.Login.Controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.surnoi.Login.Entity.LoginEmployee;
import com.surnoi.Login.Repo.LoginRepo;

@RestController
public class LoginController {
	
	@Autowired
	LoginRepo loginrepo;
	
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/api/loginEmployee/{id}")
	public ResponseEntity<LoginEmployee> getEmployee(@PathVariable long id ) {
		Optional<LoginEmployee> employee= loginrepo.findById(id);
		if (employee.isPresent()) {
			return new ResponseEntity<>(employee.get(), HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
		
}