package edu.neu.csye6200;

public abstract class AbstractPerson {

<<<<<<< HEAD
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	// private String stuId;
	private int personID;
	private String name;
	private int age;
	private String pwd = "000000";
=======

public abstract String getFirstName();
	
	public abstract void setFirstName(String firstName);
	
	public abstract String getLastName();
	
	public abstract void setLastName(String lastName);
	
	public abstract int getAge();
	
	public abstract void setAge(int age);
>>>>>>> be1f6ebe90a75b07dede632e0f9f7bc37b66212f
}
