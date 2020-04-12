package edu.neu.csye6200;

// import java.util.List;
//finish

public class Teacher extends Person {

	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
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

	public Teacher(String firstName, String lastName, int age) {
		super(firstName, lastName, age);

	}

	public Teacher(String teacherID, String firstName, String lastName, int age) {
		super(firstName, lastName, age);
		this.teacherID = teacherID;
	}

	private String teacherID;

	@Override
	public String toString() {
		return "Teacher [teacherID=" + teacherID + "]";
	}

	private String name;
	private int Credits;
	private int classroomID;

}
