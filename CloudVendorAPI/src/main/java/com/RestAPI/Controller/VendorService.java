package com.RestAPI.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestAPI.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class VendorService {
	
	CloudVendor cloudVendor;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) {
		return cloudVendor; 
		//("A1", "VidyaSagar", "Hyderabad", "123456")
	}
	
	@PostMapping
	public String saveCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {
		this.cloudVendor= cloudvendor;
		return "Cloud vendor Created Successfully";
		
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {
		this.cloudVendor= cloudvendor;
		return "Cloud vendor Updated Successfully";
		
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) {
		this.cloudVendor= null;
		return "Cloud vendor Deleted Successfully";
		
	}
}
