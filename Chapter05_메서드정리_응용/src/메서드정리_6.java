/*
 * 	메서드
 * 		=> 지역 변수, 매개 변수 => 메서드가 종료되면 자동으로 사라진다.
 * 		=> 사라지지 않는 변수를 제작한다면 => 매개 변수가 필요 없지 않을까
 */

import java.awt.print.Printable;
import java.util.Scanner;

public class 메서드정리_6 {
	// 멤버 변수, 공유 변수 => 클래스 전체에서 사용
	// 지역 변수 : 메서드 안에서 사용된다 => 리턴형이 있어야 값을 전달해 줄 수 있음.
	// ------
	// 매개 변수 : 메서드 안에서만 사용
	
	static int[] kor	= new int[3];
	static int[] eng	= new int[3];
	static int[] math	= new int[3];
	static int[] total	= new int[3];
	static double[] avg= new double[3];
	static int[] rank	= new int[3];
	static char[] score = new char[3];
	// 클래스 블럭에 선언되면 모든 메서드는 변수 사용이 가능하며 => 프로그램 종료 시에 메모리에서 해제된다.
	
	static void userInput() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < kor.length; i++) {
			System.out.print((i+1) + "번 째 국어 : ");
			kor[i] = scan.nextInt();
			
			System.out.print((i+1) + "번 째 영어 : ");
			eng[i] = scan.nextInt();
			
			System.out.print((i+1) + "번 째 수학 : ");
			math[i] = scan.nextInt();
			// 총점
			total[i] = kor[i] + eng[i] + math[i];
			// 평균
			avg[i] = total[i] / 3.0;
			
			switch(total[i] / 30) {
			case 10:
			case 9:
				score[i] = 'A';
				break;
			case 8:
				score[i] = 'B';
				break;
			case 7:
				score[i] = 'C';
				break;
			case 6:
				score[i] = 'D';
				break;
			default:
				score[i] = 'F';
				break;
			}
		}
	}
	static void rankChange() {
		for (int i = 0; i < total.length; i++) {
			rank[i] = 1;
			for (int j = 0; j< total.length; j++) {
				if (total[i] < total[j]) {
					rank[i]++;
				}
			}
		
		}
	}

	static void print() {
		for (int i = 0; i < 3; i++) {
			System.out.println(kor[i] + " " + eng[i] + " " + math[i] + " " + total[i] + " " + avg[i] + " " + score[i] + " " + rank[i]);
		}
	}
	static void process() {
		userInput();
		rankChange();
		print();
		
	}
	public static void main(String[] args) {
		process();

	}

}
