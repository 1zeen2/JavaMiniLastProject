import java.util.Scanner;
public class 제어문_조건문_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.printf("국어 점수 : ");
		int kor = scan.nextInt();
		System.out.printf("영어 점수 : ");
		int eng = scan.nextInt();
		System.out.printf("수학 점수 : ");
		int math = scan.nextInt();	
		
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("총점 : " + (kor + eng + math));
		System.out.printf("평균 : %.2f\n", (kor + eng + math) / 3.0);
		
		char score = 'A';
		int avg = (kor + eng + math) / 3;
		if (avg >= 90 && avg <= 100) {
			score = 'A';
		}
		else if (avg >= 80) {
			score = 'B';
		}
		else if (avg >= 70) {
			score = 'C';
		}
		else if (avg >= 60) {
			score = 'D';
		}
		else if (avg <= 60) {
			score = 'F';
		}
		System.out.println("학점 : " + score);
	}

}
