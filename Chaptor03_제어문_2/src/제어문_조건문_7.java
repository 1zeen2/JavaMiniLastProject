/*
 *	1. 형식		==> 어떤 곳에서 사용 
 *	2. 흐름 파악	==> 동작 순서
 *	3. 응용
 *	  --------------------------
 *	if (조건문) {
 *		true => 문장 수행 중료
 *			false
 *			  ↓
 *	}
 *	else if (조건문) {
 *			 =>	true => 종료
 *			false
 *			  ↓
 *	}
 *	else {
 *		해당 조건이 없는 경우에 수행 문장	=>	필요시에만 처리(생략 가능)
 *	}
 *	-------------------------------------------------------
 *	if ~ else	=>	단일 조건문	=>	다중 조건문
 *										ㅣ
 *									   게임	 =>	누르는 키마다 수행해야 되는 것이 달라서.
 *											==>	switch ~ case로 대체 가능.
 *	-------------------------------------------------------
 */
//	다중 if문(조건문)을 이용한 성적 계산
//	90 ~ 100 A, 80 ~ 89 B, 70 ~ 79 C, 60 ~ 69 D, 60이하 F
import java.util.Scanner;
public class 제어문_조건문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("국어 점수를 입력하시오 : ");
		int kor = scan.nextInt();
		if (kor >= 0 && kor <= 100) {
			System.out.println("국어 점수는 몇 점 입니다.");
		}
		
		else if (!(kor >= 0 && kor <= 100)) {
			System.out.println("값이 올바르지 않으므로 종료합니다.");
			System.exit(1);
		}
		
		
		System.out.printf("영어 점수를 입력하시오 : ");
		int eng = scan.nextInt();
		if ( ! (eng >= 0 && eng <= 100)) {
			System.out.println("영어 점수를 올바르게 입력해주세요.");
		}
		
		System.out.printf("수학 점수를 입력하시오 : ");
		int math = scan.nextInt();
		if ( ! (math >= 0 && math <= 100)) {
			System.out.println("수학 점수를 올바르게 입력해주세요.");
		
//		int score = kor + eng + math;
//		double avg = score / 3.0;
		char op = 'A';
		
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("평균 : " + (kor + eng + math) / 3.0);
		
		if (kor >= 90 && kor <= 100) {
			if (kor >= 97) {
				System.out.println("국어 : A+");	
			}
			if (kor <97 && kor >= 93) {
				System.out.println("국어 : A0");
			}
			if (kor < 93) {
				System.out.println("국어 : A-");
			}

		}
		}
		
		}
	}

