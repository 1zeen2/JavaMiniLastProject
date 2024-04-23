// 1~100 7의 배수이고 9의 배수를 출력하는 프로그램 작성

public class 자바제어문_반복문_문제09 {

	public static void main(String[] args) {
		int sum7 = 0;
		int sum9 = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0)
				sum7 += i;
			if (i % 9 == 0)
				sum9 += i;
		}
		System.out.println("7 : " + sum7);
		System.out.println("9 : " + sum9);
		
		sum7 = 0;
		sum9 = 0;
		int i = 1;
		
		do {
			if (i % 7 == 0)
				sum7 += i;
			if (i % 9 == 0)
				sum9 += i;
		} while (i <= 100);

		System.out.println("7 : " + sum7);
		System.out.println("9 : " + sum9);
	}
}