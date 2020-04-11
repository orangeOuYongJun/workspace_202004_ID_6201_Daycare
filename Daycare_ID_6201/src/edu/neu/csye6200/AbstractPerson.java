package edu.neu.csye6200;

public abstract class AbstractPerson {


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

public abstract String getFirstName();
	
	public abstract void setFirstName(String firstName);
	
	public abstract String getLastName();
	
	public abstract void setLastName(String lastName);
	
	public abstract int getAge();
	
	public abstract void setAge(int age);
}
