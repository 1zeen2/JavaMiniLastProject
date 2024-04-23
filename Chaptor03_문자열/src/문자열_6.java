
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alpha = "ABCDEFGHIJ";
		//				0123456789
		//	1. => C부터 J까지 출력을 원함.
		//	2. => EFG만 출력 원함.
		
		System.out.println(alpha.substring(2));
		System.out.println(alpha.substring(4, 7));
		
		String id = " admin ";
		System.out.println(id + "의 문자 개수 : " + id.length());
		//	" " => 공백도 하나의 문자로 들어감 => " admin " ===> 7글자
		
		id = id.trim();	//	좌우의 공백을 지워줌
		System.out.println(id + "의 문자 개수 : " + id.length());
		//	trim() => 좌우의 공백 제거 => 검색, 입력
		// " 감자" => 실수 (space)
		
		String msg = "Hello Java";
		//			  0123456789
		System.out.println(msg.indexOf("a"));
		System.out.println(msg.lastIndexOf("a"));
		
		String ext = "Hello.Java";
		System.out.println(ext.substring(ext.indexOf(".") + 1));	// substring로 자르는데 indexOf로 어디부터 자를지를 설정한다. '.'이 5번 위치기 때문에 +1 해줌.
		//업로드 / 다운로드																	lastindexOf로 잘라도 괜찮음.
		/*
		 * 데이터형
		 * 	정수 	: 정수만 저장				=> int, long, byte
		 * 								Integer, Long, Byte
		 *  실수 	: 실수만 저장				=> double
		 *  										Double
		 *  문자 	: 문자 1개 저장				=> char
		 *  논리 	: true / false				=> boolean
		 *  										Boolean
		 *  문자열	: 문자 여러개를 동시에 저장	=> String => 기능을 가지고 있다.
		 *  										 | 문자열을 제어하는 기능을 제공		
		 *  
		 */
		
			int a = Integer.parseInt("100");	// 문자열 "100"을 Integer형으로 변환.

	}

}
