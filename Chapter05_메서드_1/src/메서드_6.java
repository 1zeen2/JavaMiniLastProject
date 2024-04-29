// 3개의 중복 없는 난수 생성하여 출력

import java.util.Arrays;

public class 메서드_6 {
	// 나중에 필요한 부분 => 묶어서 사용 => 사용자 정의 라이브러리
	static void rand(int num) {
		int[] com = new int[num];
		for (int i = 0; i < com.length; i++) {
			com [i] = (int)(Math.random() * 100) + 1;
			for (int j = 0; j <i; j++) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}	
		System.out.println(Arrays.toString(com));
		}
	public static void main(String[] args) {
		rand(5);
	}

}
