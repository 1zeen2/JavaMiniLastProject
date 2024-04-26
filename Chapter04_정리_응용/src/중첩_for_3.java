/*
 * 	★★★★★		★★☆★★
 * 	★★★★★		★★☆★★
 * 	★★★★★		★★☆★★

 * 	ABCD		ABCD
 * 	EFGH		ABCD
 * 	IJKL		ABCD
 * 	MNOP		ABCD
 * 
 */

import javax.annotation.processing.SupportedSourceVersion;

public class 중첩_for_3 {

	public static void main(String[] args) {
	for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();
		
		char c = 'A';
				
		for (int i = 1; i <=4 ; i++) {
			for (int j = 1; j <= 4; j ++) {
				System.out.print(c++);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 4; i ++) {
			char c1 = 'A';
			for (int j = 1; j <= 4; j++) {
				System.out.print(c1++);
			}
			System.out.println();
		}
		for (int i = 1; i <=5 ; i ++) {
			for (int j = 1; j <= 5; j ++) {
				if(j == 3) {
					System.out.printf("☆");
				} else {
					System.out.printf("★");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i ++) {
			for (int j = 1; j <= 4; j++) {
				if ( i == j) {
					System.out.print("☆");
				}
			}
			System.out.println();
		}
		String [] ima = {" ", "♠", "♣", "♥", "♥"};
		for (int i = 4; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
			System.out.println(ima[i]);
			}
		System.out.println(ima[i]);
		}
		
	}

}
