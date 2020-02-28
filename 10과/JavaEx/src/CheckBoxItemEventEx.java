import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame{
	JCheckBox [] fruits = new JCheckBox [3];
	String [] names = {"���", "��" , "ü��"};
	JLabel sumLabel;
	
	CheckBoxItemEventEx(){
		setTitle("���� ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("��� 100 �� 200 ü�� 50"));
		MyItemListener listener = new MyItemListener();
		for (int i =0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]); 
			fruits[i].setBorderPainted(true); 
			c.add(fruits[i]); 
			fruits[i].addItemListener(listener);
		}
		sumLabel = new JLabel("���� 0�� �Դϴ�.");
		c.add(sumLabel);
		setSize(250,200);
		setVisible(true);

	}
	class MyItemListener implements ItemListener{
		int sum =0;
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0]) {
					sum +=100;
				}
				else if(e.getItem() ==fruits[1]) {
					sum+=200;
				}
				else {
					sum+=50;
				}
			}
			else {
				if(e.getItem() == fruits [0]) {
					sum -=100;
				}
				else if (e.getItem() ==fruits[1]) {
					sum -=200;
				}
				else {
					sum -=50;
				}
			}
			sumLabel.setText("���� "+ sum+ "�� �Դϴ�.");
			
		}
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}
