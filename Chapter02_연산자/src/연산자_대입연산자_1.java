/*
 * 	대입연산자 => 메모리에 저장
 * 			   ---- 변수
 * 
 * 		=>	int a = 10;
 * 					10은 a라는 메모리에 저장 (대입)
 * 		=>	형변환
 * 			int a = 'A'
 * 			---		---
 * 			4byte	2byte	==> 작은 값은 대입이 가능.
 * 			=>		'A'		==> 65로 변경 후에 저장
 * 			long l = 20;
 * 			----	 ---	==>	**20이 아니라 20L로 바뀐다.
 * 			8byte	4byte
 * 
 * 			double d = 20;
 * 
 * 		= 대입연산자
 * 		----------
 * 		복합대입연산자
 * 
 * 		+=
 * 			int a = 10;
 * 							<======== 방향으로 연산.
 * 				a += 1; 	==> a = a + 1;	===> a = 11
 * 								    ------	
 * 						   	   ---
 * 				a += 10;	==> a = a + 10;	===> a = 20 	 					
 * 		-=
 * 				a -= 1;		==> a = a - 1;	===> a = 9
 * 				a -= 10;	==> a = a - 10;	===> a = 0
 * 		*=
 * 				a *= 2;		==> a = a *2;	===> a = 20
 * 		/=
 * 				a /= 2'		==> a = a /2; 	===> a = 5
 * 
 * 			int a = 10;
 * 				a = a++;
 * 				a = a++;
 * 				a = a++;
 * 				a = a++;
 * 				a = a++;
 * 
 * 				a += 5;
 * 
 * 				a -= 100; ===> a -- *100 
 * 
 * 			=> 누적, 문자열 결합 할 때 많이 씀
 */
public class 연산자_대입연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l = 20;
		double d = 20;
		System.out.println("d = " + d);
		
		int a = 10;
		a++;
		a++;
		a++;
		a++;
		a++;
		System.out.println("a = " + a);

		int b = 10;
		b += 5;
		System.out.println("b = " + b);
		
		/*
		 * 	한개 증가		/	한개 감소		a = a + 1;	/ a = a - 1;
		 * 	++			--
		 * 	여러개 증가	/	여러개 감소	a += 5;	/ a -= 5;
		 * 	+=				-=
		 */
		
		int score1 = 10, score2 = 5;
		score1 += score2;
		//	score1 + score2 ==> score1 ===> 15
		System.out.println("score1 = " + score1);	// 15
		score1 -= score2;
		//	score - score2 	==>	socre2 ===> 10
		System.out.println("score1 = " + score1);	// 10
		
		// 변수 값이 변경 ==> ++, --, +=, -=
		// 나머지 연산자는 변수 값 변경이 안된다.
		
		int m = 10, n = 20;
		m ++;
		m += 10;
		System.out.println("n = " + n);
		System.out.println("m + n = " + (m + n));

	}

}
