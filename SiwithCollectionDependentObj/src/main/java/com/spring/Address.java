package com.spring;

public class Address {

	private int dNo;
	private String village;
	private String district;

	public int getdNo() {
		return dNo;
	}

	public void setdNo(int dNo) {
		this.dNo = dNo;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String toString(){
		
		return dNo+"....."+village+"......"+district;
	}

}
