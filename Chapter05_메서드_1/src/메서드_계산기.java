// 사용자로부터 2개의 정수를 받아 결과 값을 전송하는 프로그램
import java.util.*;

public class 메서드_계산기 {
	static int add (int a, int b) {
		return a + b;
	}
	// 사용자 요청 => 매개 변수
	// => 처리 결과 값
	// 리턴 형은 1개만 사용이 가능
	/*
	 * 				데이터 첨부 => 매개 변수
	 * 			----- | | -------
	 * 			|				|
	 * 			|		처리		|	===> {구현부}
	 * 			|				|
	 * 			------------| |--
	 * 						결과 값 도출 => return형
	 * 예)
	 * 	과일 ======> 믹서기 ======> 즙
	 * 	 |
	 * 	매개 변수		구현			결과
	 * 
	 * 	GPT
	 * 	사용자 입력	====> 구글링 / 데이터 만들기	====> 만든 데이터를 화면에 출력
	 * 		|					|					
	 * 	 매개 변수				메서드 (구현)
	 * 
	 * 	1. 사용자가 보내주는 값 => 어떤 값을 받을 지 => 매개 변수
	 * 	2. 처리 방법 ==> {구현부}
	 * 		=> 변수 / 연산자 / 제어문 ===> 명령문
	 * 								  -----
	 * 								명령문의 집합
	 * 	3. 어떤 결과 값 도출 ==> 리턴 형
	 * 	--------------------------------------------------------------
	 * 	| 소스를 구분 => 기능 별 분리 => 알아보기가 쉽다, 오류 시에 메소드만 찾으면 된다.
	 * 								필요시에 변경이 가능
	 * 	| 재사용이 가능하다
	 * 	| 게임을 다시 시작할 수 있다
	 * 	| 메서드는 호출 시 마다 처음부터 다시 구동.
	 * 	| 결과 값이 많은 경우.
	 * 	  ---------------- 정렬 => 배열을 이용.
	 * 	  => 리턴형 => 배열, 정수, 실수, 문자열, 문자, 논리형, 클래스
	 * 				 ------------------------------------- 기본형
	 * 		int[] method()
	 * 		데이터형 / 배열 / 메서드명
	 * 		int method()
	 * 		데이터형 / 메서드명
	 * 	  = 리턴형과 매개 변수의 차이점은 (한 개, 여러 개)
	 * 			   -------
	 * 				| 개수를 모르는 경우
	 * 				  회원 가입 => 필수 외의 값은 입력을 하지 않아도 괜찮아서 몇 개의 정보가 넘어올 지 모름.
	 * 				  ------------------------------------------------------------------
	 * 					가변 매개 변수 (...)
	 * 	
	 * 	
	 */
	static int minus (int a, int b) {
		return a - b;
	}
	static int gop (int a, int b) {
		return a * b;
	}
	// 리턴 형은 고정이 아니기 때문에 프로그램에 맞게 설정하여 사용해야 한다
	static String div (int a, int b) {
		String result = "";
		if (b == 0)
			result = "0으로 나눌 수 없습니다.";
		else
			result = String.valueOf(a / b);
		return result;
	}
	// 계산기
	static void process() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하시오 : ");
		int num1 = scan.nextInt();
		System.out.println("연산자를 입력하시오 (+, -, *, /");
		char op = scan.next().charAt(0);
		System.out.println("두 번째 정수를 입력하시오.");
		int num2 = scan.nextInt();
	
		switch (op) {
		case '+':
			System.out.printf("%d + %d = %d\n", num1, num2, add(num1, num2));
			break;
		case '-':
			System.out.printf("%d - %d = %d\n", num1, num2, minus(num1, num2));
			break;
		case '*':
			System.out.printf("%d * %d = %d\n", num1, num2, gop(num1, num2));
			break;
		case '/':
			System.out.println(div(num1, num2));
			break;
		}
	}
	public static void main(String[] args) {
		process();
		// 연결만 한다 / object는 모든 데이터형을 받을 수 있다.
		// PrintStream java.io.PrintStream.printf(String format, Object... args)
		//														 --------- 가변 매개 변수
		System.out.printf("");
		
		Object i = 10;
		i = "";
		i = 'A';
		i = 10.5;
		i = true;
	}
}
