package com.tanvir.spring.mavenHellowWorld;

public class Patient {
	private int id;
	private String name;
	private int nationalId;
	private Address address;

	public Patient() {

	}

	public Patient(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
	
	public static Patient getInstance(int id, String name){    ///Factory method , static mandatory
		System.out.println("Return from factory method");
		return new Patient(id,name);
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", nationalId="
				+ nationalId + ", address=" + address + "]";
	}

	public void Speak() {
		System.out.println("Help me!!");
	}
	
	
	
	public void onCreate(){
		System.out.println("Patient Created: "+ this);
	}
	public void onDestroy(){
		System.out.println("Patient destroyed");
	}
}
