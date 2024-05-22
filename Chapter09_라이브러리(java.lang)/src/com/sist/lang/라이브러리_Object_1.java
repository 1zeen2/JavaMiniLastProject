package com.sist.lang;
// toString
import javax.swing.*;
import java.awt.event.*;
/*
 * class JFrame extends Object
 * class 라이브러리_Object_1 extends JFrame
 * 		 ------------------ Object, JFrame ==> 이중 상속
 * 
 * 	클래스의 크기
 * 	------------
 * 		상속 => 상속을 내리는 클래스 > 상속을 받는 클래스
 * 		포함 => 포함하고 있는 클래스가 크기가 크다.
 * 
 */
class A {
	// 인스턴스는 생성자를 만들고 호출을 해야 사용이 가능하지만 
	// static은 static block에서 초기화 후에 바로 사용이 가능하다
	// ==> new 필요 없기 때문에
	static int[] arr = new int[10];	// A.arr
	static {
		// 초기화
		
	}
	
}

public class 라이브러리_Object_1 extends JFrame implements ItemListener {
	JComboBox box;
	JLabel la;
	
	public 라이브러리_Object_1() {
		// 인스턴스 변수 / 클래스는 => 초기화 (생성자) => 가장 먼저 호출을 해야 한다.
		// static => 자동 메모리 저장 => 생성자가 필요 없는 경우도 존재 => static{}
		box = new JComboBox();
		box.addItem("홍길동");
		box.addItem("심청이");
		box.addItem("이순신");
		box.addItem("박문수");
		box.addItem("강감찬");
		// 원형 => 접근 지정어 (public), return type / parameter 
		/*
		 * Object 는 가장 큰 데이터형이다. => 모든 데이터를 받을 수 있다.
		 * Object o = ""
		 * o = 10
		 * o = 10.9
		 * o = true
		 * o = new A();
		 * Object [] => 데이터 형을 섞어서 사용이 가능하다.
		 */
		la = new JLabel("", JLabel.CENTER);
		
		// 배치
		setLayout(null);
		
		box.setBounds(10, 15, 300, 30);
		add(box);
		
		la.setBounds(10, 50, 300, 30);
		add(la);
		
		
		setSize(350, 150);
		setVisible(true);
		
		box.addItemListener(this);
		
	}
	public static void main(String[] args) {
		new 라이브러리_Object_1();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		String name = box.getSelectedItem().toString();
		la.setText(name);
	}
	
}
