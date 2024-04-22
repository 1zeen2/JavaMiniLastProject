// 1~100 3의 배수이고 5의 배수를 출력하는 프로그램 작성

public class 자바제어문_반복문_문제08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println(i + " ");
		}
		System.out.println("========= while ===========");
		
		int i = 1;
		
		while (i <= 100) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println(i + " ");
			i++;
		}
		System.out.println("=========do while ~ ==========");
		
		i = 1;
		do {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println(i + " ");
			i++;
		} while (i <= 100);
	}

}

/*
 * 	for 	: 정해진 반복 횟수가 지정
 * 	while	: 정해진 반복 횟수가 없는 경우
 * do while	: 무조건 한 번 이상 수행
 * 
 */
