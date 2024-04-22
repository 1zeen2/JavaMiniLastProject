// 	100~999 사이의 4의배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성

/*
 * 	범위 100 ~ 999까지 지정
 * 	4의 배수가 아닌 수의 개수 ==> 후치연산자 사용
 *  4의 배수가 아닌 수의 합	==> sum += i; 를 사용하여 조건에 해당하는 값을 sum에 계속 누적시킨다.
 */
public class 자바제어문_반복문_문제06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 4의 배수가 아닌 수의 개수와 합을 담을 변수 2개를 선언.
		int cnt = 0, sum = 0;
		
		// 100 ~ 999 사이의 값이 4의 배수가 아니면 sum에 그 값을 담고 cnt에 1개수를 담은 후 i의 값을 1씩 올린다.
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
