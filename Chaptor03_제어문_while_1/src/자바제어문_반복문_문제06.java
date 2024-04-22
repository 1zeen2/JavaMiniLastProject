// 	100~999 사이의 4의배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성

/*
 * 	범위 100 ~ 999까지 지정
 * 	4의 배수가 아닌 수의 개수 ==> 후치연산자 사용
 *  4의 배수가 아닌 수의 합	==> sum += i; 를 사용하여 조건에 해당하는 값을 sum에 계속 누적시킨다.
 */
public class 자바제어문_반복문_문제06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cnt = 0, sum = 0;
		
		for (int i = 100; i <= 999; i++ ) {
			if (!(i % 4 == 0)) {
				
				sum += i;
				cnt++;
			}
		}
		System.out.println("4의 배수가 아닌 수의 개수	     : " + cnt);
		System.out.println("4의 배수가 아닌 수의 개수의 합 : " + sum);
	}

}
