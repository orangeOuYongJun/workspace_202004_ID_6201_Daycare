package SwingUI;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import edu.neu.csye6200.DaycareSingleton;

public class ModifyPwdView extends JFrame {

	public static ModifyPwdView showPWDView(ModifyPwdController pwdController) {

		ModifyPwdView modifyPwdView = new ModifyPwdView();
		modifyPwdView.controller = pwdController;
		modifyPwdView.setBackground(Color.BLUE);
		modifyPwdView.setBounds(100, 100, 800, 500);
		modifyPwdView.setVisible(true);
		return modifyPwdView;
	}

	public ModifyPwdView() throws HeadlessException {
		super();
		setupView();
	}

	private void setupView() {

		JPanel mainJPanel = new JPanel();
		mainJPanel.setLayout(null);
		this.add(mainJPanel);

		JLabel titleJLabel = new JLabel("Modify Password");
		titleJLabel.setBounds(300, 20, 200, 50);
		mainJPanel.add(titleJLabel);

		JTextField pwd1 = new JTextField("New PWD");
		pwd1.setBounds(300, 100, 200, 50);
		mainJPanel.add(pwd1);

		JTextField pwd2 = new JTextField("Confirm PWD");
		pwd2.setBounds(300, 150, 200, 50);
		mainJPanel.add(pwd2);

		JButton confirmButton = new JButton("Confirm");
		confirmButton.setBounds(300, 300, 200, 50);
		mainJPanel.add(confirmButton);

		confirmButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (!pwd1.getText().equals(pwd2.getText())) {
					Object[] options = { "OK" };
					JOptionPane.showOptionDialog(null, "Click OK to continue", "PLEASE INPUT SAME PWD",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
				} else {
					setPwdString(pwd1.getText());
					controller.onClickConfirmBtn();
				}
			}
		});
	}

	public ModifyPwdView(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public ModifyPwdView(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public ModifyPwdView(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public String getPwdString() {
		return pwdString;
	}

	public void setPwdString(String pwdString) {
		this.pwdString = pwdString;
	}

	private String pwdString;
	private ModifyPwdController controller;
	private static final long serialVersionUID = 1L;
}
