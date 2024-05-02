// 문자열의 소문자를 대문자로 바꾸는 메서드를 구현하시오

import java.util.Scanner;

public class 메서드_문제_5 {
	
	static String munje_5(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'A' && c <= 'Z') {
//				res + c;
				
			} else if (c >= 'a' && c <= 'z') {	
				res += (char)(c-32);
			} else {
//				res + c;
			}
		}
		//return str.toUpperCase();
		return res;
	}

	public static void main(String[] args) {			// gpt 통해서 해설.
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열 출력");
		String str = scan.next();
		String res = munje_5(str);
		System.out.println(res);
		

	}
 
}
