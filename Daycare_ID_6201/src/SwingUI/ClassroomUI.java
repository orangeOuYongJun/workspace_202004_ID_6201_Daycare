package SwingUI;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;

import edu.neu.csye6200.DaycareSingleton;
import edu.neu.csye6200.Immunization;
import edu.neu.csye6200.Person;
import edu.neu.csye6200.Student;
import edu.neu.csye6200.Teacher;
import edu.neu.csye6200.DaycareSingleton.UserType;

import java.awt.*;

public class ClassroomUI {

	public ClassroomUI() {
		
		DaycareSingleton.getInstance().initializeData();
		
		JFrame jf = new JFrame("Classroom Situation");

		jf.setSize(400, 300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);

		GridLayout layout = new GridLayout(3, 3);

		JPanel panel = new JPanel(layout);

		JLabel lab01 = new JLabel("Year:");

		Person person = DaycareSingleton.getInstance().getCurrentUserData();
		switch (DaycareSingleton.getInstance().userType) {
		case STUDENT:
			Student p1 = (Student) person;
			JLabel l5 = new JLabel("Teacher:" + String.valueOf(DaycareSingleton.getInstance().getTeacherID()));
			panel.add(l5);
			break;
		case TEACHER:
			Teacher p2 = (Teacher) person;
			JLabel l6 = new JLabel("Student");
			panel.add(l6);
			break;
		default:
			break;
		}

		JLabel l3 = new JLabel("Classroom");
		JLabel l4 = new JLabel("Name:" + person.getFirstName() + person.getLastName());

		JButton btn06 = new JButton("Immunization Record");

		String[] listYear = new String[] { "2018", "2019", "2020", "2021" };

		final JComboBox<String> comboBox = new JComboBox<String>(listYear);

		comboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {

				if (e.getStateChange() == ItemEvent.SELECTED) {
//					comboBox.getSelectedIndex() ==
					System.out.println("ѡ��: " + comboBox.getSelectedIndex() + " = " + comboBox.getSelectedItem());
				}
			}
		});

		btn06.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setVisible(false);
				ImmunizationSituationUI.showDetaiStatus();
			}
		});

		panel.add(lab01);
		panel.add(comboBox);
		panel.add(l3);
		panel.add(l4);
		panel.add(btn06);

		jf.setContentPane(panel);
		jf.setVisible(true);

	}
}
