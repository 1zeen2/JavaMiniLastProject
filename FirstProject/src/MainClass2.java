// 출력 형식
/*
 * 	= System.out.println();
 * 					=======> ln() => New Line
 *  = System.out.println("Hello");
 *  = System.out.println("Java");
 *  	Hello
 *  	Java
 * 	= System.out.printf();		===> 옆으로 출력
 * 	= System.out.printf("Hello ");		
 * 	= System.out.printf("Java");
 * 		Hello Java		
 * 	= System.out.printf();
 * 		서식이 있는 출력
 * 		%d	=>	정수
 * 		%f	=>	실수
 * 		%c	=>	문자
 * 		%s	=>	문자열
 * 
 * 		= 	자바에서 표현법
 * 			정수 표현법
 * 				=	10 진법	(0~9)	10	(10)	,	20	.....
 * 				=	8  진법	(0~7)	010	(8)
 * 				=	16 진법	(0~F)	0x10(16) => 색상에서 자주 사용
 * 				=	2  진법	(0~1)	0b10(2)
 *		======================================================================
 *				10	,	10L	=>	64bit	long
 *				int
 *				=>32bit
 * 			실수 표현법	=>	10.5, 10.5F
 * 							----  ----------=>	32bit	(4byte)	1byte => 8bit	
 * 							저장하는 메모리 크기 =>	64bit
 * 			문자 표현법	=>	'A'		=>	한글자만 사용이 가능
 * 			문자열 표현법	=>	"Hello"	=>	여러 문자 사용이 가능
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(010);
		//System.out.println(0X10);
		//System.out.println(0b10);
		//System.out.println(1000000000000000L);
		//System.out.println("1000000000000000");
		//System.out.println("\"홍길동\"");			//"홍길동"	=>	명령문이 종료하는 시점에는 반드시 ;를 사용해야 함
		//System.out.println("c:\\javaDev\\movie.txt");	// C:\JavaDev => 경로를 가지고 올 때 \를 하나씩 더 사용해줘야 함
		//System.out.println("홍길동\t남자");	//홍길동	(공백	)	남자 출력 원할 때
		//System.out.println("홍길동\n남자");	//홍길동	(줄바꿈)	남자 출력 원할 때
		//---------------------------------------------------------------------------------------------------
		//홍길동	남자	26	출력하기
		//System.out.printf("홍길동\t");
		//System.out.printf("남자\t");
		//System.out.printf("26");
		/*	★
		 * 	★★
		 *	★★★
		 *	★★★★
		 *	★★★★★
		 *	☆
		 */
		System.out.println('★');
		System.out.println("★★");
		System.out.println("★★★");
		System.out.println("★★★★");
		System.out.println("★★★★★");
		
		
		/*
		 * for(int i=0;i<=5;i++) { for (int j=0;j<=5-i;j++);{ System.out.print("*"); } }
		 */
		 
		System.out.println("10 20 30 40 50");
		System.out.printf("%-3d%-3d%-3d%-3d%-3d\n", 10, 20, 30, 40, 50);	
		System.out.printf("%3d%3d%3d%3d%3d", 10, 20, 30, 40, 50);			
		// ㅇ ㅇ ㅇ
		// 1 0		=>	-가 붙으면 왼쪽 정렬
		//    1 0 	=>	+가 붙으면 오른쪽 정렬
		
		}

}
