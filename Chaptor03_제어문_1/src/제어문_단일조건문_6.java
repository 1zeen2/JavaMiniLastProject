/*
 * 	국어 영어 수학 점수를 입력받아서
 * 	총점을 구하고 평균을 구해라.
 * 	학점 =>	100 ~ 90 A	=> +, 0, -	=> 97 A+
 * 									=> 94 A0
 * 									=> 91 A-
 * 		   	89  ~ 80 B	
 * 			79	~ 70 C
 * 			69  ~ 60 D
 * 				F
 */
import java.util.Scanner;
public class 제어문_단일조건문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 필요한 변수를 선언
		int kor, eng, math;
		char score = 'A';
		
		// 입력값을 받아서 초기화
		System.out.print("국어 점수 입력 : ");
		kor = scan.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		eng = scan.nextInt();
		
		System.out.print("수학 점수 입력 : ");
		math = scan.nextInt();
		// 출력
		
		int avg = (kor + eng + math) / 3;
		if(avg >= 90 && avg <= 100)
		{
			score = 'A';
		}
		
		if(avg >= 80 && avg <= 89)
		{
			score = 'B';
		}
		
		if(avg >= 70 && avg <= 79)
		{
			score = 'C';
		}
		
		if(avg >= 60 && avg <= 69)
		{
			score = 'D';
		}
		
		if(avg < 60)
		{
			score = 'F';
		}
		if(kor + eng + math > 300)
		{
			System.out.println("값이 올바르지 않습니다.");
		}	
			if(kor + eng + math <= 300)
			{
				System.out.println("====== 결과 값 ======");
				System.out.println("국어 점수 : " + kor);
				System.out.println("영어 점수 : " + eng);
				System.out.println("수학 점수 : " + math);
				System.out.println("총점 점수 : " + (kor + eng + math));
				System.out.printf("평균 : %.2f\n" , (kor + eng + math)/3.0);	
				//	=>	\n	=> newLine	==>	ln
				//	=>	\t	=> tab	=> 일정 간격의 공백
		System.out.println("학점 : " + score + "학점");
		}
	}

}
