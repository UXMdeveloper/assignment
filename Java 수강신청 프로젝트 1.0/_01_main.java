package javaGUI;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class _01_main extends JFrame{
	//여기에 JList의 아이템들을 담아둘 변수/배열 등등을 선언 ->DB공부 이후
	
	//생성자 ->GUI 구현은 항상 생성자에서
	_01_main(){
		setTitle("MJ 수강신청");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JSplitPane sp= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		
		//버튼에 테두리 지정
		LineBorder b1 = new LineBorder(Color.GREEN,2);
		LineBorder b2 = new LineBorder(Color.RED,2);
		//List위치 확인용 테두리.
		LineBorder b3 = new LineBorder(Color.BLUE,1);
		
		//좌측의 책가방과 수강신청 완료 리스트를 분리하는 SP
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
		
		JLabel storageLb = new JLabel("  담기");
		JList storageList = new JList(); //책가방 리스트
		storageList.setBorder(b3);
		JLabel completeLb = new JLabel("  수강신청 과목");
		JList completeList = new JList();//수강신청 완료된 리스트
		completeList.setBorder(b3);
		//배치관리자 이용해서 위치, 간격 조절 
		pn1.add(storageLb,BorderLayout.NORTH);
		pn1.add(storageList,BorderLayout.CENTER);
		
		pn2.add(completeLb,BorderLayout.NORTH);
		pn2.add(completeList,BorderLayout.CENTER);
		
		leftsp.setTopComponent(pn1);
		leftsp.setBottomComponent(pn2);
		
		//버튼에 이미지 추가
		JButton searchCategoryBt =new JButton("카테고리 검색");
		searchCategoryBt.setBounds(37, 30, 120, 40);
		searchCategoryBt.setFont(new Font("함초롱돋움",Font.BOLD,10));
		searchCategoryBt.setBorder(b1);
		searchCategoryBt.setBackground(Color.WHITE);
		
		JButton searchAllBt = new JButton("과목명 검색");
		searchAllBt.setBounds(37, 100, 120, 40);
		searchAllBt.setFont(new Font("함초롱돋움",Font.BOLD,10));
		searchAllBt.setBorder(b1);
		searchAllBt.setBackground(Color.WHITE);
		
		JButton deleteBt = new JButton("삭제");
		deleteBt.setBounds(37, 170, 120, 40);
		deleteBt.setFont(new Font("함초롱돋움",Font.BOLD,10));
		deleteBt.setBorder(b2);
		deleteBt.setBackground(Color.WHITE);
		
		pn3.add(searchCategoryBt);
		pn3.add(searchAllBt);
		pn3.add(deleteBt);
		
		//일단 이거는 DB에서 불러올 개인정보
		String [] personal = {"학과","융소","학년", "2","이름","유원준","학번","60191669"};
		
		sp.setDividerSize(1); //경계선 표시 두께 지정
		sp.setResizeWeight(0.80); // splitPane 비율 조절
		leftsp.setDividerSize(0);
		leftsp.setResizeWeight(0.50);
		sp.setLeftComponent(leftsp);
		sp.setRightComponent(pn3);
		getContentPane().add(sp); //JSplitPane을 프레임에 배치한다.
		
		setSize(1080,720);
		setVisible(true);
	}
	public static void main(String[] args) {
		new _01_main();
	}
}
