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

public class ImmunizationSituationUI {

	public static void main(String[] agrs) {
		JFrame frame = new JFrame("ImmunizationSituationTable");

		frame.setBounds(0, 0, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = frame.getContentPane();

		Object[][] tableDate = new Object[5][7];
		for (int i = 0; i < 5; i++) {
			tableDate[i][0] = "1000" + i;
			for (int j = 1; j < 7; j++) {
				tableDate[i][j] = 0;
			}
		}
		String[] name = { "stuId", "name", "classroomID", "teacherID", "age", "immunizationdates", "overdue(T/F)" };

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
