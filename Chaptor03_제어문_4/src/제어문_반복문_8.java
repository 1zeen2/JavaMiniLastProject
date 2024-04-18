import java.util.Scanner;
//	계산기 (사칙연산)
public class 제어문_반복문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	// System.out.println("종료하시려면 q/Q를 입력하세요.");
	
	for (;;) {
		System.out.println("첫 번째 정수 입력하세요 : ");
		int num1 = scan.nextInt();
		
		System.out.print("연산자를 입력하세요(+, -, *, /) : ");
		char op = scan.next().charAt(0);
			if (!( op == '+' || op == '-' || op == '*' || op == '/')) {
				System.out.println("올바른 값이 아닙니다.");
				continue;
			}
		System.out.println("두 번째 정수 입력하세요 : ");
		int num2 = scan.nextInt();
			
		switch (op) {
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
			if(num2 == 0)
				System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		//case 'q':
		//case 'Q':
			//System.out.println("프로그램을 종료합니다.");
			//System.exit(0);
			default:
				System.out.println("잘못된 입력 입니다.");
		}
		System.out.println("프로그램을 종료하시겠습니까?(y / n)");
		char exit = scan.next().charAt(0);
		if(exit == 'y') {
			System.out.println("프로그램 종료.");
			break;
		}
		
	}

	}

}
