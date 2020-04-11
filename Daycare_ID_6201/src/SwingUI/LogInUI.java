package SwingUI;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogInUI {

	private JFrame frame;
	private JTextField usertxt;
	private JPasswordField passwordtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		frame.setBounds(100, 100, 446, 372);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel lblUsername = new JLabel("Username:");
		
		JLabel lblPassword = new JLabel("Password:");
		
		usertxt = new JTextField();
		usertxt.setColumns(11);
		
		passwordtxt = new JPasswordField();
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.ORANGE);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClassroomUI homepage = new ClassroomUI();
//				homepage.setVisible(true);
				frame.setVisible(false);
			}
		});
		
		JLabel lblDaycare = new JLabel("DayCare");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(110)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUsername)
								.addComponent(lblPassword))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(passwordtxt)
								.addComponent(usertxt)
								.addComponent(lblDaycare)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(168)
							.addComponent(btnLogin)))
					.addContainerGap(122, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(71)
					.addComponent(lblDaycare)
					.addGap(54)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsername)
						.addComponent(usertxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(passwordtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
					.addComponent(btnLogin)
					.addGap(47))
		);
		
		frame.getContentPane().setLayout(groupLayout);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}