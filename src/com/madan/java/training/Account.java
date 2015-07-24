package com.madan.java.training;

public class Account {
	private String name;
	private long age;
	private String address;
	private String gender;
	private double balance;
	
	
	//method to set name in the object
	void setName(String name){
		this.name=name;
		}
	
	//method to get name from the object
	String getName(){
		return this.name;
	}
	
	//method to set age in the object
	public void setAge(long age){
		this.age=age;
	}
	public void print(){
		System.out.println(this.age);
	}


}
