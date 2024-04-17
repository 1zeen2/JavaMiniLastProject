//입력 받아 윤년인지 아닌지를 판별하는 방법을 if~else를 사용해 작성하라.
import java.util.Scanner;
public class 제어문_조건문_문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하시오 : ");
		int year = scan.nextInt();
		
		// 4년마다 한 번씩 포함, 100년마다 제외, 400년마다 포함하는 프로그램
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		System.out.println(year + "년은 윤년 입니다.");
			
		}
		else {
		System.out.println(year + "년은 윤년이 아닙니다.");
		}
	}
}

