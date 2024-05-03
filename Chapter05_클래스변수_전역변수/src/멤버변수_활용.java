/*
 * ---------------
 * class Sawon {
 * 	String name;
 * 	String dept;
 * }
 * --------------- 변수가 아니라 데이터형 (Sawon 데이터형)을 만들었다고 생각 => 사용자 데이터형
 * public class MainClass {
 * 	Sawon s = new Sawon(); =====> 모든 메서드에서 Sawon 클래스를 이용하려면 전역 변수로 두어야 한다. ==> 메서드 안으로 들어가면 블럭이 끝나는 순간 값이 사라짐.
 * 									=> 전역 변수로 사용하거나, 리턴 값, 매개 변수로 받거나. => 전역 변수가 대부분의 경우 더 편한 경우가 많다.
 * 
 * 	static void aaa() {
 * 		Sawon s = new Sawon();----------|
 * 	}									|
 * 	static void bbb() {					|
 * 		Sawon s = new Sawon();----------|	==> 메서드 안에 있는 변수는 호출 후에 사라진다.
 * 	}									|	==> aaa(), bbb(), ccc() 안에 있는 변수는 전부 다른 변수이다.
 * 	static void ccc() {					|
 * 		Sawon s = new Sawon();----------|
 * 	}
 * 	public static void main(String[] args) {
 * 
 *  }
 *  
 * 	메서드 안에서만 사용 => 지역 변수
 * 	랙
 * 	전체 메서드에서 사용 => 멤버 
 * 
 * 
 * 
 */
public class 멤버변수_활용 {
	static void aaa() {
		int a = 100;
		System.out.println("aaa 의 a 값은 : " + a);
	}
	
	static void bbb() {
		int a = 200;
		System.out.println("bbb 의 a 값은 : " + a);
	}
	
	static void ccc() {
		int a = 300;
		System.out.println("ccc 의 a 값은 : " + a);
	}

	public static void main(String[] args) {
		aaa();
		bbb();
		ccc();
		

	}

}
