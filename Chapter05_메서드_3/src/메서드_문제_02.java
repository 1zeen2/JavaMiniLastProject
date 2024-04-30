// 정수를 입력 받아서 이진법을 출력하는 메서드 작성 (3개)
// 정수입력
// 이진법 처리
// 출력
/*
 * 입력 값 받는 라이브러리 만들기. (정수)
 * 출력을 이진법으로. 0 ~ 32767 사이의 정수
 */
import java.util.Scanner;

import javax.xml.transform.Result;

public class 메서드_문제_02 {
	static int input (int num) {
		Scanner scan = new Scanner(System.in);
		System.out.println("0 ~ 32767 사이의 정수를 입력하세요.");
		return scan.nextInt();
	}
	static String changeBinary(int number) {
		String binary = Integer.toBinaryString(number);
		
		StringBuilder result = new StringBuilder();
	    for (int i = 0; i < binary.length(); i++) {
	        result.append(binary.charAt(i));
	        if ((i + 1) % 4 == 0 && i != binary.length() - 1) {
	            result.append(" ");
	        }
	    }
		return result.toString();
	}
	
	public static void main(String[] args) {
 
	}

}
