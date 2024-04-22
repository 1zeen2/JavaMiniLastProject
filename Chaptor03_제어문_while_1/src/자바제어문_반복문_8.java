import java.util.Scanner;

public class 자바제어문_반복문_8 {

	public static void main(String[] args) {
		//사직 연산 => Q를 눌렀을 때 종료가 되는 프로그램
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("첫 번째 정수 입력 : ");
			int num1 = scan.nextInt();
			
			System.out.print("연산자를 입력하시오. (+, -, *, /) => 종료를 원하시면 Q를 누르시오.");
			char op = scan.next().charAt(0);
			
			if(op == 'q' || op == 'Q') {
				System.out.println("계산기 종료");
				break;
			}
			
			System.out.print("두 번째 정수 입력 : ");
			int num2 = scan.nextInt();
			
			switch (op) {
				case '+':
					System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
					break;
				case '-':
					System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
					break;
				case '*':
					System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
					break;
				case '/':
				
					if(num2 == 0)
						System.out.println("0으로 나눌 수 없습니다.");
					else	
						System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
					break;
				default :
					System.out.println("잘못된 연산자 입니다.");
					break;
			}
		}
	}
}
