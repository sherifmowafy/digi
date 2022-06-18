package com.sherif.dto;

public class PatientDto {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PatientDto [name=" + name + "]";
	}
	
}
