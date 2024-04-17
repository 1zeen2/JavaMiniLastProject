// 사칙연산 => 연산을 한 번만 수행 ==> 다중 조건문
import java.util.Scanner;
public class 제어문_조건문_9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		char op = ' ';
		
		System.out.print("첫 번째 정수 입력 : ");
		num1 = scan.nextInt();
		System.out.print("연산자 입력(+, -, *, /) : ");
		op = scan.next().charAt(0);
		if (!(op == '+' && op == '-' && op == '*' && op == '/')) {
			System.out.println("+, -, *, / 중에서 입력하지 않았기 때문에 프로그램을 종료합니다.");
			System.exit(1);
		}	
		System.out.print("두 번째 정수 입력 : ");
		num2 = scan.nextInt();
		
		if (op == '+') {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}	
		else if (op == '-') {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		}
		else if (op == '*') {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		}
		else if (op == '/') {
			if (num2 == 0) {
					System.err.println("0으로 나눌 수 없습니다.");
			}
			else {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			}
		}
		else {
			System.out.println("잘못된 연산자 입니다.");		
		}
	
}
}