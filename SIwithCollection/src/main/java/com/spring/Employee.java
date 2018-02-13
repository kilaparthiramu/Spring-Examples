package com.spring;

import java.util.Iterator;
import java.util.List;

public class Employee {

	private int empId;
	private String empName;
	private List<String> designations;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getDesignations() {
		return designations;
	}

	public void setDesignations(List<String> designations) {
		this.designations = designations;
	}
	
	public void display(){
		System.out.println(empId);
		System.out.println(empName);
		Iterator<String> itr = designations.iterator();
		while(itr.hasNext()){
			String designations = (String)itr.next();
			System.out.println(designations);
		}
	}
}
