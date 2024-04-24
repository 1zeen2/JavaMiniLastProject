/*
 * 	1. 배열 생성
 * 		=> 같은 데이터형만 모아서 관리
 * 		=> 데이터형[]	배열명;
 * 		   ------
 * 		=> 데이터형 배열명[];	=> 사용은 가능 (C / C++)
 * 	2. 초기화
 * 		=> 데이터형 [] 배열명 = {값, 값..} => 변경하지 않는 데이터형
 * 		=> 데이터형 [] 배열명 = new 데이터형 [개수]
 * 			=> 기본 디폴트 값
 * 				int 	=> 0
 * 				char	=> '\0'
 * 				double	=> 0.0
 * 				long	=> 0L
 * 				boolean	=> false
 * 	3. 저쟁 개수 확인
 * 		=> length	=> 베열명. length
 * 	4. 데이터 변경
 * 		=> 연속적인 메모리 공간
 * 		   ---------------
 * 			=> 인덱스 번호를 이용해서 데이터를 변경하거나 읽는다
 * 			=> 변수, 배열
 * 			   --------
 * 				| 읽기 / 쓰기
 * 				  배열 => 읽기 / 쓰기 (수정 가능)
 * 			=> 인덱스 번호는 0번부터 시작이다.
 * 		
 * 			int [] arr = new int [3]
 * 								arr[0] arr[1] arr[2]
 * 			arr	 ------------> 	-------------------
 * 								0		0		0
 * 								-------------------	저장된 크기가 동일해야 한다 (같은 데이터형)
 * 								|		|		|
 * 								arr[0]	arr[1]	arr[2]
 * 					=> 값을 변경
 * 						arr[0] = 100
 * 						arr[1] = 200
 * 						arr[2] = 300
 * 						------------ 일반 변수 취급을 한다
 * 						* 인덱스는 0번부터 되어있다.
 * 						=> 반복문을 사용하기 편리하다
 * 						=> 5개 지정하면 변경할 수 없다 : 고정적 (가변형 => 클래스로 제작이 되어있음)
 * 						=> 소스량을 줄일 수 있다.
 * 						=> 소프트웨어 라인
 * 						   ----------- 하루 개발 코딩량 (퇴근하려면)
 * 							250줄 
 * 	5. for - each
 * 		형식)
 * 		for (데이터형 변수명 : 배열명) {
 * 			------------- 인덱스 번호가 아니라 실제 배열에 저장된 값이다.
 * 			배열 데이터 명과 변수명의 데이터 타입이 반드시 일치가 되어야 한다.
 * 			형변환을 할 수 없다.
 * 		}
 * 		=> 배열의 값을 변경하거나, 초기화를 하지 못한다.
 * 		=> Only 출력만 하며 웹에서 주로 사용한다.
 * 		
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	정수 10개 저장 => 용도가 같은 경우 => 배열 / 일반 변수
		int[] arr = new int [10];	// 변수 10개와 같은 효과
		//	arr 이름으로 10개의 데이터를 제어
		//	char 5개 => 'A' ~ 'E'
		char[] alpha = {'A', 'B', 'C', 'D', 'E'};
		//	데이터형 변환
		double[] data = {10.5, 20.5, 30.5, 40.5, 50};
		//	double d = 50 => d = 50.0으로 자동 형변환 되는 것과 같이 묵시적 형변환이 이루어진다
		//	작은 데이터형은 추가가 가능하다.
		for (double d : data) {
			System.out.println(d);
		}
		int[] arr2 = {'A', 'B', 'C', 'D', 'E'};
		
		System.out.println();				//	int로 들어갔기 때문에 65, 66, 67..로 들어감
		
		for (int i : arr2) {
			System.out.println(i); 
		}
		char[] ch = {65, 66, 67, 68, 69};	// int < == > char은 형변환 없이 저장이 가능하다.
		
		System.out.println();
		
		for ( char c : ch) {
			System.out.println(c);			// 큰 데이터형으로 값이 설정.
		}
		boolean[] boo = new boolean[5];
		
		System.out.println();
		
		for (boolean b : boo) {
			System.out.println(b);
		}
		String[] str = new String[5];	// 클래스 => null (주소가 없는 경우)
		
			System.out.println();
			
		for (String s : str) {
			System.out.println(s);
		}
		double[] dd = new double[5];
		
		System.out.println();
		
		for (Double d : dd) {
			System.out.println(d);
		}
	}

}
