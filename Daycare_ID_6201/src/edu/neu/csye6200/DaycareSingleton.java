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

	private int userID;
	public DataStore dataStore;
}
