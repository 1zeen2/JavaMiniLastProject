// 정수 입력을 받아서 60 이상 합격 => 불합격 if ~ else

import java.util.Scanner;

public class 자바제어문_반복문_문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		while (true) {
			System.out.println(" ㅈㅅ ㅇㄹ : 0 ~ 100 >>");
			num = scan.nextInt();
			
			if (num < 0 || 100 < num) {
				System.out.println("잘못누름");
				continue;
			}
			break;
		}
		
		if (num >= 60)
			System.out.println("ㅎㄱ");
		else
			System.out.println("ㅂㅎㄱ");

	}

}
