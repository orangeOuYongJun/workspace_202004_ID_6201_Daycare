package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CSVdata {

	public static List<Student> readStudentData() {
		List<Student> students = new ArrayList<>();
		// StudentFactory studentFactory = new StudentFactory();
		try (BufferedReader inLine = new BufferedReader(new FileReader("./studentCSV.csv"));) {
			String inputLine = null; // read one line from file at a time
			while ((inputLine = inLine.readLine()) != null) { // Parse line converting each string token into a Student
																// object field
				// Student stu = studentFactory.getObject(inputLine);
				Student stu = getObject(inputLine);
				students.add(stu);
			}
		} catch (IOException e) {
			// catch IOException (and implicitly FileNotFoundException)
			e.printStackTrace();
		}
		return students;

	}

	// StudentFactory
	public static Student getObject(String csv) { //
		// TODO Auto-generated method stub
		// String stuId, int age, String firstName, String lastName, String
		// parentFirstName,
		// String parentLastName, String address, String parentPhone, boolean
		// vaccineState
		Student student = new Student(null, 0, null, null, null, null, null, null,null);
		String[] arr = csv.split(",");
		// student.setStuId(Integer.parseInt(arr[0]));
		student.setStuId(arr[0]);
		student.setAge(Integer.parseInt(arr[1]));
		student.setFirstName(arr[2]);
		student.setLastName(arr[3]);
		student.setParentFirstName(arr[4]);
		student.setParentLastName(arr[5]);
		student.setAddress(arr[6]);
		student.setParentPhone(arr[7]);
		student.setVaccineState(arr[8]);

		return student;
	}

	// public static void writeStudentFile(List<Student> students) {
	// 	try (BufferedWriter out = new BufferedWriter(new FileWriter("./studentCSV.csv"))) {
	// 		for (Student st : students) {
	// 			String idString = String.valueOf(st.getStuId());
	// 			String ageString = String.valueOf(st.getAge());
	// 			String stString = idString + "," + ageString + "," + st.getFirstName() + "," + st.getLastName() + ","
	// 					+ st.getParentFirstName() + "," + st.getParentLastName() + "," + st.getAddress() + ","
	// 					+ st.getParentPhone();

	// 			out.write(stString);
	// 			out.newLine();
	// 		}
	// 		out.flush();
	// 	} catch (Exception e) {
	// 		e.printStackTrace();
	// 	}
	// }


}