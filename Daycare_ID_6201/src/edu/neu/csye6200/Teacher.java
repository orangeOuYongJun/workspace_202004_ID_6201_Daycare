package edu.neu.csye6200;

public class Teacher extends Person {

	public Teacher(int tchId, String firstName, String lastName, int age) {
		super(firstName, lastName, age);
	}

	public int getCredits() {
		return Credits;
	}

	public void setCredits(int credit) {
		this.Credits = credit;
	}

	private String firstName;
	private String lastName;
	private int Credits;
}
