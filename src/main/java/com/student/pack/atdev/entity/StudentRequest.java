package com.student.pack.atdev.entity;

public class StudentRequest {

	private String studentName;
	private int studentAge;
	private String department;
	private String address;
	private long mobileNo;
	
	
	
	@Override
	public String toString() {
		return "StudentRequest [studentName=" + studentName + ", studentAge=" + studentAge + ", department="
				+ department + ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
}
