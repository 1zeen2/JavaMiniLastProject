
public class 변수_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byte_value	= 10;	//	-128 ~ 127 사이의 숫자만 대입한다면 구분 없이 사용 가능
			//byteValue => 2가지의 단어가 나오면 _ 혹은 두 번째 단어의 첫 글자에 대문자를 사용하는 경우가 일반적이다.
		int intValue	= 20;	//	컴퓨터에서는 모든 숫자를 int로 인식한다. 정수의 default 값.	( -21억 4천 ~ 21억 4천 사이의 숫자만 가능)
			//	4byte
		long longValue	= 30L;	//	숫자 뒤에 L , l 을 사용하여 구분
			//	8byte
		float floatValue= 10.5F;
			//	4byte	=>	소수점 6자리까지 계산
		double doubleValue	= 10.5;	//	10.5D , 10.5d => D와 d는 생략이 가능. 실수의 default 값.
			//	실제 프로그램에서는 int , double 두 가지가 가장 많이 사용된다.
			//	변수 => 계속 상태가 변경 ... / 고정 => 상수
		boolean	booleanValue= true;
			//	=>	조건식 1byte	=> 저장은 true / false만 저장이 가능
		char charValue	=	'A';
			//	문자 1개 저장 공간 => 2byte ( 0 ~ 65535 )
/*
 * 		byte = **char = int = long	= double
 * 		boolean	  l
 *	 			 String
 *
 *
 */		
		char c1	= '된';
		char c2	= '장';
		char c3	= '국';
		char c4	= ' ';
		char c5	= '끓';
		char c6	= '이';
		char c7	= '는';
		char c8	= ' ';
		char c9	= '법';
			System.out.println(c1+""+c2+c3+c4+c5+c6+c7+c8+c9);
			
		String s = "된장국 끓이는 법";
			System.out.println(s);
	}

}