package com.sist.main;
// 메서도 오버라이딩
class Music {
	int count = 10;
	public void list() {
		System.out.println("목록을 출력합니다");
	}
	public void detail() {
		System.out.println("상세 보기");
	}
	public void find() {
		System.out.println("뮤직 검색");
	}
}
class Genie extends Music {
	int musiccount = 200;
	
	@Override
	public void list() {
		
		System.out.println("Genie 뮤직에서 목록 출력");
	}

	@Override
	public void detail() {
		System.out.println("Genie 뮤직에서 상세 보기");
		
	}

	@Override
	public void find() {
		System.out.println("Genie 뮤직에서 검색");
	}
	
	
}
class Melon extends Music {
	@Override
	public void list() {
		
		System.out.println("Melon 뮤직에서 목록 출력");
	}

	@Override
	public void detail() {
		System.out.println("Melon 뮤직에서 상세 보기");
		
	}

	@Override
	public void find() {
		System.out.println("Melon 뮤직에서 검색");
	}
}
class Mnet extends Music {
	@Override
	public void list() {
		
		System.out.println("Mnet 뮤직에서 목록 출력");
	}

	@Override
	public void detail() {
		System.out.println("Mnet 뮤직에서 상세 보기");
		
	}

	@Override
	public void find() {
		System.out.println("Mnet 뮤직에서 검색");
	}
}
public class MainClass_8 {
	// 유사항 클래스를 여러 개 모아서 1개 객체로 제어 => 상속
	/*
	 * 상속을 받는 경우
	 * 변수 : 선언하는 클래스만
	 * 메서드 : 생성자에 따라
	 * 생성자 => 상속의 제외 조건
	 * 
	 * class A
	 * class B extend A
	 * 
	 * A a = new B();	=> 변수 A 메서드 B ===> 클래스가 여러 개 인 경우 사용
	 * A a = new A();	=> 변수 A 메서드 A
	 * B b = new B();	=> 변수 B 메서드 B *** 가장 많이 사용하는 형식
	 * --------------------
	 * B b = new A(); => 라이브러리 (값을 받는 경우)
	 * -------------- dhfb
	 */

	public static void main(String[] args) {
		System.out.println("======= 지니 뮤직 ==========");
		// 생성자를 통하여 메서드를 호출하는 코드
		Music m = new Genie();
		// Music 변수를 이용하였기 때문에 count만 호출 가능
		int count = m.count;
		
		Genie m2 = new Genie();
		// Genie 변수를 이용하였기 때문에 musiccount 호출 가능
		int musiccount = m2.musiccount;
		
		m.detail();
		m.list();
		m.find();
		
		System.out.println("============ 멜론 뮤직 ============");
		m = new Melon();
		
		m.detail();
		m.list();
		m.find();
		
		System.out.println("=========== 엠넷 뮤직================");
		m = new Mnet();
		
		m.detail();
		m.list();
		m.find();
		
	}

}
