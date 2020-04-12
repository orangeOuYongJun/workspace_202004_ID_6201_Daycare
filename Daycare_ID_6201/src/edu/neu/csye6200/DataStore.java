package edu.neu.csye6200;

//store student/teacher/group/classroom list

import java.util.ArrayList;
// import java.util.HashMap;
import java.util.List;
// import java.util.Map;

public class DataStore {
    private List<Student> studentList;
	private List<Teacher> teacherList;
	private List<Group> groupList;
	private List<Classroom> classroomList;
        // private Map<Integer,Group> groupMap = new HashMap<>();
        // private Map<String,Immunization> immunizationMap;
        private int year = 2020;
	
	public DataStore() {
		studentList = new ArrayList<>();
		teacherList = new ArrayList<>();
		groupList = new ArrayList<>();
		classroomList = new ArrayList<>();
    }
    
    public DataStore(List<Student> studentList, List<Teacher> teacherList) {
		this.studentList = studentList;
		this.teacherList = teacherList;
        groupList = new ArrayList<>();
		classroomList = new ArrayList<>();
    }
    
    public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public List<Teacher> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}

	public List<Group> getGroupList() {
		return groupList;
	}

	public void setGroupList(List<Group> groupList) {
		this.groupList = groupList;
	}

	public List<Classroom> getClassroomList() {
		return classroomList;
	}

	public void setClassroomList(List<Classroom> classroomList) {
		this.classroomList = classroomList;
	}

	
	public void addTostudentList(Student student) {
		this.studentList.add(student);
	}
	
	public void deleteStudent(Student student) {
		this.studentList.remove(student);
	}
	
	public void addToteacherList(Teacher teacher) {
		this.teacherList.add(teacher);
	}
	
	public void deleteTeacher(Teacher teacher) {
		this.teacherList.remove(teacher);
	}
	
	public void addTogroupList(Group group) {
		this.groupList.add(group);
	}
	
	public void deleteGroup(Group group) {
		this.groupList.remove(group);
	}
	
	public void addToclassroomList(Classroom classroom) {
		this.classroomList.add(classroom);
	}
	
	public void deleteClassoom(Classroom classroom) {
		this.classroomList.remove(classroom);
    }
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
