package com.example.DoctorAppointment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DoctorAppointment.model.DoctorAppointment;
import com.example.DoctorAppointment.repo.DoctorRepository;



@RestController
@RequestMapping("/api/HospitalAppointment/")
public class AppointmentController {
	
	
	@Autowired
	DoctorRepository doctorRepository;
	
	@CrossOrigin("http://demo1angular.s3-website.ap-south-1.amazonaws.com/")
	@PostMapping("/AddNewAppointment")
	public ResponseEntity<DoctorAppointment> bookAppointment(@RequestBody DoctorAppointment doctorAppointment){
	return new ResponseEntity<>(doctorRepository.save(doctorAppointment), HttpStatus.CREATED);
	
	}
	
	@CrossOrigin("http://demo1angular.s3-website.ap-south-1.amazonaws.com/")
	@GetMapping("/getAppointments")
	public ResponseEntity<List<DoctorAppointment>> getAppointments(){
	return new ResponseEntity<>(doctorRepository.findAll(), HttpStatus.OK);
	
	}

}
