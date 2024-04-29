// 두 정수의 나눗셈 결과를 구하는 메서드를 구현하시오 (실수형)
//				--------- 리턴 값이 있음.
// ------ 매개 변수 2개.
import java.util.Scanner;

public class 메서드_문제_4 {

	static int numb(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	static double div(int a, int b) {
		double d = 0.0;
		try {
			d = a / (double)b;
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없다.");
			return d;
		}
		return a / (double)b;
	}
		

	public static void main(String[] args) {				// gpt 통해서 다시 문제를 알아봐야 함.
		Scanner scan = new Scanner(System.in);
		System.out.println("값 1 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.println("값 2 입력 : ");
		int num2 = scan.nextInt();
		
		double res = div(num1, num2);
		System.out.println("res" + res);
		
	}

}
