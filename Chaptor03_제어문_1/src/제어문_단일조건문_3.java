/*
 * 	if(조건문) => 웹(page를 나눈 경우, 상세 보기, 검색)
 * 	
 * 	조건문 형식)
 * 		if(조건문) => 부정연산자(!), 비교연산자, 논리연산자
 * 		{
 * 			실행 문장 => 조건이 true일 때만 수행이 된다
 * 		}
 * 	----------------------------------------------------------
 * 	연산자 사용법
 * 		산술연산자
 * 		----------	일반 계산
 * 		비교연산자
 * 		논리연산자
 * 		부정연산자
 * 		----------	조건문, 반복문
 * 		증감연산자
 * 		----------	반복문
 * 		대입연산자 ==>	결과 값 받기
 * 			
 * 		대입연산자	:
 * 
 * 
 */
public class 제어문_단일조건문_3 {

		public static void main(String[] args) {
			/*
			 * 0 ~ 100 사이의 난수를 생성하며 50 이상이면  sum이라는 변수에 축적하고 그 값을 출력.
			 * 	1) sum 변수 값 초기화
			 * 	2) 난수 생성
			 * 	3) 조건에 해당하는 난수는 sum에 축적
			 * 	4) sum 출력
			 */
			int sum = 0;
			int num = (int)(Math.random() * 100) + 1;
			System.out.println("1. num = " + num);
			
			if(num >= 50)
				sum += num;	//	sum = sum + num
			
			num = (int)(Math.random() * 100) + 1;
			System.out.println("2. num = " + num);
			
			if(num >= 50)
				sum += num;	//	sum = sum + num
			
			num = (int)(Math.random() * 100) + 1;
			System.out.println("3. num = " + num);
			
			if(num >= 50)
				sum += num;	//	sum = sum + num
				
			System.out.println("====== 결과 값 ======");
			System.out.println("sum = " + sum);
		}
}
