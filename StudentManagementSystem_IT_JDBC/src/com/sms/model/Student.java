package com.sms.model;

public class Student {
	
	private int studentid;
	private String studentName;
	private String email;
	private String department;
	private String phoneNumber;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentid, String studentName, String email, String department, String phoneNumber) {
		
		this.studentid = studentid;
		this.studentName = studentName;
		this.email = email;
		this.department = department;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentName=" + studentName + ", email=" + email + ", department="
				+ department + ", phoneNumber=" + phoneNumber + "]";
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
