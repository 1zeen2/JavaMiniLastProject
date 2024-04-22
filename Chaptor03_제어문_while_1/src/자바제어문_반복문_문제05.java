//	100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성

/*
 *  100 ~ 999 범위지정
 *  7 배수의 갯수 골라내기
 *  7의 배수의 합 출력.
 */
public class 자바제어문_반복문_문제05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, cnt = 0;
		
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
