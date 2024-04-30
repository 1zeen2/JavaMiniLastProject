/*
 * 
 */

import java.util.Scanner;

public class 메서드_문제_04 {
	
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int a = scan.nextInt();
		return a;
	}
	static void isYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
			System.out.println(year + "년도는 윤년 입니다.");
		else
			System.out.println(year + "년도는 윤년이 아닙니다.");
	}

	public static void main(String[] args) {
		
		int year = input();
		isYear(year);
		/*						   ---------- ==> 모든 문자를 정수형으로 받아온다는 단점이 있다.
		 * => 키보드 입력 값을 받아서 메모리에 저장을 해주는 클래스.
		 */
/*		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
			System.out.println(year + "년도는 윤년 입니다.");
		else
			System.out.println(year + "년도는 윤년이 아닙니다.");
*/

	}

}
