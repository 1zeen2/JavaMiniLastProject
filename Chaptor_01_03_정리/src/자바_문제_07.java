// 5~16까지의 합을 구하시오
public class 자바_문제_07 {

	public static void main(String[] args) {
/*		int sum = 0;
		// TODO Auto-generated method stub
		for (int i = 5; i <= 16; i++) {
			sum += i;
		}
		
		System.out.println(sum);
*/
/*
 * 1 ~ 100까지의 수 중 좌우 대칭인 수를 출력하는 프로그램을 작성하시오.
 * 	***%11을 사용하여 구할 수 있음.
 */
		for (int i = 1; i <= 100; i++) {
			if (i % 11 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
