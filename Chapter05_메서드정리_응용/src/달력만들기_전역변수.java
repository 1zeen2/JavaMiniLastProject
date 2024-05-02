import java.util.*;
public class 달력만들기_전역변수 {

	static int year, month, week, lastday;
	static void userInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		year = scan.nextInt();
		
		System.out.println("월 입력 : ");	// final 클래스
		month = scan.nextInt();
	}
	static void getWeek() {
		Calendar cal = Calendar.getInstance(); // abstract 클래스 => new를 사용할 수 없으며 싱글턴(한 번만 사용 가능) 클래스이다.
		cal.set(Calendar.YEAR, month);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		// 요일
		week = cal.get(Calendar.DAY_OF_WEEK);
		week -= 1;											/// 안되면 여기 week = week - 1로 변경
		// 마지막날
		lastday = cal.getActualMaximum(Calendar.DATE);
	}
	static void print() {
		String[] strWeek = {
				"일", "월", "화", "수", "목", "금", "토"
		};
		System.out.println(year + " 년도 " + month + " 월");
		for (String s : strWeek) {
			System.out.print(s + "\t");
		}
		System.out.println("\n");
		
		for (int i = 1; i <= lastday; i++) {
			if (i == 1) {
				for (int j = 0; j < week; j++) {
					System.out.print("\t");
				}
			}
			System.out.print("%2d\t" + i);
			week++;
			if (week > 6) {
				System.out.println();
				week = 0;
			}
		}
	}
	public static void main(String[] args) {
		userInput();
		getWeek();
		

	}

}
