import java.util.Scanner;

/*
 * 	for => UpDown
 * 	1. 난수 => 난수를 맞추는 프로그램
 * 	   --- 힌트 : UP / DOWN
 * 	----------------------------- 반복 횟수가 명확하지 않다 => while
 * 	=> 종료 : break;
 * 	=> 잘못 입력 시 : continue
 * 	----------------------------- 반복 제어문
 */
public class 자바제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int com = (int)(Math.random() * 100) + 1;
		
		while (true) {
			System.out.println("정수 입력 : ");
			int user = scan.nextInt();
			
			if (user < 1 || 100 < user) {
				System.out.println("잘못된 입력 입니다. 1 ~ 100 사이의 정수를 입력해 주세요.");
				continue;
			}
				// 힌트
			if (com > user) {
				System.out.println("입력된 값보다 큰 숫자를 입력해주세요.");
			} else if (com < user) {
				System.out.println("입력된 값보다 작은 숫자를 입력해주세요.");
			} else {
				System.out.println("정답입니다.");
				//종료한다.
				break;
			}
		}
		System.out.println("프로그램 종료.");

	}

}
