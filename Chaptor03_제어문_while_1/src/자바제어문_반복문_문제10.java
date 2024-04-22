// 10 ~ 99까지 정수 중 같은 자리의 정수를 출력하시오
public class 자바제어문_반복문_문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10; i <= 99; i++) {
			if (i % 11 == 0)
				System.out.println(i + " ");
		}
		System.out.println("=====================");
		int i = 10;
		
		while (i < 99) {
			if (i % 11 == 0)
				System.out.println(" " + i);
			i++;
		}
		System.out.println("=====================");
		
		i = 10;
		
		do {
			if (i % 11 == 0)
				System.out.println(" " + i);
		} while (i <= 99);
	}

}
