/*
 *	month
 *	1 ~ 12가 아닌 값이 입력된 경우를 else로 넘긴다.
 */
import java.util.Scanner;
public class 제어문_조건문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("월 입력(1 ~ 12)");
		int month = scan.nextInt();
		
		if (month >= 1 && month <= 12) {
			//중첩 조건문 많이 등장
			if (month == 1 || month == 2 || month == 12)
				System.out.println("겨울 입니다.");
			if (month >= 3 && month <= 5)
				System.out.println("봄 입니다.");
			if (month >= 6 && month <= 8)
				System.out.println("여름 입니다.");
			if (month >= 9 && month <= 11 )
				System.out.println("가을 입니다.");
		}
		//입력의 실수나 잘못 입력된 경우
		else {
			System.out.println("없는 달 입니다.");
		}
		

	}

}
