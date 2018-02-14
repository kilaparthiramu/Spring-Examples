package com.spring;

public class Student {

	private String studentId;
	private String studentName;
	private Department department;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void display(){
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(department);
	}

}
