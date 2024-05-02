// 매개 변수의 전송
// => 메서드 안의 변수는 메서드가 종료가 되면 자동으로 사라진다. => 다른 메서드로 값을 전송
/*
 * 	메서드의 연결
 * 	----------
 * 	숫자 야구 게임 => 분리
 * 	1) 3개의 중복 없는 난수 발생 => 1개 기능
 * 	2) 사용자부터 3개 정수 입력
 * 	3) 난수 / 사용자 입력 비교
 * 	4) 힌트 제공
 * 	5) 종료 여부 확인 => 다시 게임을 할 지 묻어본다
 */
import java.util.*;
public class 메서드정리_4 {

	public static void main(String[] args) {
		// 절차적 언어 => 다시 게임을 할 지 물어보는 것이 불가능 => 재사용이 불가함.
		// 3개의 중복 없는 난수 발생.
		int[] com = new int[3];
		for (int i = 0; i < com.length; i++) {
			com[i] = (int)(Math.random() * 9) + 1;
			// 중복 체크
			for (int j = 0; j < i; j++) {
				// 중복된 수가 발생하면 난수를 다시 생성
				if (com[i] == com[j])
					i--;
				break;
			}
		}
		System.out.println(Arrays.toString(com));
		int[] user = new int[3];
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("세 자리 정수 입력 : ");
			int input = scan.nextInt();
			
			if(input < 100 || 999 < input) {
				System.out.println("세자리 정수만 사용이 가능합니다.");
				continue;
			}
			user[0] = input / 100;
			user[1] = (input % 100) / 10;
			user[2] = input % 10;
			
			if (user [0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
				System.out.println("같은 수는 사용할 수 없습니다.");
			}
			if (user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
			int s = 0, b =0;
			
			for(int i = 0; i < com.length; i ++) {
				for (int j = 0; j < user.length; j++) {
					if (com[i] == user[j]) {	// 같은 수가 있는지
						if (i == j)	
							s++;	// 같은 수가 같은 자리인지
						else
							b++;	// 같은 수가 다른 자리인지
					}
				}
			}
			System.out.printf("Input Number %d, Result : %dS-%dB\n", input, s, b);
			if (s == 3) {
				System.out.println("Game Over !!");
				break;
			}
		}
	}

}
