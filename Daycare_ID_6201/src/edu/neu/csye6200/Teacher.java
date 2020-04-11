package edu.neu.csye6200;

<<<<<<< HEAD
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> be1f6ebe90a75b07dede632e0f9f7bc37b66212f
=======
>>>>>>> b80367b3e26fc72423fc508878dea96336f56db6
import java.util.List;

public class Teacher extends Person {

<<<<<<< HEAD
<<<<<<< HEAD
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
=======

	public Teacher(String firstName, String lastName, int age) {
		super(firstName, lastName, age);

	}

	public Teacher(int teacherID,  String firstName, String lastName, int age, String name, int classroomID) {
		super(firstName, lastName, age);
		this.teacherID = teacherID;
		this.name = name;
		this.classroomID = classroomID;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
>>>>>>> be1f6ebe90a75b07dede632e0f9f7bc37b66212f
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
=======

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
>>>>>>> b80367b3e26fc72423fc508878dea96336f56db6
	}
	
	

<<<<<<< HEAD
<<<<<<< HEAD
	private String name;
	private int classroomID;
	private List<Student> students = new ArrayList<Student>();
=======
	private int teacherID;
	private String name;
	private int Credits;
	private int classroomID;
>>>>>>> be1f6ebe90a75b07dede632e0f9f7bc37b66212f
=======
	
>>>>>>> b80367b3e26fc72423fc508878dea96336f56db6
}
