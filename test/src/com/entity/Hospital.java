package com.entity;

import com.util.VeDate;

public class Hospital {
	private String hospitalid = "H" + VeDate.getStringId();
	private String hospitalname;
	private String address;
	private String contact;
	private String memo;

	public String getHospitalid() {
		return hospitalid;
	}

	public void setHospitalid(String hospitalid) {
		this.hospitalid = hospitalid;
	}

	public String getHospitalname() {
		return this.hospitalname;
	}

	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
}
