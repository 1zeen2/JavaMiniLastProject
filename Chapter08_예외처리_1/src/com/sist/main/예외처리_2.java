package com.sist.main;

//try ~ catch => 수행 (웹에서 필수 => 네트워크와 관련), 오라클 연동...
		// 웹, 파일, 오라클 => 예외 처리는 분법 (반드시 추가)
		/*
		 * 파일을 읽어서 데이터 출력
		 * try {
		 * 	FileReader fr = new FileReader("경로명")
		 * 
		 * 	int i = 0;
		 * 	
		 *	 while((i = fr.read()) != -1) {
		 * 		System.out.println((char)i)
		 * 	}
		 * 	fr.close()
		 * } catch (IOException e) {}
		 * 
		 */

public class 예외처리_2 {
	public static void main(String[] args) {
		
		try {
			System.out.println("문장 1번");
			System.out.println("문장 2번");
			System.out.println("문장 3번");
			System.out.println(10 / 0);				// Error 발생 ==> Error 발생 시 catch 까지 모든 문장은 건너뛴다.
			System.out.println("문장 4번");
			System.out.println("문장 5번");	
		} catch (RuntimeException e) {			// catch 는 건너뛴다 (에러가 없다면)
			System.out.println("에러발생 => 복구");	// 에러가 발생시에만 수행
		} 
		System.out.println("문장 6번");
		System.out.println("문장 7번");
		System.out.println("프로그램 종료");
	}
	
}
