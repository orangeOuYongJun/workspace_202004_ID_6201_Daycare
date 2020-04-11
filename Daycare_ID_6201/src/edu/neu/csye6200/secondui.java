package edu.neu.csye6200;

import javax.swing.*; 
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import java.awt.*;

public class secondui {
	
	public secondui(){
	JFrame jf = new JFrame("Classroom Situation");
	
	jf.setSize(400, 300);	
    jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    jf.setLocationRelativeTo(null);
    
    GridLayout layout = new GridLayout(3, 3);
    

JPanel panel = new JPanel(layout);

// 创建组件
JLabel lab01 = new JLabel("Year:");
JButton btn03 = new JButton("Classroom");
JButton btn04 = new JButton("Teacher");
JButton btn05 = new JButton("Student");
//JButton btn03 = new JButton("Year");

JButton btn06 = new JButton("Immunization Record");


String[] listYear = new String[]{"2018", "2019", "2020", "2021"};
//创建一个下拉列表框
final JComboBox<String> comboBox = new JComboBox<String>(listYear);

//添加条目选中状态改变的监听器
comboBox.addItemListener(new ItemListener() {
    @Override
    public void itemStateChanged(ItemEvent e) {
        // 只处理选中的状态
        if (e.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("选中: " + comboBox.getSelectedIndex() + " = " + comboBox.getSelectedItem());
        }
    }
});
// 设置默认选中的条目
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
