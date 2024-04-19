/*
 *   x 변수 생성 초기값 200;
 *   y 변수 생성 초기값 100;
 *   sum 변수 생성 x + y 더한값
 *   --sum을 출력하는 프로그램
 */
/*	닭 	2
 *  돼지 3
 *  소	4
 *  다리의 개수 출력
 */
/*
 * 상품의 가격 : 1200
 * 상품의 개수 : 3
 * 배송비 : 3000
 */
import java.util.Scanner;
public class 자바변수_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int x = 200, y = 100;
		int sum = x + y;
		System.out.println(sum);
*/
/*		int c = 2;
		int p = 3;
		int co = 4;
		System.out.println("다리 개수의 총 합 : " + (c*2 + p*4 + co*4));
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("구매하실 개수를 입력하세요.");
		int a = scan.nextInt();
		System.out.println(a * 1200 + 3000);
	}

}
