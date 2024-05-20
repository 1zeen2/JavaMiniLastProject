package com.sist.main4;
// javax.swing 패키지에서 Swing 컴포넌트를 가져옵니다.
import javax.swing.*;
// javax.swing.table 패키지에서 테이블 모델 클래스를 가져옵니다.
import javax.swing.table.DefaultTableModel;

import java.awt.*;			// AWT 패키지에서 그래픽 및 레이아웃 관련 클래스를 가져옵니다
import java.awt.event.*;	// AWT 패키지에서 이벤트 관련 클래스를 가져옵니다.

// 게시판 목록 클래스는 JFrame을 상속하여 GUI 창을 생성합니다.
public class 게시판목록 extends JFrame {
	// JLabel을 생성하며 "게시판" 이라는 제목을 가운데 정렬하여 표시합니다.
	JLabel titleLa = new JLabel("게시판", JLabel.CENTER);
	// JLabel을 생성하여 현재 페이지 정보를 표시합니다. 초기 값은 "0page / 0pages" 입니다.
	JLabel pageLa = new JLabel("0 page / 0 pages");
	// JButton 객체를 생성하여 "새 글", "이전", "다음" 버튼을 만듭니다.
	JButton b1, b2, b3; 
	// JTable 객체를 생성하여 테이블 형태로 데이터를 표시합니다.
	JTable table;	
	// DefaultTableModel 객체를 생성하여 테이블의 데이터를 관리합니다.
	DefaultTableModel model;
	
	// 생성자: 객체가 생성될 때 호출됩니다. 초기화 작업과 화면 UI 설정을 수행합니다.
	public 게시판목록() {
		 // JButton 객체를 초기화하고, "새 글", "이전", "다음" 버튼을 생성합니다.
		b1 = new JButton("새 글");
		b2 = new JButton("이전");
		b3 = new JButton("다음");
		
	
		// 테이블의 열 제목을 정의합니다.
		String[] col = {"번호", "제목", "이름", "작성일", "조회수"};
		// 초기 데이터는 비어있는 2차원 배열로 설정합니다.
		String[][] row = new String[0][5];
		// DefaultTableModel 객체를 초기화하고, 빈 데이터와 열 제목을 설정합니다.
		model = new DefaultTableModel(row, col);
		// JTable 객체를 초기화하고, 모델을 설정합니다.
		table = new JTable(model);
		// JScrollPane 객체를 생성하여 테이블을 스크롤 가능하게 만듭니다.
		JScrollPane js = new JScrollPane(table);
		
		// 레이아웃 매니저를 null로 설정하여 직접 배치합니다.
		setLayout(null);
		// JLabel의 폰트를 "맑은 고딕", 굵은 글씨, 크기 35로 설정합니다.
		titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		// JLabel의 위치와 크기를 설정합니다.
		titleLa.setBounds(10, 15, 500, 40);
		// JFrame에 JLabel을 추가합니다.
		add(titleLa); 
		
		b1.setBounds(10, 45 , 100, 30);
		add(b1);
		
		js.setBounds(10, 95, 520, 380);
		add(js);
		
		JPanel p = new JPanel();
		p.add(b2);
		p.add(pageLa);
		p.add(b3);
		
		p.setBounds(10, 480, 520, 35);
		add(p);
		
		setSize(550, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new 게시판목록();
	}

}
