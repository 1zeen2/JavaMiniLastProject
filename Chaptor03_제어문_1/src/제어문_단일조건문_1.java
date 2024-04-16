import java.util.Scanner;
public class 제어문_단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("숫자를 입력하시오 : ");
		num = scan.nextInt();
		
		if(num >= 0) {
			System.out.println("입력한 숫자는 양수입니다.");
		}
		if(num < 0) {
			System.out.println("입력한 숫자는 음수입니다.");
		}

	}

}
