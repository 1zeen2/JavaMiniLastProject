package com.sist.main;

class Movie {
	void display() {};
}
class MegaBox extends Movie {
	// int display() {};	 ===> 오버 라이딩 ===> 메서드의 확장, 축소 ====> 오버 라이딩 하는 경우에는 리턴 형이 반드시 동일해야 한다.
	
	int display(int a) {	//==> 오버 로딩 =====> 같은 이름으로 다른 메서드를 이용
	// void display()	===> 현재 상속받아 가지고 있는 메서드
		return 10;	// 다른 메서드를 선언.
	}
//	void display() {};
//	protected void display() {};
//	public void display() {};
//	private void display(){}; <<<<<========== 불가능. 접근 지정어의 범위가 동일하거나 커져야 하는데 default 보다 private 가 범위가 좁아 오류가 발생.
	/*
	 * 	 ***** Overriding *****
	 * 	1. 상속 => 재정의 (상속 받은 클래스의 메서드 내용을 변경해서 사용)
	 * 	2. 메서드 명이 동일해야 한다
	 * 	3. 매개 변수가 동일해야 한다. (매개 변수가 다른 메서드는 ==> 완전히 다른 메서드이다. ==> 오버로딩이다.)
	 * 	4. 리턴 형이 동일해야 한다.
	 * 	5. 접근 지정어가 동일, 확대가 되어야 한다.
	 * 	
	 * 	private < default < protected < public
	 * 
	 * 	=> 라이브버리 => 오버라이딩
	 * 	   ----------------------- 한국 IT 개발에 잘 맞지 않는다.
	 * 	=> 상속 여러 개 있는 경우에는 가장 큰 클래스를 상속받는다.
	 */
}

public class MainClass_9 {

	public static void main(String[] args) {
		

	}

}
