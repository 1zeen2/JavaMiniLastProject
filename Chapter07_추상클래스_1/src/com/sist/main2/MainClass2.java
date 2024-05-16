package com.sist.main2;
/*
 * 	추상 클래스의 단점
 * 		=> 상속을 내리는 클래스 => 상속을 받을 수는 없다.
 */

abstract class AAA {
	int a;
	public abstract void aaa();
	public void bbb() {
		
	}
}

class BBB extends AAA {
	int b;
	public void ccc() {
		
	}
	
	@Override
	public void aaa() {
		
	}
}

class CCC {
	int a, b;
	public void ddd() {}
}

class DDD extends CCC {
	int c;
	public void eee(){}
	
}
/*
 * 	상속을 내린 클래스는 =? 자신의 변수, 메서드
 * 	상속을 받은 클래스는 => 자신의 변수, 메서드 => 상속 받은 변수, 메서드 사용이 가능하다.
 * 	CCC	선언 => a, b, ddd()
 * 	DDD 선언 => a, b, ddd(), eee() 
 */
public class MainClass2 {

	public static void main(String[] args) {
		AAA aa = new BBB();
		aa.bbb();
	}
}
