// 1~100 3의 배수이고 5의 배수를 출력하는 프로그램 작성

/*
 * 	1 ~ 100 범위 지정
 * 	3의 배수 이면서 5의 배수인 수를 출력.
 */
public class 자바제어문_반복문_문제07 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
			System.out.println("3의 배수이면서 5의 배수인 수 : " + i );
			}
		}

	}

}
