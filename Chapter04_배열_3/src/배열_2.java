/*
 * 	문자 10개를 저장
 * 	=> 출력
 * 		HELLO
 * 	=> 반대 출력
 * 		OLLEH
 * 	=> Sort	=>	2차 for	=> 
 * 	
 * 	-----------------------------------------------------------------------------------	
 * 	면접 : 	기술 면접 / 코딩 테스트 / 인성 면접
 * 			--------				----------
 * 		기본 개념 문제는 많이 나오지 않고 본인 포트폴리오 기준으로 면접이 진행되는 경우가 많음
 * 
 * 							
 * 			테이트지	/ 인성 면접
 * 			------------------
 * 	-----------------------------------------------------------------------------------	이력서
 */
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = new char[10];
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = (char)((Math.random() * 26) + 65);	//	(Math.random() * 26) + 65를 먼저 괄호로 묶고 그 값을 문자형으로 변환해야 오류가 생기지 않는다.
		}
		for ( char c : alpha) {
			System.out.printf(c + " ");
		}
		System.out.println("\n------------------반대로 출력 ");
		
		for (int i = alpha.length -1 ; i >= 0; i--) {
			System.out.printf(alpha[i] + " ");
		}

	}

}
/*
 * 		for (데이터형 변수 : 배열명)
 * 			char[]
 * 	
 * 			for (char c : 배열)
 * 			for (int i : 배열)
 * 			for (double d : 배열)
 * 
 * 			장점
 * 			* 가급적이면 같은 데이터형으로 받는 것이 좋다.
 * 			* 인덱스를 이용하는 것이 아니라 실제 배열에 저장된 값을 읽어오는 방식이다.
 * 			
 * 			단점
 * 			* 관련된 다른 배열의 값을 출력하지 못한다는 단점이 있다.
 * 
 * 			String[] names{"", "", "", "", ""};
 * 			String[] sexs {"", "", "", "", ""};
 * 			--------------> 두 개를 동시에 이용하려면 index를 이용해야 하기 때문에 for문을 사용해야 한다.
 * 
 * 			이름 (성별)
 * 			for(String name:names);
 * 
 * 
 */
