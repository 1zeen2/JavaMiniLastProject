/*
 * 	||	(or)	=>
 * 		(조건)	||	(조건)
 * 		-----		-----
 * 		  l			  l
 * 		  -------------
 * 				l
 * 			  결과 값 ===> 병렬연산자 => 조건 중에 한 개 이상이 true면 true가 되는 연산자
 * 							범위를 벗어난 경우에 주로 처리한다.
 * 							score >= 60 && score < 70	=> 60 ~ 69
 * 							score <= 60 || score > 70	=> 60미만 70이상
 * 	
 * 
 * 
 */
public class 연산자_논리연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 난수를 통해 나온 score가 1 ~ 29, 71 ~ 100이면 true를 출력하는 코드
		// 난수를 통해 나온 숫자가 몇인지, true가 맞는지 확인하는 출력 2개 사용
		int score = (int)(Math.random() * 100) + 1; // 1 ~ 100 추출
		System.out.println("score = " + score);
		boolean bCheck = (score < 30) || (score > 70);
		System.out.println(bCheck);
	}

}
