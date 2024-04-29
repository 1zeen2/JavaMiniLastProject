// 문자열을 거꾸로 출력하는 메서드를 구현하시오
public class 메서드_문제_7 {
	
	static void munje_7(String msg) {
		for (int i = msg.length() - 1; i >= 0; i--) {
			System.out.println(msg.charAt(i));
		}
		System.out.println();
		System.out.println(new StringBuffer(msg).reverse());
		
	}
	

	public static void main(String[] args) {			// gpt 나머지 작성도와줘
		
		munje_7(str);

	}

}
