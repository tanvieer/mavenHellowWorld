package com.tanvir.spring.mavenHellowWorld;

public class Address {
	private String street;
	private String postCode;
	public Address(String street, String postCode) {
		this.street = street;
		this.postCode = postCode;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", postCode=" + postCode + "]";
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public void init(){
		System.out.println("Address initialized: "+ this);
	}
	public void destroy(){
		System.out.println("Address Destroyed");
	}
}
