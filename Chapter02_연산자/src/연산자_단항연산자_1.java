/*
 * 단항연산자
 * 	= 증감연산자 : ++. -- => 1개 증가, 1개 감소
 * 		int a = 10;
 * 		a++;		==> (a + 1) ==> 11
 * 		a--;		==> (a - 1) ==> 9
 * 
 * 			==>	전치 연산	: 먼저 증가 후에 대입
 * 				++a;
 * 				--a;
 * 			==>	후치 연산	:	대입 후에 나중에 증가
 * 				a++;
 * 				a---;
 * 
 * 			int a = 10;
 * 			int b = ++a;
 * 				1) a 값을 증가.
 * 				2) 증가값을 b에 대입
 * 			------------------- a = 11, b = 11
 * 			int a = 10;
 * 			int b = a++;
 * 				1) a 값을 b에 대입
 * 				2) a 값 1개 증가
 * 				** a는 전치 / 후치 상관 없이 무조건 1개 증가
 * 			-------------------	a = 11, b = 10
 * 		
 * 			1) 예제
 * 				int a = 10;
 * 				int b = ++a + ++a + a++
 * 				a => 13
 * 				b => 
 * 
 * 	= 부정연산자
 *  = 향뱐횐연산자 => boolean 제외.
 */
public class 연산자_단항연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = ++a + ++a + a++;
		System.out.println("a = " + a + " b =" + b);
		
		int c = 10;
		++c;
		++c;
		++c;
		System.out.println("c ="+ c);
		
		int d = 10;
		--d;
		--d;
		--d;
		System.out.println("d = " + d);
	}

}
