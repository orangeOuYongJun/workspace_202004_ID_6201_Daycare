package edu.neu.csye6200;



public class DaycareSingleton {

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	private static DaycareSingleton instance = new DaycareSingleton();

	private DaycareSingleton() {
	}

	public static DaycareSingleton getInstance() {
		return instance;
	}

	public Person getCurrentUserData() {
		return currentUserData;
	}

	public void setCurrentUserData(Person currentUserData) {
		this.currentUserData = currentUserData;
	}

	private int userID;
	private Person currentUserData;

	public static enum UserType {
		STUDENT, TEACHER
	}
	public UserType userType;
}
