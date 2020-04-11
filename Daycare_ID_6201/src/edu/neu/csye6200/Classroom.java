package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Classroom extends AbstractClassroom{
	private int roomId;
	private int roomSize;
	private List<Teacher> teachers = new ArrayList<Teacher>();
	private List<Student> students = new ArrayList<Student>();


	public Classroom(int roomId, int roomSize, List<Group> groupsList) {
		super();
		setRoomId(roomId);
		setRoomSize(roomSize);
		setGroupsList(groupsList);

	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getRoomSize() {
		return roomSize;
	}

	public void setRoomSize(int roomSize) {
		this.roomSize = roomSize;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
