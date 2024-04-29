// 1 ~ n까지 합을 구하는 메서드를 구현하시오.
// 매개 변수 있음. (n까지 이기 때문에 정해진 값이 없고 사용자에게 받아야 함) ==> 사용자에게 값을 받는 변수를 매개변수라 함.
// 리턴 있음. 합을 구해야 하기 때문에 값을 가져와야 함

// 1. 입력 값을 받아야 함.
// 2. 2번 예제를 그대로 이용.

import java.util.Scanner;

public class 메서드_문제_3 {

	static int numb(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력");
		int n = scan.nextInt();
		int sum = numb(n);
		System.out.println(sum);
		
	}

}
