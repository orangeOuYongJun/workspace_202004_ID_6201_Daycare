package SwingUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

import edu.neu.csye6200.DaycareSingleton;
import edu.neu.csye6200.DaycareSingleton.UserType;

public class ImmunizationSituationUI {

	public static void showDetaiStatus() {
		JFrame frame = new JFrame("ImmunizationSituationTable");

		frame.setBounds(0, 0, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = frame.getContentPane();

		if (DaycareSingleton.getInstance().userType == UserType.STUDENT) {
			studentViewConfig(frame, contentPane);
		} else {
			teacherViewConfig(frame, contentPane);
		}

	}

	public static void studentViewConfig(JFrame frame, Container contentPane) {

//		teacher.setTeacherID(Integer.parseInt(arr[0]));
//		teacher.setFirstName(arr[1]);
//		teacher.setLastName(arr[2]);
//		teacher.setAge(Integer.parseInt(arr[3]));

	}

	public static void teacherViewConfig(JFrame frame, Container contentPane) {

//		student.setStuId(arr[0]);
//		student.setAge(Integer.parseInt(arr[1]));
//		student.setFirstName(arr[2]);
//		student.setLastName(arr[3]);
//		student.setParentFirstName(arr[4]);
//		student.setParentLastName(arr[5]);
//		student.setAddress(arr[6]);
//		student.setParentPhone(arr[7]);
//		student.setVaccineState(arr[8]);
//		student.setPwd(arr[9]);

		Object[][] tableDate = new Object[5][7];
		for (int i = 0; i < 5; i++) {
			tableDate[i][0] = "1000" + i;
			for (int j = 1; j < 7; j++) {
				tableDate[i][j] = 0;
			}
		}
		String[] name = { "stuId", "firstName", "lastName", "setAddress", "age", "VaccineStatus(T/F)", "ParentPhone" };

		JScrollPane scrollPane = new JScrollPane();
		JTable table = new JTable(tableDate, name);
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		JScrollPane jScrollPane = new JScrollPane(table);
		jScrollPane.setBounds(0, 0, 800, 350);
		contentPane.add(jScrollPane);

		JButton button = new JButton("One-click vaccination");
		button.setLayout(null);
		button.setBounds(350, 350, 200, 50);
		button.setBackground(Color.RED);
		contentPane.add(button);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CurrentSituation homepage = new CurrentSituation();
//				homepage.setVisible(true);
				frame.setVisible(false);
			}
		});

		frame.setLayout(null);// cancel the default layout
		frame.setVisible(true);

	}
}
