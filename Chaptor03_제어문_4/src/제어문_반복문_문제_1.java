// 100점 만점으로 성적을 입력 받아 
// 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D, 60점 이하면 F를 출력
// 하라 (switch~case 사용)
/*
 * 	switch ~ case : 선택문
 * 	=> 정수, 문자 ,문자열만 사용 가능하며 값 1개를 지정하면 switch에 값을 받는다
 * 	=> case가 해당 문자, 정수, 문자열을 검색하여 문장을 수행.
 * 	=> case를 찾아서 처리하고 break;가 없는 경우에는 break;가 있는 곳 까지 수행한다.
 */
import java.util.Scanner;
public class 제어문_반복문_문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	int score = 0;
	
	while (true) {
	System.out.println("정수를 입력하세요. : ");		// 정수를 입력받아서 0 ~ 100 사이에 있는 값이면 밑으로 넘기고 아니면 continue로 다시 위로 올림.
		score = scan.nextInt();
	if ( score < 0 || score > 100) {
		System.out.println("다시 입력하세요");
		continue;
	}
	break;
	}
	
	switch (score / 10) {
	case 10: case 9:
		System.out.println("A 학점 입니다.");
		break;
	case 8:
		System.out.println("B 학점 입니다.");
		break;
	case 7:
		System.out.println("C 학점 입니다.");
		break;
	case 6:			
		System.out.println("D 학점 입니다.");
		break;
	default:
		System.out.println("F 학점 입니다.");
		break;
	}
	}

}
