/*
 * 	반복문 	=> 데이터베이스에서 데이터를 읽어 올 때
 * 				파일 읽기 / HTML 화면 출력
 * 	1) for	/	for - each	/	for 2차
 * 		=> for - each : 배열 출력, 컬렉션 출력할 때 사용. 출력 전용 반복문이다.
 * 		형식)
 * 			for (배열에 받을 데이터를 받을 변수 : 배열)
 * 				int i : 정수형 arr[]	==> 이와 같이 데이터 타입이 일치해야 한다
 * 
 * 			=> 자바스크립트 : for Each, each, map, for - of
 * 	-----------------------------------------------------------------------
 * 		=> 2차 for문의 형식
 * 			for (초; 조; 증감) {	
 * 					 | true면 아래로. false면 종료.
 * 				for (초; 조; 증감) {
 * 				}
 * 			}
 * 			i = 1 => i <=3; true 
 * 					j = 1 j++
 * 					j = 2 j++
 * 					j = 3 j++
 * 					j = 4 false ===> i++
 * 			i = 4 => for문 종료.
 * 
 * 	
 * 	2) while
 */
import java.util.Scanner;

public class 중첩_for_7 {
	//	3명의 국 영 수 점수를 받아 총점 평균 학점 등수 출력 프로그램
	//	100 90 78 89 90 90 89 78 67 90
	public static void main(String[] args) {
		String[] name = new String[3];
		// 사용자 입력
		int[] kor    = new int[3];
		int[] eng 	 = new int[3];
		int[] math   = new int[3];
		// 처리 결과
		int[] total	 = new int[3];
		double[] avg = new double[3];
		char[] score = new char[3];
		int[] rank 	 = new int[3];
		// 용도 별로 나눠서 저장
		//	1. 프로그램에 필요한 변수 / 배열 선언	==> 저장 공간을 잘 캐치해야 한다.
		//	2. 사용자 입력
		//	3. 입력된 데이터를 처리	=> 요청 처리
		//	4. 처리한 데이터를 화면에 
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < kor.length; i++) {
			System.out.print("이름 입력 :");
			name[i] = scan.next();
			System.out.print((i + 1) + "번째 국어 : ");
			kor[i] = scan.nextInt();
			System.out.print((i + 1) + "번째 영어 : ");
			eng[i] = scan.nextInt();
			System.out.print((i + 1) + "번째 수학 : ");
			math[i] = scan.nextInt();
			
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / (double)kor.length;
			
			switch (total[i] / 30) {
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
			}
		}
		// 순위 결정	=> 등수 구하기 알고리즘 = 정보 처리 문제 / 중소 기업 코딩 테스트
		for (int i = 0; i < kor.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < kor.length; j++) {
				if ( total[i] < total[j])
					rank[i]++;
			}
		}
		for (int i = 0; i < kor.length; i++) {
			System.out.printf("%-7s%-5d%-5d%-5d%-5d%-7.2f%3c\n%-3d\n", 
							name[i], kor[i], eng[i], math[i], total[i], avg[i], score[i], rank[i]);
		}

	}

}



