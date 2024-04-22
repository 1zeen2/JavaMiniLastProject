/*	2.	숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라.
 * 		 if-else 문과 switch 둘 다 이용해 볼 것.
 * 		달을 입력하세요(1~12) >> 9가을
 */

/*
 * 		값 입력받기
 * 		범위 설정에 따른 출력			( if else, switch 둘 다 사용)
 * 		잘못입력하는 경우 오답 출력
 */
import java.util.Scanner;

public class 자바제어문_반복문_문제02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("달을 입력하세요 (1 ~ 12) >>");
		int num = scan.nextInt();
		
		if (num >= 13) {
			System.out.println("1월 ~ 12월 사이의 값만 입력해주세요");
			System.exit(1);
		}
		
		if (3 <= num && num <= 5) {
				System.out.println("봄 입니다.");
		} 
		else if (6 <= num && num <= 8) {
				System.out.println("여름 입니다.");			// else if 가 아니라 else를 사용하면 출력이 빠져나오지 못하고 뒤로 넘어가면서 값이 같이 섞인다.
		} 
		
		switch (num) {
		case 9:	
		case 10: 	
		case 11:
			System.out.println("가을 입니다.");	
			break;
		case 12:
		case 1: 
		case 2:
			System.out.println("겨울 입니다.");
		} 
	}

}
