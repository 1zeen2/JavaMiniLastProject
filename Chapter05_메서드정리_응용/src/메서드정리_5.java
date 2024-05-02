// 3명의 학생 = 국어 영어 수학 점수를 받아 총점과 평균을 내시오.
import java.util.Scanner;

public class 메서드정리_5 {
	
	static void input(int[] kor, int[] eng, int[] math, int[] total, double[] avg, int[] rank, char[] score) {
		// 1. 입력
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
	static void rankChange(int[] total, int[] rank) {
		
		for (int i = 0; i < total.length; i++) {
			rank[i] = 1;
			for (int j = 0; j< total.length; j++) {
				if (total[i] < total[j]) {
					rank[i]++;
				}
			}
		
		}
	}
	static void print(int[] kor, int[] eng, int[] math, int[] total, double[] avg, int[] rank, char[] score) {
		for (int i = 0; i < 3; i++) {
			System.out.println(kor[i] + " " + eng[i] + " " + math[i] + " " + total[i] + " " + avg[i] + " " + score[i] + " " + rank[i]);
		}
		
	}
	static void process() {
		int[] kor	= new int[3];
		int[] eng	= new int[3];
		int[] math	= new int[3];
		int[] total	= new int[3];
		double[] avg= new double[3];
		int[] rank	= new int[3];
		char[] score = new char[3];
		
		input(kor, eng, math, total, avg, rank, score);
		rankChange(total, rank);
		print(kor, eng, math, total, avg, rank, score);
	}
	

	public static void main(String[] args) {
	process();
	
	}

}
