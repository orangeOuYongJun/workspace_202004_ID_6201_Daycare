package SwingUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.TableModel;

import edu.neu.csye6200.CSVdata;
import edu.neu.csye6200.DataStore;
import edu.neu.csye6200.DaycareSingleton;
import edu.neu.csye6200.Person;
import edu.neu.csye6200.RatioRule;
import edu.neu.csye6200.Student;
import edu.neu.csye6200.Teacher;
import edu.neu.csye6200.DaycareSingleton.UserType;

public class ImmunizationSituationUI {

	public static void showDetaiStatus() {

		frame = new JFrame("ImmunizationSituationTable");
		frame.setBounds(0, 0, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = frame.getContentPane();

		viewConfig();
	}

	public static void viewConfig() {

//		update data
		updateTableData(false);

		JButton button = new JButton("One-click vaccination");
		button.setLayout(null);
		button.setBounds(350, 350, 200, 50);
		button.setBackground(Color.RED);
		contentPane.add(button);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CurrentSituation homepage = new CurrentSituation();
//				homepage.setVisible(true);
//				frame.setVisible(false);
				updateTableData(true);
				alertView();
			}
		});

		frame.setLayout(null);// cancel the default layout
		frame.setVisible(true);
	}

	public static void alertView() {
		Object[] options = { "OK" };
		JOptionPane.showOptionDialog(null, "Click OK to continue", "FBIWarning: Operation Done.",
				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
	}

	private static void updateTableData(boolean UpdateVaccineStatus) {

		JTable table = null;
		if (jScrollPane != null) {
			jScrollPane.removeAll();
		}
//		construct table data
		tableListDataList = null;
		if (DaycareSingleton.getInstance().userType == UserType.STUDENT) {
//			student
			String[] columName = { "MyID", "FirstName", "LastName", "Address", "VaccineStatus(T/F)", "GroupID",
					"Classroom", "TeacherID" };
			int index = 0;
			Object[][] tableList = new Object[2][9];
			for (Student stu : DaycareSingleton.getInstance().getDataStore().getStudentList()) {
				List<String> singleList = new ArrayList<String>();
				if (stu.getStuId() == DaycareSingleton.getInstance().getUserID()) {
					singleList.add(String.valueOf(stu.getStuId()));
					singleList.add(stu.getFirstName());
					singleList.add(stu.getLastName());
					singleList.add(stu.getAddress());
					if (UpdateVaccineStatus) {
						singleList.add("TRUE");
					} else {
						singleList.add(stu.isVaccineState());
					}
					singleList.add(String.valueOf(stu.getGroupId()));
					singleList.add(String.valueOf(stu.getClassroomId()));
					singleList.add(String.valueOf(stu.getTeacherNum()));
					String[] student = singleList.toArray(new String[singleList.size()]);
					tableList[index++] = student;
				}
			}
			tableListDataList = tableList;
			table = new JTable(tableListDataList, columName);

		} else {
//			teacher
			String[] columName = { "StuId", "FirstName", "LastName", "Address", "Age", "VaccineStatus(T/F)",
					"ParentPhone", "GroupID", "Classroom" };
			int index = 0;
			Object[][] tableList = new Object[10][9];
			for (Student stu : DaycareSingleton.getInstance().getDataStore().getStudentList()) {
				List<String> singleList = new ArrayList<String>();
				if (stu.getGroupId() == DaycareSingleton.getInstance().getGroupID()) {
					singleList.add(String.valueOf(stu.getStuId()));
					singleList.add(stu.getFirstName());
					singleList.add(stu.getLastName());
					singleList.add(stu.getAddress());
					singleList.add(String.valueOf(stu.getStuId()));
					if (UpdateVaccineStatus) {
						singleList.add("TRUE");
					} else {
						singleList.add(stu.isVaccineState());
					}
					singleList.add(stu.getParentPhone());
					singleList.add(String.valueOf(stu.getGroupId()));
					singleList.add(String.valueOf(stu.getClassroomId()));
					String[] student = singleList.toArray(new String[singleList.size()]);
					tableList[index++] = student;
				}
			}
			tableListDataList = tableList;
			table = new JTable(tableListDataList, columName);
		}

		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		JScrollPane jScrollPane = new JScrollPane(table);
		jScrollPane.setBounds(0, 0, 800, 350);
		contentPane.add(jScrollPane);
	}

	private static JFrame frame;
	private static Container contentPane;
	private static JScrollPane jScrollPane;
	private static Object[][] tableListDataList = null;

}
