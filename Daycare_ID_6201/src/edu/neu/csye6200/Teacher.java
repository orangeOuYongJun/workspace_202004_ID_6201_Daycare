package edu.neu.csye6200;

import java.util.List;

public class Teacher extends Person {


	public Teacher(String firstName, String lastName, int age) {
		super(firstName, lastName, age);

	}

	public Teacher(int teacherID,  String firstName, String lastName, int age) {
		super(firstName, lastName, age);
		this.teacherID = teacherID;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}
	private int teacherID;
	@Override
	public String toString() {
		return "Teacher [teacherID=" + teacherID + "]";
	}
	
	

	
}
