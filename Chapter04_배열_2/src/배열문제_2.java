/*
 * 선언 후 값 => t, f, f, t
 * boolean[] b = new boolean[4] => 이거는 선언과 동시에 초기값인 false로 초기화가 되기 때문에 선언 후 값을 부여하는 문제와 맞지 않는다.
 * b[0] = true; 는 값 변경.
 * 
 * int[] i = new int[]{};
 * -----
 * 여기는 데이터 형이기 때문에 값이 들어갈 수 없다
 * int[3] <==== 오류는 없지만 문법에 맞지 않음.
 */


public class 배열문제_2 {

	public static void main(String[] args) {
		// 문제 2-1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
		char[] c = new char[10];
		// 문제 2-2) 0에서 5까지 정수 값으로 **초기화된** 정수 배열 n을 선언하라.
		int[] n = {0, 1, 2, 3, 4, 5};
		// 문제 2-3) '일', '월', '화', '수', '목', '금', '토'로 **초기화된** 배열 day를 선언하라.
		char[] day = {'일', '월', '화', '수', '목', '금', '토'};
		// 문제 2-4) 4개의 논리 값을 가진 ****배열 bool을 선언하고***  // true, false, false, true로 선언하라.
		boolean[] bool;
		bool = new boolean[] {true, false, false, true};
	}

}
