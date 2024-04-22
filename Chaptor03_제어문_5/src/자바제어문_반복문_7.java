/*
 * 1 ~ 4장 => 기본 문법
 * 5 ~ 7장 => 겍체지향 프로그럼
 * 8 ~ 	  => 예외 처리를 하여 프로그램이 종료하지 않게 함
 * 9 ~ 	  => 라이브러리(조립식 으로 읽기)
 *
 * 맞장;에ㅔㄴ
 *
 *
 *
 *
 */

// 입력을 받아서 대문자면 소문자, 소문자면 대문자로 출력하시오\
import java.util.Scanner;
public class 자바제어문_반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {		
			System.out.println("알파벳을 입력 : ");
			char al = scan.next().charAt(0); // for 한 바퀴 돌 때 마다 사라졌다가 다시 만들어지기 때문에 변수 명이 같아도 된다.
			System.out.println("입력된 알파벳 : " + al);
			if ('A' <= al && al >= 'Z') {
				System.err.println("소문자로 변경 :" + (char) (al + 32));
			} else if ('a' <= al && al >= 'z') {
				System.out.println("대문자로 변경 : " + (char) (al - 32));
			} else {
				System.out.println("알파벳이 아닙니다.");
			}	
		}
		
	}
	
}
