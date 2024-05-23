package com.sist.util;

import java.util.*;

public class 라이브러리_2 {

	public static void main(String[] args) {
		// 1 ~ 100 사이의 난수 발생
		Random r = new Random();
		int com = r.nextInt(100) + 1;
		
		// 사용자 입력
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1 ~ 100 사이의 정수 입력 : ");
			int user = scan.nextInt();
			if  (user < 100 || 100 < user) {
				System.out.println("잘못된 입력 입니다.");
				continue;
			}
			if (com > user) {
				
				System.out.println("더 작은 값을 입력해부세요");
			} else if (com < user) {
				
				System.out.println("더 큰 값을 입력해부세요");
			} else {
			System.out.println("정답입니다.");
			}
	}	

}
}
