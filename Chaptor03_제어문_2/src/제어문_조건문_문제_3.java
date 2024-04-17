// Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라
import java.util.Scanner;
public class 제어문_조건문_문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 :");
		
		int num = scan.nextInt();
		
/*		if (num > 0) {
			System.out.println("a = -" + num);
			}
		if (num < 0) {
			System.out.println("a = " + (1) * (num));
			System.out.printf("a = %d", (1) * (num));
			
		}
		if (num == 0) { 
			System.out.println("a = 0");
		}
*/
		if (num  < 0) {
			num *= -1;
			System.out.print(num);
//			System.out.println(Math.abs(num));	==> 양수만 출력 ==> 절대값
		}
	}

}
