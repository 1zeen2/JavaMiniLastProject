/*
 * Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라
 *	-10은 음수입니다.
 */
import java.util.Scanner;
public class 제어문_조건문_문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자에게 값을 요청합니다.
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		// 사용자가 입력한 값을 int형 변수로 저장합니다.
		int num = scan.nextInt();
		
		if (num >= 0) {
			System.out.println(num + "는(은) 양수 입니다.");
		}
		else {
			System.out.println(num + "는(은) 음수 입니다.");
		}
	}

}
