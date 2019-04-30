package com.entity;
import java.util.List;

import com.util.VeDate;
public class ElectronicMD {
	private String dzblid = "D" + VeDate.getStringId();
	private String ano;
	private String drugsname;
	private String usersid;
	private String doctersid;
	private String operationrecords;
	private String nursingrecords;
	private String bloodtest;
	//private String ct;
	private String allergydrugs;
	private String addtime;
	private String hospitalization_date;
	private String discharge_date;
	private String  ward;
	private String advice;
	private String image;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDzblid() {
		return dzblid;
	}
	public void setDzblid(String dzblid) {
		this.dzblid = dzblid;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getDrugsname() {
		return drugsname;
	}
	public void setDrugsname(String drugsname) {
		this.drugsname = drugsname;
	}
	public String getUsersid() {
		return usersid;
	}
	public void setUsersid(String usersid) {
		this.usersid = usersid;
	}
	public String getDoctersid() {
		return doctersid;
	}
	public void setDoctersid(String doctersid) {
		this.doctersid = doctersid;
	}
	public String getOperationrecords() {
		return operationrecords;
	}
	public void setOperationrecords(String operationrecords) {
		this.operationrecords = operationrecords;
	}
	public String getNursingrecords() {
		return nursingrecords;
	}
	public void setNursingrecords(String nursingrecords) {
		this.nursingrecords = nursingrecords;
	}
	public String getBloodtest() {
		return bloodtest;
	}
	public void setBloodtest(String bloodtest) {
		this.bloodtest = bloodtest;
	}
//	public String getCt() {
//		return ct;
//	}
//	public void setCt(String ct) {
//		this.ct = ct;
//	}
	public String getAllergydrugs() {
		return allergydrugs;
	}
	public void setAllergydrugs(String allergydrugs) {
		this.allergydrugs = allergydrugs;
	}
	public String getAddtime() {
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
	public String getHospitalization_date() {
		return hospitalization_date;
	}
	public void setHospitalization_date(String hospitalization_date) {
		this.hospitalization_date = hospitalization_date;
	}
	public String getDischarge_date() {
		return discharge_date;
	}
	public void setDischarge_date(String discharge_date) {
		this.discharge_date = discharge_date;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}

	
}
