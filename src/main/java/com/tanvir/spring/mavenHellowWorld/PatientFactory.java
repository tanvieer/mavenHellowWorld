package com.tanvir.spring.mavenHellowWorld;

public class PatientFactory {
	public Patient createPatient(int id, String name){  // static mandatory na
		System.out.println("Using factory class to create patient");
		return new Patient(id,name);
	}

}
