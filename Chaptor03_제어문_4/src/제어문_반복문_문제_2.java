//정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 (switch~case 사용) 
import java.util.Scanner;
public class 제어문_반복문_문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	char c = ' ';	
	System.out.println("첫 번째 정수를 입력하시오. : ");
	int num1 = scan.nextInt();
	while (true) {
	System.out.println("연산자를 입력하시오. (+, -, *, -) : ");
	c = scan.next().charAt(0);
		if( !(c == '+' || c == '-' || c == '*' || c == '/')) {
			System.out.println("다시 입력하시오.");
			continue;
		}
		break;
	}
	System.out.println("두 번째 정수를 입력하시오. : ");	// 미리 int num2를 0으로 초기화한 후 13번을 int num2가 아닌 num2 = scan.nextInt();로 받고
	int num2 = scan.nextInt();						// if {연산자가 아닌 경우 continue로 위로 올려버리면} 예외성 해결 가능할듯..?
	
	
	switch (c) {
	case '+':
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		break;
	case '-':
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		break;
	case '*':
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		break;
	case '/':
		if (num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다. 다시 입력해주세요.");
			break;
		}
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		break;
	}
	
	}

}
