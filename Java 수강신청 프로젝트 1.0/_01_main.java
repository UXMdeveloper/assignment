package javaGUI;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class _01_main extends JFrame{
	//���⿡ JList�� �����۵��� ��Ƶ� ����/�迭 ����� ���� ->DB���� ����
	
	//������ ->GUI ������ �׻� �����ڿ���
	_01_main(){
		setTitle("MJ ������û");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JSplitPane sp= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		
		//��ư�� �׵θ� ����
		LineBorder b1 = new LineBorder(Color.GREEN,2);
		LineBorder b2 = new LineBorder(Color.RED,2);
		//List��ġ Ȯ�ο� �׵θ�.
		LineBorder b3 = new LineBorder(Color.BLUE,1);
		
		//������ å����� ������û �Ϸ� ����Ʈ�� �и��ϴ� SP
		JSplitPane leftsp= new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		JPanel pn1 = new JPanel();
		pn1.setLayout(new BorderLayout());
		pn1.setBackground(Color.WHITE);
		JPanel pn2 = new JPanel();
		pn2.setLayout(new BorderLayout());
		pn2.setBackground(Color.WHITE);
		JPanel pn3 = new JPanel();
		pn3.setLayout(null);
		pn3.setBackground(Color.WHITE);
		JPanel pn4 = new JPanel();
		pn4.setLayout(new GridLayout(2,4));
		pn4.setBackground(Color.WHITE);
		
		JLabel storageLb = new JLabel("  ���");
		JList storageList = new JList(); //å���� ����Ʈ
		storageList.setBorder(b3);
		JLabel completeLb = new JLabel("  ������û ����");
		JList completeList = new JList();//������û �Ϸ�� ����Ʈ
		completeList.setBorder(b3);
		//��ġ������ �̿��ؼ� ��ġ, ���� ���� 
		pn1.add(storageLb,BorderLayout.NORTH);
		pn1.add(storageList,BorderLayout.CENTER);
		
		pn2.add(completeLb,BorderLayout.NORTH);
		pn2.add(completeList,BorderLayout.CENTER);
		
		leftsp.setTopComponent(pn1);
		leftsp.setBottomComponent(pn2);
		
		//��ư�� �̹��� �߰�
		JButton searchCategoryBt =new JButton("ī�װ� �˻�");
		searchCategoryBt.setBounds(37, 30, 120, 40);
		searchCategoryBt.setFont(new Font("���ʷյ���",Font.BOLD,10));
		searchCategoryBt.setBorder(b1);
		searchCategoryBt.setBackground(Color.WHITE);
		
		JButton searchAllBt = new JButton("����� �˻�");
		searchAllBt.setBounds(37, 100, 120, 40);
		searchAllBt.setFont(new Font("���ʷյ���",Font.BOLD,10));
		searchAllBt.setBorder(b1);
		searchAllBt.setBackground(Color.WHITE);
		
		JButton deleteBt = new JButton("����");
		deleteBt.setBounds(37, 170, 120, 40);
		deleteBt.setFont(new Font("���ʷյ���",Font.BOLD,10));
		deleteBt.setBorder(b2);
		deleteBt.setBackground(Color.WHITE);
		
		pn3.add(searchCategoryBt);
		pn3.add(searchAllBt);
		pn3.add(deleteBt);
		
		//�ϴ� �̰Ŵ� DB���� �ҷ��� ��������
		String [] personal = {"�а�","����","�г�", "2","�̸�","������","�й�","60191669"};
		
		sp.setDividerSize(1); //��輱 ǥ�� �β� ����
		sp.setResizeWeight(0.80); // splitPane ���� ����
		leftsp.setDividerSize(0);
		leftsp.setResizeWeight(0.50);
		sp.setLeftComponent(leftsp);
		sp.setRightComponent(pn3);
		getContentPane().add(sp); //JSplitPane�� �����ӿ� ��ġ�Ѵ�.
		
		setSize(1080,720);
		setVisible(true);
	}
	public static void main(String[] args) {
		new _01_main();
	}
}
