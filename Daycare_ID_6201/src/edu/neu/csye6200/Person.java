package edu.neu.csye6200;

public class Person extends AbstractPerson {
	private String firstName;
	private String lastName;
	private int age;
	
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.setFirstName(firstName);
		this.lastName = lastName;
		this.age = age;
	}


	@Override
	public int getAge() {
		return age;
	}
	
	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	@Override
	public String getLastName() {
		return lastName;
	}


	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	


}
