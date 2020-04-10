package edu.neu.csye6200;

import java.util.List;

public abstract class AbstractGroup {

	public abstract int getGroupId();

	public abstract void setGroupId(int groupId);

	public abstract int getGroupSize();

	public abstract void setGroupSize(int groupSize);

	public abstract Teacher getTeacher();

	public abstract void setTeacher(Teacher teacher);

	public abstract List<Student> getStudentsList();

	public abstract void setStudentsList(List<Student> studentsList);

	public abstract void addStuToGroup(Student s);

	public abstract void deleteStuFromGroup(Student s);
	

}
