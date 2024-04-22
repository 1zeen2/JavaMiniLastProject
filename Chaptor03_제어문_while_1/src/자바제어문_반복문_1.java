/*
 * 	while과 for문은 동일한 반복문이지만
 *  일정 횟수를 통해 원하는 값을 얻는 경우	==> for
 *  반복 횟수가 명확하지 않은 경우 		==> while
 *  개발자의 취향에 따라 갈리기도 한다
 *  
 *  while
 *  ----- 파일 읽기, 데이터베이스 읽기, 네트워크 서버
 *  	  -------------------------------	Back-End   (while 주로 사용)
 *  	  화면 출력, 페이지 나누기, ...
 *  	  ------------------------------- Front-End  (for 주로 사용)
 * 	형식과 순서)
 * 
 * 		초기 값 ---------------1
 * 		while (조건식) { ------2
 * 			반복 수행 문장 ------3
 * 			증감식 ------------4	-----> 2번으로 이동 ==>  1 => 2-3-4 => 2-3-4 => 2번이 false면 종료
 * 		}
 * 	
 * 	주로 while은 무한 루프 시에 주로 사용하는 경우가 많음.
 * 		for (;;)
 * 		while (true) ***주로 사용
 * 
 * 	1 ~ 10까지 출력
 * 	
 * 	1) for (int i = 1; i <= 10; i++) {
 * 			System.out.println(i + " ");
 * 		}
 *
 *		int i = 1;								for과 while이 같은 내용이다
 *		
 *		while (i <= 10) {
 *			System.out.println(i + " ");
 *			i++;
 *		}
 */
public class 자바제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <=10; i++) {
			System.out.println(i + " "); 
			
		}
		
		System.out.println("====== while ======");

		int i = 1;
		while (true) {			
			System.out.println(i + "");
			i++;
		}
	}

}
