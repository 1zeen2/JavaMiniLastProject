package com.sist.util;
/*
 * 	java.text => 변환(Format)
 * 	*** = SimpleDateFormat => 날짜 변경
 * 	*** = DecimalFormat => 정수 변경 => 1,000 (3자리수마다 ,)
 * 		= ChoiceFormat => switch
 * 		= MessageFormat => SQL, 출력 형태
 */
import java.util.*;
import java.text.*;

public class 라이브러리_7 {

    public static void main(String[] args) {
        // 시스템의 날짜
        Date date = new Date();
        // System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  // SystemDate
        /*
         *  년도 : yyyy/yy
         *  월   : MM/M ==> 05/5
         *       -----
         *  일   : dd/d
         *  시간 : hh/h
         *  분   : mm/m ==> 월과 헷갈릴 수 있어 분은 소문자로.
         *  초   : ss/s
         */
        System.out.println(sdf.format(date));
        StringTokenizer st = new StringTokenizer(sdf.format(date), "-");
        System.out.println(st.nextToken() + "년도 " + st.nextToken() + "월 " + st.nextToken() + "일");
        
        sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(date));
        
        StringTokenizer st2 = new StringTokenizer(sdf.format(date), ":");
        StringTokenizer st3 = new StringTokenizer(sdf.format(date), "- :");
       
        System.out.println(st3.nextToken() + "년도 " + st3.nextToken() + "월 " + st3.nextToken() + "일");
        System.out.println(st2.nextToken() + "시 " + st2.nextToken() + "분 " + st2.nextToken() + "초");
    }
}
