/*
 * 		byte , char , int , long , float , double
 * 		기타 : boolean
 * 
 * 		1.	데이터 형의 크기
 * 			byte	<	char	<	int	<	long	<	float	<	double
 * 			=> 크기의 기준 : 수 표현의 갯수
 * 				1 => 1.000000
 * 
 * 			int a = 10L		==> error
 * 			---		---
 * 			 4		 8
 * 
 * 			long a = 10;	==> ok
 * 			----	----
 * 			 8		  4
 */
public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동 형변환 , 강제 형변환 (int)'A'
		int a = 'A';				//문자 'A'의 값을 int로 변환하여 a에 대입
			System.out.println(a);
		char c = 65;				//정수 65의 값을 문자로 변환하여 c에 대입
			System.out.println(c);
		double d = 'A';				//문자 'A'의 값을 double로 변환하여 d에 대입
			System.out.println(d);
		byte b1 = 10;
		byte b2 = 110;
		byte b3 = (byte)(b1+b2);	// byte	+	byte	=	int
									// char	+	char	=	int
			System.out.println(b3);
		
	}

}
