// 매개 변수	=> 지역 변수와 동일 => 매서드 종료가 되면 자동으로 메모리에서 사라진다.
// => 사용자가 보내주는 값 => 요청 => {가공 => 처리 결과 값을 전송}
// => Call by value (기본형) *** / Call by Reference	(배열 / 클래스)
/*
 * 	static void display(int a, int b)
 * 						------------ a, b 변수의 초기화
 * 				호출 시에 초기화
 * 				display(10, 20) ==> a = 10, b = 20
 * 						------ 실제 값을 보낸다
 * 						*** 순서가 틀리면 값이 바뀌어 들어감.
 * 						=> 회원 가입 => 15 ~ 20개의 데이터를 묶어서 전송
 * 									 --------
 * 									 같은 데이터 형 : 배열
 * 									 다른 데이터 형 : 클래스
 * 									** 매개 변수는 실행 속도가 많이 느려져 3개 이상 초과하지 않는다.
 */
// => 입력 / 처리 / 출력 => 3개의 정수 입력받고 총점, 평균, 학점, 출력
import java.util.Scanner;

public class 메서드_4 {
	// 입력 기능
	static int scoreInput(String subject) {
		Scanner scan = new Scanner(System.in);
		System.out.println(subject + "점수 입력");
		return scan.nextInt();
	}
	static int scoreTotal(int k, int e, int m) {
		return k + e + m;
	}
	static double scoreAvg(int total) {
		return total / 3.0;
	}
	public static void main(String[] args) {
		int kor = scoreInput("국어");
		int eng = scoreInput("영어");
		int math = scoreInput("수학");
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		
		int total = scoreTotal(kor, eng, math);
		double avg = scoreAvg(total);
		
		System.out.println("총점" + total);
		System.out.printf("평균 : %2,f\n" + avg);
		
		
				

	}

}
