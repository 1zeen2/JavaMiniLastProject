// 입력 받은 숫자가 3의 배수, 5의 배수, 7의 배수
// 조건 여러개를 동시에 수행 => 단일 조건문
// 조건 1개만 수행 => 다중 조건문
import java.util.Scanner;
public class 제어문_조건문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하시오 : ");
		
		int threeTimes = scanner.nextInt();

		if(threeTimes % 3 == 0) {
			System.out.println(threeTimes + "는 3의 배수이다.");
		}
		
		if(threeTimes % 5 == 0) {
			System.out.println(threeTimes + "는 5의 배수이다.");
		}
		if(threeTimes % 7 == 0) {
			System.out.println(threeTimes + "는 7의 배수이다.");
		}	
		
	}

}
