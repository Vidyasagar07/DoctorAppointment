package com.surnoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surnoi.model.RequestLeave;
import com.surnoi.repository.LeaveRepo;


@RestController
public class LeaveController {
	
	@Autowired
	LeaveRepo leaveRepo;
	
	@CrossOrigin("http://localhost:4200/")
	@PostMapping("/api/requestLeave")
	public ResponseEntity<RequestLeave> saveRequest(@RequestBody RequestLeave requestLeave){
	return new ResponseEntity<>(leaveRepo.save(requestLeave), HttpStatus.CREATED);
	
	}

	
	@GetMapping("/api/employees")
	public ResponseEntity<List<RequestLeave>> getEmployeesSortedByIdDescending(){
	Sort sort= Sort.by(Sort.Direction.DESC, "id");
	return new ResponseEntity<>(leaveRepo.findAll(sort), HttpStatus.OK);
	
	}
	
}
