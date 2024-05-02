
public class 메서드정리_2 {
	// 매개 변수 전송 법 = > 메서드 안에서만 변경 => Call By Value
	static void swap(int a, int b) {
		System.out.println("변경 전 : a = " + a + ", b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("변경 후 : a = " + a + ", b = " + b);
	}
	
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		swap(a, b);
		
		System.out.println("main => 원본 값 : a = " + a + ", b = " + b);
		// 원본이 저장된 메모리와 전송받은 메모리가 따로 생성이 되어 원 값에 영향력을 미치지 않는다.
		// 기본형, String = Call by Value
	}

}
