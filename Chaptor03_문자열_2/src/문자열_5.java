
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "HELLO";

		/*
		 * equalsIgnoreCase	: 대소문자 구분 없이 비교	==> 아이디
		 * equals 			: 대소문자 구분			==> 비민번호
		 * 대소문자 구분이 없음
		 * 결과 값 : true, false = 조건문에서 주로 적용
		 */
/*		if (s1.equalsIgnoreCase(s2)); { // 같은 경우 true => 다른 경우 false
			System.out.println("s1과 s2가 같다");
		} else {
			System.out.println("s1과 s2가 다르다");
		}
*/
		String msg = "Hello Java";
		
		for (int i = msg.length() - 1; i >= 0; i--) { // 번호는 0번부터 시작이라 -1을 사용한ㅐ)
			System.out.print(msg.charAt(i));
			
		}
			//length () ===> 문자 개수 => index 0;
	}

}
