package com.part12;

public enum Sex 
{
	 MALE("M"),FEMALE("F");
	
	private String sex;
	private Sex(String sex) {this.sex=sex;}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
 
}
