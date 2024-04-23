import java.util.Scanner;
public class 자바제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		
		int balance = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 확인 | 4. 종료");
			System.out.println("--------------------------------------------");
			System.out.println("메뉴 선택 >>");
			
			int menu = scan.nextInt();
			
			switch (menu) {
			
			case 1:
				System.out.println("예금액>");
				balance =+ scan.nextInt();
			case 2:
				System.out.println("츌금액>");
				int input = scan.nextInt();
				if (balance < input)
					System.out.println("잔고가 부족합니다.");
				else
					balance -= input;			
			case 4:
				run = false;
				break;
			}
			
		}
			
	}

}
