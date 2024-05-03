/*
 * 	static 메서드
 * 	-----------
 * 		=> static 변수만 사용이 가능
 * 		=> 멤머 변수를 사용하려면 => 객체 생성 new를 사용해야 한다
 * 	멤버 메서드 (********) = 5장 시작
 * 		=> static 변수, 멤버 변수를 사용할 수 있다.
 * 
 */
public class 멤버변수_활용3 {
	int a = 10;
	static int b = 20;
	// 공통으로 사용되는 메서드
	static void display() {
		멤버변수_활용3 ss = new 멤버변수_활용3();
		System.out.println("a = " +ss.a);
	}
	// 클래스 멤버 메서드
	void print () {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		

	}

}
