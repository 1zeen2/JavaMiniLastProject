//	100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성

/*
 *  100 ~ 999 범위지정
 *  7 배수의 갯수 골라내기
 *  7의 배수의 합 출력.
 */
public class 자바제어문_반복문_문제05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 7의 배수의 합과 개수를 담을 변수 2개 선언.
		int sum = 0, cnt = 0;
		
		// 100부터 999 사이의 값중 7의 배수인 수가 나오면 그 개수와 값을 변수에 담고 i의 값을 1씩 올린다.
		for(int i = 100; i <= 999; i++) {
			if(i %7 == 0) {
				
				sum += i;	// sum을 사용하여 값을 계속 누적시킨다.
				cnt ++;		// 개수를 셀 때 후치 연산자를 사용하여 1개씩 올린다.
			}
		}
		System.out.println("7의 배수의 개수 : " + cnt);
		System.out.println("7의 배수의  합  : " + sum);

	}
}
