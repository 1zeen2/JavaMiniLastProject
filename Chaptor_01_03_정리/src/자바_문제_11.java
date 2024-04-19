// 10개의 난수를 생성하여 그 중 3의 배수와 5의 배수가 몇 개인지 출력하는 프로그램
import java.util.Scanner;
public class 자바_문제_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count3 = 0, count5 = 0;
		
		for (int i = 1; i <= 10; i++) {
			int num = (int)(Math.random() * 100) + 1;
			System.out.println("난수 출력 생성 : " + num);
			if (num %3 == 0)
				count3++;
			if (num %5 == 0)
				count5++;
		}
		System.out.println();
		System.out.println("3의 배수의 개수 : " + count3);
		System.out.println("5의 배수의 개수 : " + count5);
		
	}

}
