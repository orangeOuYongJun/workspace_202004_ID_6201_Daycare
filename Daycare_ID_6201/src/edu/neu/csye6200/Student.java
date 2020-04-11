package edu.neu.csye6200;

public class Student extends Person {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String stuId, String name, int classroomID, int teacherID) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.classroomID = classroomID;
		this.teacherID = teacherID;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
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


	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	// private String stuId;
	private String stuId;
	private String name;
	private int classroomID;
	private int teacherID;
	private String pwd = "000000";
}