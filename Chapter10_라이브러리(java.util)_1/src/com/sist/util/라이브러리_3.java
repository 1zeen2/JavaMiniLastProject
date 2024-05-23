package com.sist.util;
// java.lang 을 제외한 나머지는 모두 import 필수.
import java.util.*;

public class 라이브러리_3 {
	public static void main(String[] args) {
		Random r = new Random();
		
		for (int i = 1; i <= 10; i++) {
			int score = r.nextInt(5) + 1;
			
			switch (score) {
			case 1:
				System.out.println('A');
				return;
			case 2:
				System.out.println('B');
				return;
			case 3:
				System.out.println('C');
				return;
			case 4:
				System.out.println('D');
				return;
			case 5:
				System.out.println('F');
				return;
			}
			System.out.println(score);
		}
	}

}
