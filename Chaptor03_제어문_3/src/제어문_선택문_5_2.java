// 사용자로부터 입력을 받아 국어, 영어, 수학 점수를 받고 평균 (연산자), 학점 (if, switch)를 사용하여 출력하라.
import java.util.Scanner;
public class 제어문_선택문_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 : ");
		int kor = scan.nextInt();
			if(!(kor >= 0 && kor <= 100)) {
				System.out.println("값이 올바르지 않습니다. 프로그램을 종료합니다.");
				System.exit(1);
			}
		System.out.println("영어 점수를 입력하세요 : ");
		int eng = scan.nextInt();
		if(!(eng >= 0 && eng <= 100)) {
			System.out.println("값이 올바르지 않습니다.프로그램을 종료합니다.");
			System.exit(1);
		}
		
		System.out.println("수학 점수를 입력하세요 : ");
		int math = scan.nextInt();
		if(!(math >= 0 && math <= 100)) {
			System.out.println("값이 올바르지 않습니다.프로그램을 종료합니다.");
			System.exit(1);
		}
		System.out.println("평균 : " + (kor + eng + math)/3);
		
		int avg = (kor + eng + math) / 30;
			
		char gd = ' ';
		
		switch (avg) {
		case 10:
		case 9:
			gd = 'A';
			System.out.println("학점은 A등급 입니다.");
			break;
		case 8:
			gd = 'B';
			System.out.println("학점은 B등급 입니다.");
			break;
		case 7:
			gd = 'C';
			System.out.println("학점은 C등급 입니다.");
			break;
		case 6:
			gd = 'D';
			System.out.println("학점은 D등급 입니다.");
			break;
		default :
			System.out.println("학점은 F등급 입니다.");
		}
	}
}
