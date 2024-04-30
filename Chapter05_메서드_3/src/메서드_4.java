/*
 * 	자바 == 오라클 == HTML / CSS / JavaScript
 * 		   ------------------------------------ (Java가 정리가 다 된다면 간당하다)
 * 	JSP == MVC == Spring == Python == Django
 * 			|		|		   |		|
 * 		1차프로젝트	|		   |	 파이썬 웹
 * 	(Ajax, Jquery)	|		   |
 * 				2차 프로젝트	   |
 * 					(Vue3)	   |
 * 						   데이터 분석
 * 					(Numpy, Pandas, MatplotLib)
 * 
 * 	Spring-Boot === AWS
 * 		|			 |
 * 		|			 | 리눅스 명령어 => Hosting
 * 	   개인 (React, Redux, React-Query, NextJS)
 * 	   ----------------------------------------- MSA(Spring-Cloud)
 * 
 * 자바
 * 	= 변수 / 연산자 / 제어문 / 메서드
 *    ------------------------- 메서드 여러 개 묶음 (클래스) => 재사용
 * 
 * 	= 메서드
 * 		=> 매개 변수 	: 사용자로부터 받는 값
 * 		=> 결과 값	: 어떤 데이터를 넘겨줄 것인가
 * 		=> 메서드 명
 * 		=> 구현 => 결과 값을 도출하기 위한
 * 		=> 어느 위치에서 호출할 것 인가
 * 	--------------------------------------------
 * 	1) 사용자 로그인 요청
 * 		매개 변수 : id, password
 * 		리턴 형	: boolean
 * 	2) 아이디 중복 체크
 *  	매개 변수	: id
 *  	리턴 형	: boolean
 * 	3) 우편 번호 검색
 * 		매개 변수	: dong
 * 		리턴 형	: String[]
 * 	4) 맛집 검색
 * 		매개 변수	: 검색어(String)
 * 		결과 값	: String[]
 * 	5) 노래 검색
 * 		매개 변수	: 검색어(String)
 * 		결과 값	: String[]
 * 	-------------------------- 결과 값을 브라우저에 출력하면 (웹)
 * 
 * 	=> 형식)
		=> 어떤 값을 받아서 어떤 값을 보내줄지...
 * 		리턴형 메서드 명(매개 변수 ...) {
 * 			구현 (요청 처리)
 *  	return 결과 값
 *  	}
 *  
 *  => 호출
 *  	데이터형(리턴형) 변수명 = 메서드()
 *  
 *  => 기능별 분리
 *  	= 입력 부분
 *  	= 처리 부분
 *  	= 출력 부분
 *  ---------- 모든 자바는 세 가지로 형태로 나눠서 처리
 *  
 *  => 리턴형
 *  	 한	가지 데이터 형	(기본형)	=> 정수형 / 실수형 / 논리형 / 문자형
 *  		int		메서드명()
 *  		char	메서드명()
 *  		double	메서드명()
 *  
 *  	여러 가지 데이터 형	(배열)
 *  	 int[]		메서드 명()
 *  	double[] 	메서드 명()
 *  
 *  => 매개 변수는 여러 개 사용이 가능
 *  	=> 5개의 정수를 보내서 정렬하는 프로그램
 *  	  ---------
 *  	메서드 명(int[] arr) ==> 3개 이상의 파라미터가 있기 때문에 배열을 이용한다.
 *  
 *  => 메서드 안에 있는 변수들은 블럭 변수이기 때문에 메서드가 종료되면 사라진다.
 *  					  --------	반드시 초기화가 되어야 한다.
 *     --------------------------	매개 변수 => 지역 변수와 동일함.
 */
// 배열
// 5개의 정수를 임의로 추출하여 최대값 / 최소값을 출력하시오
public class 메서드_4 {
		// 1. 정수 추출	==> 입력 
	static int[] input() { // 정수 여러 개를 전송
		int[] arr = new int[5];
		// 2. 배열에 임의로 추출된 값을 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		return arr;	// 배열은 배열 명만 전송 => 배열명(메모리 주소)
	}
		// 2. 최대값		ㄱ
	static int max(int[] arr) {
		int max = arr[0];
		for (int i : arr) {
			if(max < i)
				max = i;
		}
		return max;
	}
	static int min(int[]arr) {
		int min = arr[0];
		for (int i : arr) {
			if (min > i)
				min = i;
		}
		return min;
	}
		// 3. 최소값		==> 구현부
		// 4. 출력		==> 출력
	static void process() {
		// 1. 정수 5개 받기
		int[] arr = input();
		int max = max(arr);
		int min = min(arr);
		
		for (int i : arr) {
			System.out.println(i);
			System.out.println("\n최대값 : " + max);
			System.out.println("최소값 : " + min);
			System.out.println(min);
		}
			
	}
	public static void main(String[] args) {
		process();
		// 1. 배열 선언
		
		// 3. 최대값 / 최소값
/*	int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
			
			if (min > arr[i])
				min = arr[i];
		}
		
		// 전체 정수 출력
		for (int i : arr) {
			System.out.println(i + " ");
		}
		System.out.println(); // 다음 줄 출력
		System.out.println(max);
		System.out.println(min);
		*/
	}

}
