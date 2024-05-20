package com.sist.main;


import java.util.*;

public class 예외처리_응용3 {
	// 3자리 정수 => 중복 없는 난수
	
	static void rand(int[] com) {
		for (int i = 0; i < com.length; i++) {
			com[i] = (int)(Math.random() * 9) + 1;
			// 중복 체크
			for (int j = 0; j <= i; j++) {
				// 중복된 수가 발생하면 난수를 다시 생성
				if (com[i] == com[j])
					i--;
				break;
			}
		}
	}
	static void inputData(int[] user) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("세 자리 정수 입력 : ");
			int input = scan.nextInt();
			
			if(input < 100 || 999 < input) {
				System.out.println("세자리 정수만 사용이 가능합니다.");
				continue;
			}
			user[0] = input / 100;
			user[1] = (input % 100) / 10;
			user[2] = input % 10;
			
			if (user [0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
				System.out.println("같은 수는 사용할 수 없습니다.");
			}
			if (user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
			break;
		}
	}
	// 비교
	static int compare(int[] com, int[] user) {
		int s = 0, b =0;
		 
		for(int i = 0; i < com.length; i ++) {
			for (int j = 0; j < user.length; j++) {
				if (com[i] == user[j]) {	// 같은 수가 있는지
					if (i == j)	
						s++;	// 같은 수가 같은 자리인지
					else
						b++;	// 같은 수가 다른 자리인지
				}
			}
		}
		hint(user, s, b);
		return s;
	}
	static boolean isEnd(int s) {
		boolean bCheck = false;
		if (s == 3)
			bCheck = true;
		return bCheck;
	}
	// 힌트
	static void hint(int[] user, int s, int b) {
		System.out.printf("Input Number %d%d%d, Result : %dS-%dB\n", user[0], user[1], user[2], s, b);
	}
	// 전체 메서드 조립
	static void process() {
		int[] com = new int[3];
		// 난수
		rand(com);	// 배열 주소를 메서드로 전송 => 값을 변경해서 가지고 온다 (Call By Reference)
		int[] user = new int[3];
//		inputData(user);
//		System.out.println(Arrays.toString(com));
		while (true) {
			int s = 0;
			inputData(user);
			compare(com, user);
			if(isEnd(s)) {
				System.out.println("Game Over !!");
				break;
			}
		}
		
	}	

	public static void main(String[] args) {
		process();
		
	}

}