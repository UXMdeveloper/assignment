import javax.swing.*;
import java.awt.*;

public class JCheckboxEx extends JFrame{
	JCheckboxEx(){
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox apple = new JCheckBox ("���");
		JCheckBox pear = new JCheckBox("��", true);
		JCheckBox cherry = new JCheckBox("ü��");
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(300,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JCheckboxEx();
	}
}
