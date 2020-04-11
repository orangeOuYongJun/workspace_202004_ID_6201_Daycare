package edu.neu.csye6200;

public class Person extends AbstractPerson {
<<<<<<< HEAD
<<<<<<< HEAD

	
=======
=======
>>>>>>> b80367b3e26fc72423fc508878dea96336f56db6
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


>>>>>>> be1f6ebe90a75b07dede632e0f9f7bc37b66212f
}
