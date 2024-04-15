//	점수 >=60 <= 100 ==> true
public class 연산자_논리연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int)(Math.random() * 100) + 1 ;
		System.out.println("난수 값 : " + score);
		
		boolean bCheck = score >= 60 && (score %2 == 0);
		//							2로 나누었을 때 나머지가 0인지 묻는 짝수 조건
		
		System.out.println(bCheck);
		
		
		//	score가 40 이상이고 score가 홀수인 값을 출력.
		//	boolean bCheck = score >= 40 && (score%2 == 1);
		//								    (score%2 != 0);
		//							2로 나누었을 때 나머지가 0이 아닌지 묻는 홀수 조건
		
		
		
		
		
		
	}

}
