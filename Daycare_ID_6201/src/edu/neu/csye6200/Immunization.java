package edu.neu.csye6200;

public class Immunization {

	public Immunization() {
		super();

	}

	public Immunization(String name, String date) {
		super();
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	private String name;
	private String date = "";
}
