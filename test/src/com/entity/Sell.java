package com.entity;

import com.util.VeDate;

public class Sell {
	private String sellid = "S" + VeDate.getStringId();
	private String sno;
	private String doctorid;
	private String drugsid;
	private String num;
	private String total;
	private String addtime;
	private String realname;
	private String drugsname;

	public String getSellid() {
		return sellid;
	}

	public void setSellid(String sellid) {
		this.sellid = sellid;
	}

	public String getSno() {
		return this.sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getDoctorid() {
		return this.doctorid;
	}

	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}

	public String getDrugsid() {
		return this.drugsid;
	}

	public void setDrugsid(String drugsid) {
		this.drugsid = drugsid;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getAddtime() {
		return this.addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getDrugsname() {
		return this.drugsname;
	}

	public void setDrugsname(String drugsname) {
		this.drugsname = drugsname;
	}
}
