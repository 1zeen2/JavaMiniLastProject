public class 자바제어문_조건문_3 {

	public static void main(String[] agrs) {
		char c = 'K';
		if ('A' <= c && c <= 'Z') {
			System.out.println(c + "는(은) 대문자");
			System.out.println(c + "의 소문자는" + (char)(c+32));
		} else {
			System.out.println(c + "는(은) 소문자");
			System.out.println(c + "의 소문자는" + (char)(c-32));
			}
	}
}	
