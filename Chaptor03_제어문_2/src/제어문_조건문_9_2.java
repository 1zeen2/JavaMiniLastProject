// 문자를 받아서 => 대문자 / 소문자 / 숫자 / 기타
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
public class 제어문_조건문_9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하시오 : ");
		char c = scan.next().charAt(0);
		
		if(c >= 'A' && c <= 'Z') {
			System.out.println(c + "는(은) 대문자 입니다.");
		}
		else if (c >= 'a' && c <= 'z') {
			System.out.println(c + "는(은) 소문자 입니다.");
		}
		else if (c >= '0' && c <= '9') {
			System.out.println(c + "는(은) 숫자 입니다.");
		}
		else {
			System.out.println(c + "는(은) 알파벳, 숫자가 아닙니다.");
		}

}
}
