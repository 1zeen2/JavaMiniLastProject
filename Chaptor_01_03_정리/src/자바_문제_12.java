// 11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성
import java.util.Scanner;
public class 자바_문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		for (int j = 0; j < 10; j++) {
			System.out.println("정수를 입력하시오 : ");
			int num = scan.nextInt();
			
			if (num %2 == 0)
				sum++;
		}
		System.out.println("짝수의 개수는 : 개 입니다. " + sum);
	}

}
