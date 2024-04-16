import java.util.Scanner;
public class 연산자문제_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 369;
		int won100	= money / 100;
		int won10 	= (money % 100) / 10;
		int won1 	= money % 10;
		
		System.out.println("100원 동전 : " + won100);
		System.out.println("10원 동전	 : " + won10);
		System.out.println("1원 동전 	 : " + won1);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = scan.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "년도는 윤년 입니다.");
		}
		
		if(!((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)))
		{
			System.out.println(year + "년도는 윤년이 아닙니다.");
		}


		

	}

}
