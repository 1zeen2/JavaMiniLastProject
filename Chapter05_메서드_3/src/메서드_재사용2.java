// 년도를 입력 받아서 윤년인지 확인하는 프로그램
/*
 * 년도 입력 : 2024
 * 윤년 입니다.
 */
public class 메서드_재사용2 {

	public static void main(String[] args) {
		
		int year = 메서드_7.input("년도");
		boolean bCheck = 메서드_7.isYear(year);
		if(bCheck)
			System.out.println("ㅇㄴ");
		else
			System.out.println("ㅇㄴㅇㄴ");

	}

}
