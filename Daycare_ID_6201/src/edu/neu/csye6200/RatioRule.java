package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class RatioRule {

	// GroupFactory
	// public static Group getObject(int groupId, int groupSize, Teacher teacher,
	// List<Student> studentsList) {

	// return new Group(groupId,groupSize,teacher,studentsList);
	// }

	public static void addStuToGroup(List<Student> studentList, List<Teacher> teacherList, List<Group> groupList) {
		// divide student into different group according age
		// 6-12
		List<Student> list1 = new ArrayList<>();
		// 13-24
		List<Student> list2 = new ArrayList<>();
		// 25-35
		List<Student> list3 = new ArrayList<>();
		// 36-47
		List<Student> list4 = new ArrayList<>();
		// 48-59
		List<Student> list5 = new ArrayList<>();
		// 60 on up
		List<Student> list6 = new ArrayList<>();

		// divide all the student data into different list
		for (Student student : studentList) {
			if (student.getAge() >= 6 & student.getAge() <= 12) {
				list1.add(student);
			}

			if (student.getAge() >= 13 & student.getAge() <= 24) {
				list2.add(student);
			}

			if (student.getAge() >= 25 & student.getAge() <= 35) {
				list3.add(student);
			}

			if (student.getAge() >= 36 & student.getAge() <= 47) {
				list4.add(student);
			}

			if (student.getAge() >= 48 & student.getAge() <= 59) {
				list5.add(student);
			}

			if (student.getAge() >= 60) {
				list6.add(student);
			}
		}

		// temporary studentlist
		List<Student> templist = new ArrayList<>();

		// for age 6-12
		int j = 0;
		for (int i = 0; i < list1.size(); i++) {
			templist.add(list1.get(i));
			// student set groupId
			list1.get(i).setGroupId(j + 1);
			list1.get(i).setTeacherNum(teacherList.get(j).getTeacherId());
			// whether this group is full
			// if it is full, add to a new group
			if ((i + 1) % 4 == 0) {
				// maybe delete
				// List<Student> tempStudentList = new ArrayList<>(templist);
				// input: int groupId, int groupSize, Teacher teacher, List<Student>
				// studentsList
				teacherList.get(j).setGroupId(j + 1);
				groupList.add(new Group(j + 1, 4, teacherList.get(j), templist));
				j++;
				templist.clear();
			}
		}
		// students left because the group not full
		if (templist.size() != 0) {
			// student set groupId
			for (Student student : templist) {
				student.setGroupId(j + 1);
				student.setTeacherNum(teacherList.get(j).getTeacherId());
			}
			teacherList.get(j).setGroupId(j + 1);
			groupList.add(new Group(j + 1, 4, teacherList.get(j), templist));
			j++;
			templist.clear();
		}

		// age 13-24
		for (int i = 0; i < list2.size(); i++) {
			templist.add(list2.get(i));
			// student set groupId
			list2.get(i).setGroupId(j + 1);
			list2.get(i).setTeacherNum(teacherList.get(j).getTeacherId());
			// whether this group is full
			// if it is full, add to a new group
			if ((i + 1) % 5 == 0) {
				// maybe delete
				// List<Student> tempStudentList = new ArrayList<>(templist);
				// input: int groupId, int groupSize, Teacher teacher, List<Student>
				// studentsList
				teacherList.get(j).setGroupId(j + 1);
				groupList.add(new Group(j + 1, 5, teacherList.get(j), templist));
				j++;
				templist.clear();
			}
		}
		// students left because the group not full
		if (templist.size() != 0) {
			// student set groupId
			for (Student student : templist) {
				student.setGroupId(j + 1);
				student.setTeacherNum(teacherList.get(j).getTeacherId());
			}
			teacherList.get(j).setGroupId(j + 1);
			groupList.add(new Group(j + 1, 5, teacherList.get(j), templist));
			j++;
			templist.clear();
		}

		// age 25-35
		for (int i = 0; i < list3.size(); i++) {
			templist.add(list3.get(i));
			// student set groupId
			list3.get(i).setGroupId(j + 1);
			list3.get(i).setTeacherNum(teacherList.get(j).getTeacherId());
			// whether this group is full
			// if it is full, add to a new group
			if ((i + 1) % 6 == 0) {
				// maybe delete
				// List<Student> tempStudentList = new ArrayList<>(templist);
				// input: int groupId, int groupSize, Teacher teacher, List<Student>
				// studentsList
				teacherList.get(j).setGroupId(j + 1);
				groupList.add(new Group(j + 1, 6, teacherList.get(j), templist));
				j++;
				templist.clear();
			}
		}
		// students left because the group not full
		if (templist.size() != 0) {
			// student set groupId
			for (Student student : templist) {
				student.setGroupId(j + 1);
				student.setTeacherNum(teacherList.get(j).getTeacherId());
			}
			teacherList.get(j).setGroupId(j + 1);
			groupList.add(new Group(j + 1, 6, teacherList.get(j), templist));
			j++;
			templist.clear();
		}

		// age 36-47
		for (int i = 0; i < list4.size(); i++) {
			templist.add(list4.get(i));
			// student set groupId
			list4.get(i).setGroupId(j + 1);
			list4.get(i).setTeacherNum(teacherList.get(j).getTeacherId());
			// whether this group is full
			// if it is full, add to a new group
			if ((i + 1) % 8 == 0) {
				// maybe delete
				// List<Student> tempStudentList = new ArrayList<>(templist);
				// input: int groupId, int groupSize, Teacher teacher, List<Student>
				// studentsList
				teacherList.get(j).setGroupId(j + 1);
				groupList.add(new Group(j + 1, 8, teacherList.get(j), templist));
				j++;
				templist.clear();
			}
		}
		// students left because the group not full
		if (templist.size() != 0) {
			// student set groupId
			for (Student student : templist) {
				student.setGroupId(j + 1);
				student.setTeacherNum(teacherList.get(j).getTeacherId());
			}
			teacherList.get(j).setGroupId(j + 1);
			groupList.add(new Group(j + 1, 8, teacherList.get(j), templist));
			j++;
			templist.clear();
		}

		// age 48-59
		for (int i = 0; i < list5.size(); i++) {
			templist.add(list5.get(i));
			// student set groupId
			list5.get(i).setGroupId(j + 1);
			list5.get(i).setTeacherNum(teacherList.get(j).getTeacherId());
			// whether this group is full
			// if it is full, add to a new group
			if ((i + 1) % 12 == 0) {
				// maybe delete
				// List<Student> tempStudentList = new ArrayList<>(templist);
				// input: int groupId, int groupSize, Teacher teacher, List<Student>
				// studentsList
				teacherList.get(j).setGroupId(j + 1);
				groupList.add(new Group(j + 1, 12, teacherList.get(j), templist));
				j++;
				templist.clear();
			}
		}
		// students left because the group not full
		if (templist.size() != 0) {
			// student set groupId
			for (Student student : templist) {
				student.setGroupId(j + 1);
				student.setTeacherNum(teacherList.get(j).getTeacherId());
			}
			teacherList.get(j).setGroupId(j + 1);
			groupList.add(new Group(j + 1, 12, teacherList.get(j), templist));
			j++;
			templist.clear();
		}

		// age 60 on up
		for (int i = 0; i < list6.size(); i++) {
			templist.add(list6.get(i));
			// student set groupId
			list6.get(i).setGroupId(j + 1);
			list6.get(i).setTeacherNum(teacherList.get(j).getTeacherId());
			// whether this group is full
			// if it is full, add to a new group
			if ((i + 1) % 15 == 0) {
				// maybe delete
				// List<Student> tempStudentList = new ArrayList<>(templist);
				// input: int groupId, int groupSize, Teacher teacher, List<Student>
				// studentsList
				teacherList.get(j).setGroupId(j + 1);
				groupList.add(new Group(j + 1, 15, teacherList.get(j), templist));
				j++;
				templist.clear();
			}
		}
		// students left because the group not full
		if (templist.size() != 0) {
			// student set groupId
			for (Student student : templist) {
				student.setGroupId(j + 1);
				student.setTeacherNum(teacherList.get(j).getTeacherId());
			}
			teacherList.get(j).setGroupId(j + 1);
			groupList.add(new Group(j + 1, 15, teacherList.get(j), templist));
			j++;
			templist.clear();
		}

	}

	public static void addGroupToClassroom(List<Group> groupList, List<Classroom> classroomList) {
		List<Group> groupList1 = new ArrayList<>();
		List<Group> groupList2 = new ArrayList<>();
		for (Group p : groupList) {
			if (p.getGroupSize() >= 12) {
				groupList2.add(p);
			} else {
				groupList1.add(p);
			}
		}

		List<Group> templist = new ArrayList<>();
		List<Student> groupStudent = new ArrayList<>();

		//Max Groups: 3
		int j = 0;
		for (int i = 0; i < groupList1.size(); i++) {
			templist.add(groupList1.get(i));
			groupList1.get(i).setClassroomId(j + 1);
			groupList1.get(i).getTeacher().setClassroomId(j + 1);
			groupStudent = groupList1.get(i).getStudentsList();
			for (int k = 0; k < groupStudent.size(); k++) {
				groupStudent.get(k).setClassroomId(j + 1);

			}
			groupStudent.clear();
			if ((i + 1) % 3 == 0) {
				classroomList.add(new Classroom(j + 1, 3, templist));
				j++;
				templist.clear();
			}

		}
		if (templist.size() != 0) {
			for (Group group : templist) {
				group.setClassroomId(j + 1);
				group.getTeacher().setClassroomId(j + 1);
				groupStudent = group.getStudentsList();
				for (int k = 0; k < groupStudent.size(); k++) {
					groupStudent.get(k).setClassroomId(j + 1);

				}
				groupStudent.clear();
			}
			// List<Group> groupsList = new ArrayList<>(templist);
			classroomList.add(new Classroom(j + 1, 3, templist));
			j++;
			templist.clear();
		}

		// Max Groups: 2
		for (int i = 0; i < groupList2.size(); i++) {
			templist.add(groupList2.get(i));
			groupList2.get(i).setClassroomId(j + 1);
			groupList2.get(i).getTeacher().setClassroomId(j + 1);
			groupStudent = groupList2.get(i).getStudentsList();
			for (int k = 0; k < groupStudent.size(); k++) {
				groupStudent.get(k).setClassroomId(j + 1);

			}
			groupStudent.clear();
			if ((i + 1) % 2 == 0) {
				classroomList.add(new Classroom(j + 1, 2, templist));
				j++;
				templist.clear();
			}

		}
		if (templist.size() != 0) {
			for (Group group : templist) {
				group.setClassroomId(j + 1);
				group.getTeacher().setClassroomId(j + 1);
				groupStudent = group.getStudentsList();
				for (int k = 0; k < groupStudent.size(); k++) {
					groupStudent.get(k).setClassroomId(j + 1);

				}
				groupStudent.clear();
			}
			// List<Group> groupsList = new ArrayList<>(templist);
			classroomList.add(new Classroom(j + 1, 2, templist));
			j++;
			templist.clear();
		}
	}


}