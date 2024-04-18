/*
 * 단을 입력을 받는다
 * 	=> 구구단 출력
 * 	단 >> 2
 * 	..
 * 	2 * 9 = 18
 * 2 * 1 ~ 2 * 9까지 9바퀴 수행
 */
import java.util.Scanner;
public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하시오.");
		int times = scan.nextInt();
		
		for(int i = 1; i <= 9; i ++) {
			// 시작점, 종료점, 증감식을 잘 설정해야 함
			System.out.printf("%d * %d = %d\n", times, i, times*i);
			break;
		}
	}

}
