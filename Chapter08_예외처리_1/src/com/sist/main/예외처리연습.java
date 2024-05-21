package com.sist.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 타이핑 할 텍스트 필드, 시작, 종료 버튼, 숫자가 저장될 텍스트에어리어 선언.
public class 예외처리연습 extends JFrame implements ActionListener {
	JTextField tf;
	JButton b1, b2;
	JTextArea ta;
	
	int[] com = new int[3];
	int[] user = new int[3];
	int s, b;
	
	// 생성자를 선언하여 예외처리연습 객체를 만들고 안에 값을 참조.
	public 예외처리연습() {
		tf = new JTextField();
		b1 = new JButton("시작");
		b2 = new JButton("종료");
		
		// 컨테이너에 추가되는 각 컴포넌트를 직접 프로그래머가 설정하는 방식.
		setLayout(null);
		
		// 각 멤버 변수의 값을 설정해줍니다.
		tf.setBounds(10, 15, 150, 30);
		tf.setBounds(null);
		add(tf);
		
	    b1.setBounds(165, 15, 100, 30);
	    add(b1);
		
		b2.setBounds(270, 15, 100, 30);
		add(b2);
		
		ta.setEditable(false);
		JScrollPane js = new JScrollPane(ta);
		js.setBounds(10, 55, 360, 300); // JScrollPane 위치 및 크기 설정
        add(js);
		
        // 프레임 크기는 크게 중요하지 않음.
        // 안에 구현해야 하는 컴포넌트 들을 초기화 하고 원하는 기능이 구현이 되는지를 우선적으로 확인한 후
        // 프레임 크기를 지정한다.
        setSize(400, 400);
        setVisible(true);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        tf.addActionListener(this);
        
	}
	public static void main(String[] args) {
		new 예외처리연습();
	}
	
	// 중복 없는 난수를 생성하는 메서드를 구현
	public void getRand() {
		for (int i = 0; i < 3; i++) {
			com[i] = (int) (Math.random() * 9 ) + 1;
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	// 각 배열에 할당된 숫자가 포함되어 있고, 같은 인덱스에 있는지를 비교하며 s, b로 힌트를 줍니다.
	public void compare() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b2) {
			System.exit(0);
		} else if (e.getSource() == b1) {
			
		
			
		}
	}
}
   