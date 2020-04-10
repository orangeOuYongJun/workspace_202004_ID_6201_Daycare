package edu.neu.csye6200;

public class Student extends Person {

	public Student(String firstName, String lastName, int age) {
		super(firstName, lastName, age);

	}

	public Student(String stuId, int age, String firstName, String lastName) {
		super(firstName, lastName, age);
		this.stuId = stuId;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getParentFirstName() {
		return firstName;
	}

	public void setParentFirstName(String parentFirstName) {
		this.firstName = parentFirstName;
	}

	public String getParentLastName() {
		return lastName;
	}

	public void setParentLastName(String parentLastName) {
		this.lastName = parentLastName;
	}

	public int getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(int classroomID) {
		this.classroomID = classroomID;
	}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	// private String stuId;
	private String stuId;
	private double gpa;
	private String firstName;
	private String lastName;
	private int classroomID;
	private int groupID;
}