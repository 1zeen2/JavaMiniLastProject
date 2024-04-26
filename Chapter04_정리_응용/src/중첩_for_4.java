/*
 * *
 * **
 * ***
 * ****
 * 
 */

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class 중첩_for_4 {

	public static void main(String[] args) {		for (int i = 1; i <= 4; i ++) {

			for (int j = 1; j <= i; j ++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();
		
	for (int i = 1; i <= 4; i ++) {

			for (int j = 1; j <= 5-i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();
	
	for (int i = 1; i <= 4; i ++) {

		for (int j = 1; j <= i-1; j++) {
			System.out.print(" ");
		}
		for (int k = 1; k <= 5-i; k++) {
			System.out.print("★");
		}
		System.out.println();
	}
}
}