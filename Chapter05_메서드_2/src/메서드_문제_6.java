// 문자열을 입력받아 좌우 대칭인지 확인하는 메서드를 구현.

import java.util.Scanner;

public class 메서드_문제_6 {
	
	static void munje_6(String msg) {
		// 구글 기출 문제
		if (msg.length() % 2 != 0) {	// 짝수가 아니면 좌우 대칭이 나올 수가 없기 때문에 % 2 == 0 이 되어야 한다.
			System.out.println("잘못된 입력 입니다.");
			return;	// 메서드 종료 => return;은 원하는 위치에서 사용이 가능하다.
		}
		/*
		 * A B | B A
		 * 0 1   2 3
		 */
		boolean bCheck = true;
		for (int i = 0; i < msg.length() / 2; i++) {
			char c1 = msg.charAt(i);
			char c2 = msg.charAt(msg.length() - 1 - i);
			if(c1 != c2) {
				bCheck = false;
				break;
			}
			
		}
		if (bCheck == true) 
			System.out.println("좌우대칭 입니다");				/// 나머지 코드 gpt한테 물어보기
		else 
			System.out.println("좌우대칭 아닙니다");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		

	}

}
