package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

//finish

public class Group extends AbstractGroup {

	private int groupId;
	private int groupSize;
	private Teacher teacher;
	private int classRoomID;
	private List<Student> studentsList = new ArrayList<>();
	
	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Group(int groupId, int groupSize, Teacher teacher, List<Student> studentsList) {
		super();
		setGroupId(groupId);
		setGroupSize(groupSize);
		setStudentsList(studentsList);
		setTeacher(teacher);
	}

	public int getClassRoomID() {
		return classRoomID;
	}

	public void setClassRoomID(int classRoomID) {
		this.classRoomID = classRoomID;
	}

	@Override
	public void addStuToGroup(Student s) {
		studentsList.add(s);
	}

	@Override
	public void deleteStuFromGroup(Student s) {
		studentsList.remove(s);
	}

	@Override
	public int getGroupId() {
		return groupId;
	}

	@Override
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	@Override
	public int getGroupSize() {
		return groupSize;
	}

	@Override
	public void setGroupSize(int groupSize) {
		this.groupSize = groupSize;
	}

	@Override
	public Teacher getTeacher() {
		return teacher;
	}

	@Override
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public List<Student> getStudentsList() {
		return studentsList;
	}

	@Override
	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}
}
