package SwingUI;

import javax.swing.*; 
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import java.awt.*;

public class ClassroomUI {


		public ClassroomUI(){
		JFrame jf = new JFrame("Classroom Situation");
		
		jf.setSize(400, 300);	
	    jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    jf.setLocationRelativeTo(null);
	    
	    GridLayout layout = new GridLayout(3, 3);
	    

	JPanel panel = new JPanel(layout);

	
	JLabel lab01 = new JLabel("Year:");
	JButton btn03 = new JButton("Classroom");
	JButton btn04 = new JButton("Teacher");
	JButton btn05 = new JButton("Student");
	;

	JButton btn06 = new JButton("Immunization Record");


	String[] listYear = new String[]{"2018", "2019", "2020", "2021"};
	
	final JComboBox<String> comboBox = new JComboBox<String>(listYear);

	
	comboBox.addItemListener(new ItemListener() {
	    @Override
	    public void itemStateChanged(ItemEvent e) {
	       
	        if (e.getStateChange() == ItemEvent.SELECTED) {
	            System.out.println("ѡ��: " + comboBox.getSelectedIndex() + " = " + comboBox.getSelectedItem());
	        }
	    }
	});
	
	comboBox.setSelectedIndex(2);


	panel.add(lab01);
	panel.add(comboBox);
	panel.add(btn03);
	panel.add(btn04);
	panel.add(btn05);
	panel.add(btn06);

	jf.setContentPane(panel);
	jf.setVisible(true); 

		}
	}



