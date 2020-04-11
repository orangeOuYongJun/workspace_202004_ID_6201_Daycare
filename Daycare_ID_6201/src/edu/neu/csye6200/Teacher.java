package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int teacherID, String name, int classroomID, List<Student> students) {
		super();
		this.teacherID = teacherID;
		this.name = name;
		this.classroomID = classroomID;
		this.students = students;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	private int teacherID;
	private String name;
	private int classroomID;
	private List<Student> students = new ArrayList<Student>();
}
