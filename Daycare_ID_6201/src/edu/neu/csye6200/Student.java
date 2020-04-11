package edu.neu.csye6200;

public class Student extends Person {

<<<<<<< HEAD
	public Student() {
		super();
		// TODO Auto-generated constructor stub
=======


	// private String stuId;
	private String stuId;
	private String parentFirstName;
	private String parentLastName;
	private String address;
	private String parentPhone;
	private String vaccineState;
	public Student(String firstName, String lastName, int age) {
		super(firstName, lastName, age);

	}


	public Student(String stuId, int age, String firstName, String lastName, String parentFirstName,
			String parentLastName, String address, String parentPhone, String vaccineState) {
		super(firstName, lastName, age);
		this.stuId = stuId;
		this.parentFirstName = parentFirstName;
		this.parentLastName = parentLastName;
		this.address = address;
		this.parentPhone = parentPhone;
		this.vaccineState = vaccineState;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
>>>>>>> be1f6ebe90a75b07dede632e0f9f7bc37b66212f
	}
	
	

<<<<<<< HEAD
	public Student(String name, int classroomID, int teacherID, int personID) {
		super();
		this.setPersonID(personID);
		this.name = name;
		this.classroomID = classroomID;
		this.teacherID = teacherID;
	}

=======
	public String getParentFirstName() {
		return parentFirstName;
	}

	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}


	public String getParentLastName() {
		return parentLastName;
	}

	public void setParentLastName(String parentLastName) {
		this.parentLastName = parentLastName;
	}
>>>>>>> be1f6ebe90a75b07dede632e0f9f7bc37b66212f

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

<<<<<<< HEAD
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
=======
	public String getParentPhone() {
		return parentPhone;
	}

	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}

	public String isVaccineState() {
		return vaccineState;
	}

	public void setVaccineState(String vaccineState) {
		this.vaccineState = vaccineState;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", parentFirstName=" + parentFirstName + ", parentLastName=" + parentLastName
				+ ", address=" + address + ", parentPhone=" + parentPhone + ", vaccineState=" + vaccineState + "]";
	}



>>>>>>> be1f6ebe90a75b07dede632e0f9f7bc37b66212f
}