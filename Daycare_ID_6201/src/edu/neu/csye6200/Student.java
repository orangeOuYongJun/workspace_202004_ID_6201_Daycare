package edu.neu.csye6200;

public class Student extends Person {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(String name, int classroomID, int teacherID, int personID) {
		super();
		this.setPersonID(personID);
		this.name = name;
		this.classroomID = classroomID;
		this.teacherID = teacherID;
	}


	public int getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(int classroomID) {
		this.classroomID = classroomID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	private String name;
	private int classroomID;
	private int teacherID;
}