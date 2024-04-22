/*
 * 사용자로부터 2 ~ 9 사이의 정수를 입력받아서 구구단 출력
 * 입력이 2~9가 아닐 경우에는 다시 입력을 요청하게 만든다.
 */
import java.util.Scanner;
public class 자바제어문_반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int dan = 0;	//	프로그램에 필요한 데이터를 사용자로부터 받음, 오류 체크
		
		for ( ;; ) {
			System.out.println("2 ~ 9 사이의 정수를 입력하세요 : ");
			dan = scan.nextInt();
			if (dan <2 || 9 < dan) {
				System.out.println("잘못된 입력 입니다.");
				continue; // for 처음으로 이동
			}
			break; // for 종료 => 정상 입력을 했을 경우.
		}
			System.out.println("단 = " + dan );
			System.out.println("======" + dan + "단======");
			for ( int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}
	}

}
		//			숫자를 입력받아야 함
		//			2 ~ 9 가 아니면 다시 입력을 시켜야 함
		//			받은 숫자가 for에서 돌아야 함.
