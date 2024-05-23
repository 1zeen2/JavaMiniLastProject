package com.sist.util;
import java.text.SimpleDateFormat;
// 날짜
/*
 *	Date / Calendar
 *	=> 웹에서 날짜 출력할 때 많이 사용
 *		댓글(날짜, 시간), 게시판(입력된 날짜), 예약일, ...
 *		=> 오라클
 *			데이터형 => 정수 / 실수 => 숫자형(Number)
 *			문자 => VARCHAR2, CHAR, CLOB ==> String
 *			날짜 => DATE
 *
 *	Date => 간단한 날짜 정보, 기능은 없다, 오라클 호환	==> 일반 클래스
 *			---------------									Date date = new Date(); ==> 시스템의 날짜, 시간을 출력
 *
 *	Calendar => Date에 없는 기능을 보완한다.			==> 추상 클래스 ===> new를 사용할 수 없다.
 *		=> 달력 만들기, 일정표, ...						Calendar cal = Calendar.getInsctance() => 디자인 패턴 ==> 싱글턴 패턴
 *		=> 요일, 마지막날 읽기, ...																				 -----------
 *																													=> 1개의 객체 주소만 이용
 *																													=> Spring은 싱글턴
 *
 */
import java.util.*;
import java.text.*;

public class 라이브러리_11 {

    public static void main(String[] args) {
        Date date = new Date();
        // System.out.println(date.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d"); // "yyyy-M-d" 또는 "yyyy-MM-dd"로 변경
        String today = sdf.format(date);
        StringTokenizer st = new StringTokenizer(today, "-");
        
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken()); 
        
        System.out.println(year + "년도 " + month + "월 " + day + "일");
    }
}

