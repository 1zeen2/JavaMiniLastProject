import java.util.Scanner;

public class 연산자문제_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하시오 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("=======결과 값 =======");
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
		
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
	}

}
