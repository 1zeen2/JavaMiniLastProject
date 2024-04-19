// 숫자를 받아서 일, 시간, 분, 초로 출력.
// 63 ==> 1분 3초
import java.util.Scanner;
public class 자바제어문_조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.printf("초 입력 :");
		int num = scan.nextInt();
		
		int day  = num / 86400;
		System.out.printf(day + "일 ");
		int hour = (num % 86400) / 3600;
		System.out.printf(hour + "시 ");
		
		int minute = (num % 3600) / 60;
		System.out.printf(minute + "분 ");
		
		int second = (num % 3600) % 60;
		System.out.println(second + "초");
		

	}

}
