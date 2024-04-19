// 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.
/*
 * i%2를 사용하여 짝수를 구해야 한다.
 */
public class 자바_문제_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int sum2 = 0;
		
		for (int i = 3; i <=4462; i++) {
			if (i %2 == 0) {
				sum += i;
			} else {
				sum2 += i;
			}
		}
		System.out.println("3 이상 4462 이하에서 짝수인 정수의 합 : " + sum);
		System.out.println("3 이상 4462 이하에서 홀수인 정수의 합 : " + sum2);
	}
}
