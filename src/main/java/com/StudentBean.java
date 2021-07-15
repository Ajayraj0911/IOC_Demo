package com;

import java.util.List;
import java.util.Map;
import java.util.Date;

public class StudentBean {

	private int sId;
	private String sName;
	private Date sBirthDate;
	private StudentDetail detail;
	private List<String> sHobbies; 
	private Map<Integer, String> sRanks;
	
	public StudentDetail getDetail() {
		return detail;
	}
	public void setDetail(StudentDetail detail) {
		this.detail = detail;
	}
	public Date getsBirthDate() {
		return sBirthDate;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	void display() {
		System.out.print("id = "+sId+"name = "+sName+"Date ="+sBirthDate+"-"+detail.getsCityName()+"-"+detail.getsCitypincode());
	
		for(String s : sHobbies) {
			System.out.println(s);
		}
		
		System.out.print(this.sRanks);
	}

	public void setsBirthDate(Date sBirthDate) {
		this.sBirthDate = sBirthDate;
	}
	public List<String> getsHobbies() {
		return sHobbies;
	}
	public void setsHobbies(List<String> sHobbies) {
		this.sHobbies = sHobbies;
	}
	public Map<Integer, String> getsRanks() {
		return sRanks;
	}
	public void setsRanks(Map<Integer, String> sRanks) {
		this.sRanks = sRanks;
	}
}
