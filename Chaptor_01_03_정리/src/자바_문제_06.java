// 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
import java.util.Scanner;
public class 자바_문제_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Scanner scan = new Scanner(System.in);
		System.out.println("시작 정수를 입력하시오.");
		int a = scan.nextInt();
		
		System.out.println("끝 정수를 입력하시오.");
		int b = scan.nextInt();
		
		int sum = 0;
			for (int i = a; i <= b; i++) {
				sum = i *b;

				
			}
			System.out.println(sum);
*/

		int start, end;
		int gop =1;
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 정수 입력 : ");
		start = scan.nextInt();
		System.out.println("두 번째 정수 입력 : ");
		end = scan.nextInt();
		if (start > end) {
			System.out.println("다시 입력하세요. 두 번째 값이 더 커야 합니다.");	///마지막 출력 안되게
		
		for(int i = start; i <= end; i++) {
			gop *= i;
		}
		
		System.out.println("결과 값 : " + gop);
		}
	}

}
