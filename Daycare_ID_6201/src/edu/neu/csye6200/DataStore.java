package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStore {
    private List<Student> studentList;
	private List<Teacher> teacherList;
	// private List<Group> groupList;
	// private List<Classroom> roomList;
        // private Map<Integer,Group> groupMap = new HashMap<>();
        // private Map<String,Immunization> immunizationMap;
        private int year = 2020;
	
	public DataStore() {
		studentList = new ArrayList<>();
		teacherList = new ArrayList<>();
		// groupList = new ArrayList<>();
		// roomList = new ArrayList<>();
    }
    
    public DataStore(List<Student> stuList, List<Teacher> tchList) {
		this.studentList = stuList;
		this.teacherList = tchList;
        // groupList = new ArrayList<>();
		// roomList = new ArrayList<>();
    }
    
    public List<Student> getStuList() {
		return studentList;
	}

	public void setStuList(List<Student> stuList) {
		this.studentList = stuList;
	}

	public List<Teacher> getTchList() {
		return teacherList;
	}

	public void setTchList(List<Teacher> tchList) {
		this.teacherList = tchList;
	}

	// public List<Group> getGroupList() {
	// 	return groupList;
	// }

	// public void setGroupList(List<Group> groupList) {
	// 	this.groupList = groupList;
	// }

	// public List<Classroom> getRoomList() {
	// 	return roomList;
	// }

	// public void setRoomList(List<Classroom> roomList) {
	// 	this.roomList = roomList;
	// }

	
	public void addTostuList(Student student) {
		this.studentList.add(student);
	}
	
	public void deleteStu(Student student) {
		this.studentList.remove(student);
	}
	
	public void addTotchList(Teacher teacher) {
		this.teacherList.add(teacher);
	}
	
	public void deleteTch(Teacher teacher) {
		this.teacherList.remove(teacher);
	}
	
	// public void addTogroupList(Group group) {
	// 	this.groupList.add(group);
	// }
	
	// public void deleteGroup(Group group) {
	// 	this.groupList.remove(group);
	// }
	
	// public void addToroomList(Classroom room) {
	// 	this.roomList.add(room);
	// }
	
	// public void deleteRoom(Classroom room) {
	// 	this.roomList.remove(room);
    // }
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}