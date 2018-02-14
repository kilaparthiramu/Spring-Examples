package com.spring;

import java.util.Iterator;
import java.util.List;

public class Employee {

	private int empId;
	private String empName;
	private List<Address> address;

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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	public void display(){
		System.out.println(empId);
		System.out.println(empName);
		Iterator<Address> itr = address.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
	}

}
