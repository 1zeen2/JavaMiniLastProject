/*
 * 임의의 문자 5개를 저장하고 정렬해서 출력하시오 
    A C D H J
    A C D H J
    J H D C A

 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class 문자열배열_문제7 {

	public static void main(String[] args) {

		char[] alpha = new char[5];
	
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = (char)((int)(Math.random() * 26) + 65);
		}
			System.out.println("변경 전 : ");
			System.out.println(Arrays.toString(alpha));
			Arrays.sort(alpha);
			System.out.println("변경 후 : ");
			
			System.out.print("[");
		for (int i = alpha.length -1; i >= 0; i--) {

			System.out.print(alpha[i] + " ");
		}
		System.out.print("]");
	}

}
 