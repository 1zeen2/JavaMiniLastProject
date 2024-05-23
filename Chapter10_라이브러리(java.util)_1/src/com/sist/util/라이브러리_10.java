package com.sist.util;

import java.util.*;
import java.text.*;

public class 라이브러리_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ID 입력 : ");
		String id = scan.next();
		
		System.out.println("비밀번호 입력 : ");
		String pwd = scan.next();
		
		System.out.println("이름 입력 : ");
		String name = scan.next();
		
		System.out.println("성별 입력 : ");
		String sex = scan.next();
		
		System.out.println("나이 입력 : ");
		int  age = scan.nextInt();

		System.out.println("전화번호 입력 : ");
		String tel = scan.next();

		System.out.println("주소 입력 : ");
		String addr = scan.next();
		
		String sql = "INSERT INTO member VALUES('" + id + "','" + pwd + "','" + name +
												"','" + sex + "','" + age + "','" + tel + "','" + addr
												+ "')";
		System.out.println(sql);
		
		sql = "INSERT INTO member VALUES(''{0}'',''{1}'',''{2}'',''{3}'',''{4}'',''{5}'',''{6}'')";
		Object[] obj = {id, pwd, name, sex, age, tel, addr, sql};
		
		System.out.println(MessageFormat.format(sql, obj));
		// sql = "INSERT INTO member VALUES(?, ?, ?, ?, ?, ?, ?)"
		// 	=> 오라클 => 저장 => 출력 형식을 만들어서 처리한다 => MessageFormat
		/*
		 * 	*** 날짜 => SimpleDateFormat
		 * 	*** 정수 => DecimalFormat
		 * 		출력 => MessageFormat
		 * 
		 * 		=> util
		 * 			= Random
		 * 			= StringTokenizer => 네트워크 (채팅)
		 * 			  --------------- 개수가 적은 것은 상관 없지만 개수가 많은 경우에 문제가 발생한다.
		 */
/*
		String s = "admin|1234|홍길동";
		StringTokenizer st = new StringTokenizer(s, "|");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
*/
		// 개수는 3개인데 자르는 개수가 더 많을 경우 에러가 발생하기 때문에 (4등분 이상)
		// hasMoreToken()를 많이 사용한다.
		
	}

}
