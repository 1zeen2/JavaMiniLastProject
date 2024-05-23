package com.sist.util;

import java.util.*;
import java.text.*;

public class 라이브러리_12 {

	public static void main(String[] args) {
//		DATE DATE = NEW DATE();
//		SIMPLEDATEFORMAT SDF = NEW SIMPLEDATEFORMAT("YYYY-MM-DD");
//		STRING TODAY = SDF.FORMAT(DATE);
//		STRINGTOKENIZER ST = NEW STRINGTOKENIZER(TODAY, "-");
//		INT YEAR = INTEGER.PARSEINT(ST.NEXTTOKEN());
//		INT MONTH = INTEGER.PARSEINT(ST.NEXTTOKEN());
//		INT DAY = INTEGER.PARSEINT(ST.NEXTTOKEN());
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년도 입력");
		int year = scan.nextInt();
		System.out.println("월 입력");
		int month = scan.nextInt();
		System.out.println("일 입력");
		int day = scan.nextInt();
		
		System.out.printf("%d년도 %d월 %d일\n", year, month, day);
		
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
		
		for (String s : strWeek) {
			System.out.print(s + "\t");
		}
		System.out.println();
		// 달력 출력 => 1의 요일, 마지막 날짜
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DATE, 1);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		week = week - 1;
		
		int lastday = cal.getActualMaximum(Calendar.DATE);
		
		for (int i = 1; i <= lastday; i++) {
			if (i == 1) {
				for (int j = 0; j < week; j++) {
					System.out.printf("\t");
				}
			}
			System.out.printf("%2d\t", i);
			week++;
			if (week > 6) {
				week = 0;
				System.out.println();
			}
		}
	}

}
