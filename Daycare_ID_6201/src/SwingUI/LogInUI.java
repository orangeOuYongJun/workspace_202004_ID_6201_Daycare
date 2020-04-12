package SwingUI;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import edu.neu.csye6200.BackgroundMusic;
import edu.neu.csye6200.CSVdata;
import edu.neu.csye6200.DataStore;
import edu.neu.csye6200.DaycareSingleton;
import edu.neu.csye6200.Student;
import edu.neu.csye6200.Teacher;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class LogInUI {

	private JFrame frame;
	private JTextField usertxt;
	private JPasswordField passwordtxt;

	/**
	 * Launch the application.
	 */
	public static void initializeLoginView() {
		initializeMusic();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInUI window = new LogInUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void initializeMusic() {
		BackgroundMusic.playMusic();
	}

	/**
	 * Create the application.
	 */
	public LogInUI() {
		initialize();
	}

	/**
	 * Initialize the content of frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel lblUsername = new JLabel("UserID:");
		JLabel lblPassword = new JLabel("Password:");

		usertxt = new JTextField();
		usertxt.setColumns(11);

		passwordtxt = new JPasswordField();

		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.ORANGE);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean isLogin = validLoginData(usertxt.getText(), passwordtxt.getPassword());
				if (isLogin) {
					ClassroomUI homepage = new ClassroomUI();
//					homepage.setVisible(true);
					frame.setVisible(false);

				} else {
//					login fail
					Object[] options = { "OK" };
					JOptionPane.showOptionDialog(null, "Click OK to continue", "FBIWarning:Password check failed.",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
				}

			}
		});

		JLabel lblDaycare = new JLabel("DayCare");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(110)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(lblUsername)
										.addComponent(lblPassword))
								.addGap(18)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(passwordtxt).addComponent(usertxt).addComponent(lblDaycare)))
						.addGroup(groupLayout.createSequentialGroup().addGap(168).addComponent(btnLogin)))
				.addContainerGap(122, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(71).addComponent(lblDaycare).addGap(54)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblUsername).addComponent(
						usertxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(27)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblPassword).addComponent(
						passwordtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE).addComponent(btnLogin).addGap(47)));

		frame.getContentPane().setLayout(groupLayout);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	public boolean validLoginData(String userName, char[] pwd) {

		for (Teacher teacher : CSVdata.readTeacherData()) {

			if (String.valueOf(teacher.getTeacherId()).equals(userName)) {
				if (teacher.getPwd().equals(String.valueOf(pwd))) {
					DaycareSingleton.getInstance().setCurrentUserData(teacher);
					DaycareSingleton.getInstance().userType = DaycareSingleton.UserType.TEACHER;
					DaycareSingleton.getInstance().setUserID(Integer.valueOf(usertxt.getText()));
					return true;
				} else {
					return false;
				}
			}
		}

		for (Student student : CSVdata.readStudentData()) {
			if (String.valueOf(student.getStuId()).equals(userName)) {
				if (student.getPwd().equals(String.valueOf(pwd))) {
					DaycareSingleton.getInstance().setCurrentUserData(student);
					DaycareSingleton.getInstance().userType = DaycareSingleton.UserType.STUDENT;
					DaycareSingleton.getInstance().setUserID(Integer.valueOf(usertxt.getText()));
					return true;
				} else {
					return false;
				}
			}
		}

		return false;
	}
}