package com.RestAPI.model;

public class CloudVendor {
	
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private String vendorMobile;
	
	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorMobile) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorMobile = vendorMobile;
	}

	public CloudVendor() {
		super();
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public String getVendorMobile() {
		return vendorMobile;
	}

	public void setVendorMobile(String vendorMobile) {
		this.vendorMobile = vendorMobile;
	}
	
}
