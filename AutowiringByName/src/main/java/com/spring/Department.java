package com.spring;

public class Department {

	private int deptNo;
	private String deptName;

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public String toString(){
		return deptNo+"............."+deptName;
		
	}

}
