import java.util.*;

public class 배열문제_3 {

	public static void main(String[] args) {
		// 배열 alpha를 모두 출력하고자 한다. 빈칸에 적절한 코드를 삽입하시오.
		/*
		 * char[] alpha = {'a', 'b', 'c', 'd'};

			for( ) {
     		System.out.print(alpha[i]);
			}
		 */
		// 문자형 배열 alpha를 선언. 그와 동시에 값을 호출한다.
		char[] alpha = {'a', 'b', 'c', 'd'};
		for (int i = 0; i < alpha.length; i++) {			// 인덱스 번호가 필요하기 때문에 값 변경, 초기화에 많이 쓰는 형식이다.
			System.out.println(alpha[i]);					
		}
		System.out.println("==========for each==========");	// 출력용으로 많이 사용 ==> 웹 ==> for - each
		for(char c : alpha) {								// 받는 변수 데이터형 == 배열의 데이터형 || 받는 변수 데이터형 > 배열의 데이터형
			System.out.println(c);							// 같은 데이터 형으로 받는 것이 편리하다.
		}
		System.out.println("===============API=========");	//	 
		System.out.println(Arrays.toString(alpha));
															// *** //alpha[i]<< [] 인덱스를 사용한다면 for문 실제 값 출력을 원한다면 for - each
	}
}
