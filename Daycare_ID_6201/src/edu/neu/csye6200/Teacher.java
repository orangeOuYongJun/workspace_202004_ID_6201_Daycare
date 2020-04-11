package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int personID, String name, int classroomID, List<Student> students) {
		super();
		this.setPersonID(personID);
		this.name = name;
		this.classroomID = classroomID;
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(int classroomID) {
		this.classroomID = classroomID;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	private String name;
	private int classroomID;
	private List<Student> students = new ArrayList<Student>();
}
