import java.util.Scanner;

public class 메서드_문제_14 {

	static void m_14(int num) {
		System.out.println(num);
		String s = String.valueOf(num);
		
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = scan.nextInt();

	}

}
