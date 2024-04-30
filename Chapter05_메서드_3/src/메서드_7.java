/*
 * 달력
 * 1. 절차적 언어
 * 
 * 2. 메서드	===> 구조적 프로그램
 * 		|			|
 *	클래스 객체	 지향 프로그램 
 *
 *	최소한 3개
 *	입력 부분 = 메서드
 *	--------------
 *	처리 부분 = 메서드 : 세분화
 *	출력 부분 = 메서드
 *	--------------
 */

import java.util.*;

public class 메서드_7 {
	// 입력 부분 => 반복 제거
	static int input(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg + " 입력");
		return scan.nextInt();
	}
	// 처리
	static int getWeek(int year, int month) {
		int total = (year - 1)	* 365
				  + (year - 1)	/ 4
				  - (year - 1)	/ 100
				  + (year - 1)	/ 400;
		
		//	2. 전 달 까지 총 날 수 구하기
		int[] lastday = {31, 28, 31, 30, 31, 30,
					   	31, 31, 30, 31, 30, 31};
		// 윤년이면 => 2월 =>29일
		if (isYear(year))
			lastday[1] = 29;
		else
			lastday[1] = 28;
		for (int i = 0; i < month - 1; i++) {
			total += lastday[i];
		}
		// 	3. + 1 을 하여 1일자의 요일확인
		total++;
		//	4. 요일 구하기 ( 전체 총 날 수  % 7 ...)
		int week = total % 7;
		
		return week;
	}
	// 다른 클래스에서 사용이 가능하다
	static boolean isYear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			return true;
		else
			return false;
	}
	// 출력
	static void print(int year, int month, int week) {
		int[] lastday = {31, 28, 31, 30, 31, 30,
			   	31, 31, 30, 31, 30, 31};
		
		System.out.println(year + "년도" + month + "월");
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
		for (String w : strWeek)
			System.out.print(w + "\t");
		System.out.println();
		
		//실제 달력을 출력
		for (int i = 1; i <= lastday[month - 1]; i++) {
			// 1. 공백 출력 => 처음 1번만 출력
			if (i == 1) {
				for (int j  = 0; j < week; j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t", i);
			// 일요일이면 => 다음 줄에 출력
			// 요일 확인
			week++;
			if(week > 6) {
				System.out.println(); // 다음 줄에 출력
				week = 0;
			}
				
		}
		
	}
	static void process() {
		int year	= input("년도");
		int month	= input("월");
		
		int week = getWeek(year, month);
		print(year,  month,  week);
	}	
	public static void main(String[] args) throws Exception {
		process();
/*
		// 입력 부분
		Scanner scan = new Scanner(System.in);
		// 1. 년도 입력.
		System.out.print("년 입력 ");
		int year = scan.nextInt();
		

		System.out.print("월 입력 ");
		int month = scan.nextInt();
		
		//	1. 전년도까지의 총 날 수 구하기
		int total = (year - 1)	* 365
				  + (year - 1)	/ 4
				  - (year - 1 )	/ 100
				  + (year - 1)	/ 400;
		
		//	2. 전 달 까지 총 날 수 구하기
		int[] lastday = {31, 28, 31, 30, 31, 30,
					   	31, 31, 30, 31, 30, 31};
		// 윤년이면 => 2월 =>29일
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			lastday[1] = 29;
		else
			lastday[1] = 28;
		for (int i = 0; i < month - 1; i ++) {
			total += lastday[i];
		}
		total++;
		//	4. 요일 구하기 ( 전체 총 날 수  % 7 ...)
		int week = total % 7;
		
		// 출력 부분
		
			if (week > 6) {
				System.out.println(week == 0);		// 
			}
		}
		
		// 처리 부분 => 요일

	
		//	3. + 1 을 하여 1일자의 요일확인

*/
	}

}
