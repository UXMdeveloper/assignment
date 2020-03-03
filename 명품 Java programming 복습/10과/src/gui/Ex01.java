package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex01 extends JFrame{
	Ex01(){
		super("Jcomponent�� ���� �޼ҵ� ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 =new JButton ("Magenta/Yellow Button");
		JButton b2 =new JButton ("Disabled button");
		JButton b3 =new JButton ("getX(), getY()");
		
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.magenta);
		b1.setFont(new Font("Arial", Font.BOLD,20));
		b2.setEnabled(false);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				setTitle(b.getX()+","+b.getY());
				}
		});
		c.add(b1); c.add(b2); c.add(b3);
		setSize(260,200); setVisible(true);
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
