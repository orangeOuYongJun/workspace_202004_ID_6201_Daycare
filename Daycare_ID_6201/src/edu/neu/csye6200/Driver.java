package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 		System.out.println("system runs....");

// //		new secondui();
// 		System.out.println("system done....");
		// System.out.println("system runs....");
		// new secondui();
		// System.out.println("system done....");

//		System.out.println("system runs����������....");
//		System.out.println("zmz is here");
		
		
		//test read studentData
		// System.out.println(CSVdata.readStudentData());

		// test read teacherData

		//  System.out.println(CSVdata.readTeacherData());
		// CSVdata.readTeacherData();
		DataStore dataStore = new DataStore(CSVdata.readStudentData(),CSVdata.readTeacherData()); 
		RatioRule.addStuToGroup(dataStore.getStudentList(), dataStore.getTeacherList(), dataStore.getGroupList());
		RatioRule.addGroupToClassroom(dataStore.getGroupList(), dataStore.getClassroomList());

		List<Student> tempStudent = new ArrayList<>(dataStore.getStudentList());
		for(int i=0;i<tempStudent.size();i++){
			System.out.println("Student"+ i + ": " + "groupId: " + tempStudent.get(i).getGroupId());
			System.out.println("Student"+ i + ": " +  "classroomId: " + tempStudent.get(i).getClassroomId());
			System.out.println("Student"+ i + ": " +  "teacherId: " + tempStudent.get(i).getTeacherNum());
			System.out.println("*************************************************************");

		}

		List<Teacher> tempTeacher = new ArrayList<>(dataStore.getTeacherList());
		for(int i=0;i<tempTeacher.size();i++){
			System.out.println("Teacher"+ i + ": " + "groupId: " + tempTeacher.get(i).getGroupId());
			System.out.println("Teacher"+ i + ": " +  "classroomId: " + tempTeacher.get(i).getClassroomId());
			System.out.println("*************************************************************");

		}

	}

}
