/*
 * 절차적 언어
 * 	=> 순차적으로 명령문 (한 줄씩 번역)
 * 		=> 재사용이 어렵고 / 수정하기가 까다롭고 / 기능 추가가 어렵다.
 * 	=> 메서드 : 기능 별로 나눠서 처리한다.
 * 		=> 변수가 메서드 안에서 사용 => 리턴 형 / 매개 변수 / => 고려
 * 	=> 전역 변수 => 전체 메서드에서 사용하는 변수 => 리턴 형 / 매개 변수는 고려하지 않는다.
 * 	   ------
 * 	   지역 변수 => 매개 변수 포함 => 메서드 블럭 => 메서드가 종료되면 사라진다.
 * 	   전역 변수 => 클래스 블럭 => 프로그램 종료 시에 사라진다.
 * 	-------------------------------------------------------------------------
 * 	전역 변수 : a, b
 * 	지역 변수 : c, d, e
 *	aaa()
 *		=> a
 *		=> b
 *		=> c
 *	bbb()
 *		=> a
 *		=> b
 *		=> d
 *	ccc()
 *		=> a
 *		=> b
 *		=> e
 *
 *	1. 년도 / 월 => year / month
 *	2. 요일 => year / month / week / i
 *	3. 출력 => year / month / week / i => 루프 변수(지역 변수)
 *
 */
import java.util.*;
// 문법 	=> C
// 메서드	=> C++
// 전역	=> 메서드 => 자바 => 5장부터 자바 시작
/*
 * 문법 => 메서드 (재사용) => 실제 프로그램 (객체 지향) => 전역 변수 (멤버 변수, 공유 변수)
 * 						5장 ~ 12장을 마치고 => 웹 프로그램
 * 	5장 ~ 8장 사이에 기술 면접이 나온다.
 */

public class 달력만들기_절차적언어 {

	public static void main(String[] args) {
	// 1. 사용자 입력 혹은 => default를 잡아야 한다 => date
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = scan.nextInt();
		
		System.out.println("월 입력 : ");	// final 클래스
		int month = scan.nextInt();
		// 2. 요일 구하기 => 사용자 정의 / 라이브러리
		// Calendar 클래스 메모리 할당.
		// new를 사용하지 않았기 때문에 추상 클래스이다.
		Calendar cal = Calendar.getInstance(); // abstract 클래스 => new를 사용할 수 없으며 싱글턴(한 번만 사용 가능) 클래스이다.
		cal.set(Calendar.YEAR, month);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		// 요일
		int week = cal.get(Calendar.DAY_OF_WEEK);
		week -= 1;											/// 안되면 여기 week = week - 1로 변경
		// 마지막날
		int lastday = cal.getActualMaximum(Calendar.DATE);
		
		// 3. 달력 출력
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

}
  