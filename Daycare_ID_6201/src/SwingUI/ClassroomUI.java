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

		jf.setBounds(100, 100, 800, 500);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);

		Person person = DaycareSingleton.getInstance().getCurrentUserData();

		JLabel l3 = new JLabel("Classroom: " + DaycareSingleton.getInstance().getClassroomID());
		l3.setBounds(100, 80, 200, 50);

		JLabel l4 = new JLabel("Name: " + person.getFirstName() + " " + person.getLastName());
		l4.setBounds(100, 140, 200, 50);

		JButton btn06 = new JButton("Immunization Record");
		btn06.setBounds(100, 210, 200, 50);

		JLabel lab01 = new JLabel("Year: ");
		lab01.setBounds(100, 280, 200, 50);

		String[] listYear = new String[] { "2018", "2019", "2020", "2021" };

		final JComboBox<String> comboBox = new JComboBox<String>(listYear);
		comboBox.setBounds(170, 280, 100, 50);

		comboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {

				if (e.getStateChange() == ItemEvent.SELECTED) {
					String yearString = (String) comboBox.getSelectedItem();
					DaycareSingleton.getInstance().setSelectYear(Integer.valueOf(yearString));
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
		DaycareSingleton.getInstance().setClassroomUIFrame(jf);
	}
}
