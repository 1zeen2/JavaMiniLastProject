// char return ==> 알파벳을 전송하여 대문자는 소문자로, 소문자는 대문자로 변경하여 출력.
public class 메서드_7 {
	static char upper (char c) {
		return (char)(c - 32);	// 'a' == 97 / 'A' == 65
	}
	static char lower (char c) {
		return (char) (c+ 32);
	}

	static char upperLower (char c) {
		char res = ' ';	// 결과 값이 정해져 있는 경우	=> 변수
		if (c >= 'A' && c < 'Z')
				res = (char)(c + 32);
		else
			res = (char)(c - 32);
		return res;	// 
	}
	public static void main(String[] args) {
/*		char c = upper('m');
		System.out.println(c);
		
		c = lower('M');
		System.out.println();
*/

		char c = upperLower('A');
		System.out.println(c);
		System.out.println('a');
		System.out.println(c);
	}

}
