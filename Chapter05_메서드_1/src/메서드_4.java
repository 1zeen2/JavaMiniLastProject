// 리턴 형이 없고 매개 변수만 있는 경우.
// ----------- 메서드 자체에서 출력
// 단 입력을 받아서 해당 단을 출력
import java.util.*;

public class 메서드_4 {
	// 결과 값이 없는 경우에는 void를 사용한다.
	static void gugudan(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);			
		}
	}

	public static void main(String[] args) {
		// 반복 제어 => 구조적 프로그램 (단락) => 조립이 쉽게 만드는 과정
/*		gugudan(2);
		System.out.println("=========================");
		gugudan(3);
		System.out.println("=========================");
		gugudan(4);
		System.out.println("=========================");
		gugudan(5);
		System.out.println("=========================");
*/
		for (int i = 2; i <= 9; i++) {
			gugudan(i);
			System.out.println(" =============");      
			
		}
	}

}
