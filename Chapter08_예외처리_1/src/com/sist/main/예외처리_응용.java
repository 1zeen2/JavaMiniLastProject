package com.sist.main;
// UpDown 게임
// 난수 발생

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;	// interface

public class 예외처리_응용 extends JFrame implements ActionListener {
	// 예외처리_응용 => 윈도우를 확장 => 상속(단일 상속 기본)
	JTextField tf;
	JButton b1, b2;
	JLabel la = new JLabel("", JLabel.CENTER); // 명시적 초기화
	// 클래스 => 변수 (객체) => 변수 사용(기본형, 배열, 클래스) => 멤버 변수로 사용이 가능하다.
	// 초기화, 화면 UI, 서버 연결 => 생성자에 주로 처리
	int com;	// 난수
	int user;	// 입력 값
	// 메서드 2개 이상 사용하기 위해 멤버 변수로 설정	=> 1. 입력 값을 받는 경우 / 2. 비교 시에 사용
	// 처리는 입력 => 엔터 => 입력값을 받는다, 비교 후 결과 값 출력한다.
	
	public 예외처리_응용() {
		tf = new JTextField();
		b1 = new JButton("시작");
		b2 = new JButton("종료");
		
		// 배치
		setLayout(null);
		
		tf.setBounds(10, 15, 150, 30);
		tf.setEnabled(false);	// 난수가 나온 후에 입력을 하게 하기 위해서 비활성화 상태를 default 로 둠
		// 윈도우에 추가
		add(tf);
		
		b1.setBounds(165, 15, 100, 30);
		add(b1);
		
		b2.setBounds(270, 15, 100, 30);
		add(b2);
		
		la.setBounds(10, 55, 360, 30);
		add(la);
		
		// 윈도우 크기 결정
		setSize(400, 135);
		setVisible(true);
		
		// 버튼 클릭을 위해서는 => 등록 ==> 버튼을 누를 때 마다 메서드를 호출
		b1.addActionListener(this); // => ActionPerformed 가 어디 있는지 생각 ==> 자신의 객체 이기 때문에 ===> this
		b2.addActionListener(this);
		tf.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// 생성자 호출
		new 예외처리_응용();
	}
	
	public void getRand () {
		com = (int)(Math.random() * 100) + 1;
		
	}
	
	public void compare() {
		if (com > user) {
			la.setText("입력 값 보다 큰 값을 입력하시오.");
			tf.setText("");
			tf.requestFocus();
		} else if (com < user) {
			la.setText("입력 값 보다 작은 값을 입력하시오.");
			tf.setText("");
			tf.requestFocus();
		} else {
			int no = JOptionPane.showConfirmDialog(this, "종료", "종료할까요?",
													JOptionPane.YES_NO_OPTION);
			if (no == JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			} else {
				tf.setText("");
				tf.setEnabled(false);
				b1.setEnabled(true);
				la.setText("");
			}
		}
	}
	// 예외 처리는 Error 발생 시 프로그램을 종료하는 것이 아니라 => 프로그램을 정상 상태로 유지하는 목적을 가지고 있다.
	// 예외 처리는 클래스 블럭에서는 사용이 불가능하다. ==> 초기화 블럭 / 메서드 / 생성자에서만 사용이 가능하다.
	// Button, JTextField (엔터로) 처리하는 기능 => 고정 ==> 구현을 할 수 없어서 선언만 해서 넘겨준다. ===> 프로그램에 맞게 구현해서 사용한다.
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b2) {
			System.exit(0);
		} else if (e.getSource() == b1) {
			getRand();	// com 에 난수 발생
			JOptionPane.showMessageDialog(this, "게임을 시작합니다!!");
			tf.setEnabled(true);
			tf.requestFocus();
			b1.setEnabled(false);
		}
		else if (e.getSource() == tf) {	// 입력 후 엔터를 쳤다면 입력 값을 읽어온다
			String no = tf.getText();
			// 예외 처리
			try {
				user = Integer.parseInt(no);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(this, "정수만 입력이 가능합니다.");
				tf.setText(""); // 입력 값을 지워주는 기능
				tf.requestFocus();
				// 다시 처음부터 동작을 하게 만든다
				return;	// 메서드에서 리턴을 사용하게 되면 메서드가 종료된다.
						// 프로그래머가 return 을 만들어 메서드를 강제로 종료시킬 수 있다.
			}
			// 메서드는 return 이 있을 때 종료. ==> 항상 마지막에 있는 것은 아니다.
			// 비교
			compare();
			// return ==> 생략 된 리턴. (자동으로 추가 되는 return)
		}
	}

}
