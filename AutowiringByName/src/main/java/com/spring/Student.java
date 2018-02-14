package com.spring;

public class Student {

	private int studentId;
	private String studentName;
	private Department department;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
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
