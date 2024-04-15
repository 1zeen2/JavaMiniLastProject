import java.util.*;	//	자바에서 지원하는 라이브러리를 읽어온다.

public class 연산자_산술연산자 {
	/*
	 * 	() : 최우선 순위 연산자
	 * 	5 + 5 * 10	=>	55		/	괄호를 사용하면 연산 순서를 바꿀 수 있다.
	 * 		------
	 * 		  1번
	 * 	-----
	 * 	 2번
	 * 	
	 * 	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수를 선언합니다.
		int num1, num2; // 초기화가 되지 않아 이대로 출력하면 오류가 발생.
		
		//초기롸를 합니다.
		Random r = new Random();	//	임의의 수 추출
		
		num1 = r.nextInt(101);	//	0 ~ 100까지 사이의 정수 추출 => 마지막 제외
		num2 = r.nextInt(101);	
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		int plus = num1 + num2;
		System.out.println("plus = " + (plus));
		
		System.out.println(5 + 5 * 10);
		System.out.println((5 + 5) * 10);
		
		int minus = num1 - num2;
		System.out.println("minus = " + minus);
		
		int gop = num1 * num2;
		System.out.println("gop = " + gop);
		
		int a = 10, b = 3;
		System.out.println(a/(double)b);	
		//	int => double로 변경 (double)변수명 => 데이터형 변경
		//	값이 있는 경우 => .0
		System.out.println(a%b);
		System.out.println(a%-b);
		System.out.println(-a%b);
		System.out.println(-a%b);
	}

}
