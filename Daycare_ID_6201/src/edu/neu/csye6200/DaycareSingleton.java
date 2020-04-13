package edu.neu.csye6200;

import javax.swing.JFrame;

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

	public void initializeData() {

		dataStore = new DataStore(CSVdata.readStudentData(), CSVdata.readTeacherData());
		RatioRule.addStuToGroup(dataStore.getStudentList(), dataStore.getTeacherList(), dataStore.getGroupList());
		RatioRule.addGroupToClassroom(dataStore.getGroupList(), dataStore.getClassroomList());

		if (this.userType == UserType.STUDENT) {
			for (Student student : dataStore.getStudentList()) {
				if (student.getStuId() == userID) {
					currentGroupID = student.getGroupId();
					classRoomID = student.getClassroomId();
					teacherID = student.getTeacherNum();
				}
			}
		} else {
			for (Teacher teacher : dataStore.getTeacherList()) {
				if (teacher.getTeacherId() == userID) {
					currentGroupID = teacher.getGroupId();
					classRoomID = teacher.getClassroomId();
				}
			}
		}
	}

	public int getTeacherID() {
		return teacherID;
	}

	public int getClassroomID() {
		return classRoomID;
	}

	public int getGroupID() {
		return currentGroupID;
	}

	public DataStore getDataStore() {
		return dataStore;
	}

	public int getSelectYear() {
		if (selectYear == 0) {
			return 2018;
		}
		return selectYear;
	}

	public void setSelectYear(int selectYear) {
		this.selectYear = selectYear;
		initializeData();
	}

	public JFrame getClassroomUIFrame() {
		return classroomUIFrame;
	}

	public void setClassroomUIFrame(JFrame classroomUIFrame) {
		this.classroomUIFrame = classroomUIFrame;
	}

	public JFrame getImmuneFrame() {
		return immuneFrame;
	}

	public void setImmuneFrame(JFrame immuneFrame) {
		this.immuneFrame = immuneFrame;
	}

	private int selectYear;
	private DataStore dataStore;
	private int teacherID;
	private int classRoomID;
	private int currentGroupID;
	private int userID;
	private Person currentUserData;
	private JFrame classroomUIFrame;
	private JFrame immuneFrame;

	public static enum UserType {
		STUDENT, TEACHER
	}

	public UserType userType;
}
