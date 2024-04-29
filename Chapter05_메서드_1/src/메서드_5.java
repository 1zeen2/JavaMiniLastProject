/*
 * 1 ~ 100 사이의 2의 배수의 합
 * 1 ~ 100 사이의 3의 배수의 합
 * 1 ~ 100 사이의 4의 배수의 합
 * 1 ~ 100 사이의 5의 배수의 합
 * 1 ~ 100 사이의 6의 배수의 합
 * 1 ~ 100 사이의 7의 배수의 합
 * 1 ~ 100 사이의 8의 배수의 합
 * 1 ~ 100 사이의 9의 배수의 합
 */
public class 메서드_5 {
/*	static int display2() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		return sum;
	}
	static int display3() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				sum += i;
		}
		return sum;
	}
	static int display4() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0)
				sum += i;
		}
		return sum;
	}
	static int display5() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0)
				sum += i;
		}
		return sum;
	}
	static int display6() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0)
				sum += i;
		}
		return sum;
	}
	static int display7() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0)
				sum += i;
		}
		return sum;
	}
	static int display8() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 8 == 0)
				sum += i;
		}
		return sum;
	}
	static int display9() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 9 == 0)
				sum += i;
		}
		return sum;
	}
*/
	// 다른 클래스에서 사용이 가능 => 재사용 => 조립식
	// 게시판 (CRUD) => 읽기, 수정, 추가, 삭제 ==> create, read, update, delete
	static int display(int num) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % num == 0)
				sum += i;
		}
		return sum;
	}
	// 메서드 => 반복 제어 => 소스를 간결하게 만들 수 있다.
	// 절차적 언어 => 순차적으로 실행 => 재사용을 할 수가 없다.
	// 한 번 사용하고 버려야 한다. => main안에 코딩하면 절차적 언어가 된다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		System.out.println("1 ~ 100 사이의 2의 배수의 합 : " + display2());
		System.out.println("1 ~ 100 사이의 2의 배수의 합 : " + display3());
		System.out.println("1 ~ 100 사이의 2의 배수의 합 : " + display4());
		System.out.println("1 ~ 100 사이의 2의 배수의 합 : " + display5());
		System.out.println("1 ~ 100 사이의 2의 배수의 합 : " + display6());
		System.out.println("1 ~ 100 사이의 2의 배수의 합 : " + display7());
		System.out.println("1 ~ 100 사이의 2의 배수의 합 : " + display8());
		System.out.println("1 ~ 100 사이의 2의 배수의 합 : " + display9());
*/
		for (int i = 2; i <= 9; i++) {
			System.out.println("1 ~ 100 사이의 " + i + "의배수의 합 : " + display(i));
		}
		
	}

}
