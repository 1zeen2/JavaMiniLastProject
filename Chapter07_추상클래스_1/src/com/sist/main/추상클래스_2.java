package com.sist.main;
// 이미 처리 메서드 명을 알고있다.
// 계산기의 경우 버튼 기능을 하는 메서드 24개를 만드는 것 보다 추상 메서드를 통하여 구현하는 것이 효율이 좋다.

abstract class Button {
	public abstract void click();
}

class Login extends Button {
	@Override
	public void click() {
		System.out.println("로그인 요청 ...");
	}
}

class Join extends Button {
	@Override
	public void click() {
		System.out.println("회원 가입 요청 ...");
	}
}

public class 추상클래스_2 {

	public static void main(String[] args) {
		Button btn = new Login();
		btn.click();
		
		btn = new Join();
		btn.click();

	}

}
