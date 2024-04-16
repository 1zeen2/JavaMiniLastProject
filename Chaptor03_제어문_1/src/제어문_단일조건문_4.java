/*
 * 	Office				시급	12.0
 * 	HTML/CSS			시급 13.0
 * 	Java - Spring		시급 25.0
 * 	Spring - Boot, JPA	시급 32.0
 * 	Python
 * 	머신러닝 - 딥러닝 - AI	시급	295.0
 * 
 * 	변수 / 연산자 / 제어문 => 데이터베이스 => 웹사이트
 * 			l
 * 		  재사용	=>	메서드
 * 					  l
 * 					목록 출력
 * 					글쓰기
 * 					상세 보기
 * 					수정하기
 * 					삭제하기
 * 					검색
 * 					댓글
 * 		char =>	대문자 / 소문자 / 알파벳이 아니다
 * 
 * 	=> 자바 - 오라클 - html/css - 자바스크립트 - jsp - mvc - spring - 뭐시기
 * 		my 뭐시기 - jpa - vuejs - react
 */
import java.util.Scanner;
public class 제어문_단일조건문_4 {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char c = scan.next().charAt(0);
		
		// 결과 값 출력
		// 대문자				=>	c >= 'A' && c <= 'Z'
		// 소문자				=>	c >= 'a' && c <= 'z'
		// 알파벳이 아닌 경우	=>	!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
		System.out.println("====== 결과 ======");
		if(c >= 'A' && c <= 'Z')
		{
			System.out.println(c + "는(은) 대문자 입니다.");
		}
		if(c >= 'a' && c <= 'z')
		{
			System.out.println(c + "는(은) 소문자 입니다.");
		}
		if(!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')))
		{
			System.out.println(c + "는(은) 알파벳이 아닙니다.");
		}
		
		
		
		
		
		
		
	}

}
