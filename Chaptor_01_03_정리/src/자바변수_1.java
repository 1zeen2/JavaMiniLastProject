/*
 * 	돈까스 : 8000
 * 	칼국수 : 6000
 * 	왕만두 : 5000
 * 	-----------
 * 	주문 : 돈까스 16인분
 * 		  칼국수 8인분
 * 		  왕만두 1인분
 * 	-----------
 * 	총 계산서를 출력하시오.
 */
// 사용자에게 값을 받기 위해 Scanner 클래스 호출
import java.util.Scanner;
public class 자바변수_1 {
	
	public static void main(String[] args) {
		// 돈까스를 몇 개 주문할지 사용자에게 값을 받음
		Scanner scan = new Scanner(System.in);
		System.out.println("돈까스를 몇 개 주문하시겠습니까 ? : ");					//// 돈까스 칼국수 왕만두를 모두 주문하는 게 아니라
		int don = scan.nextInt();											/// 1, 2 ,3을 통해 메뉴를 고르고 난 후 주문하는 방식으로 
																			/// 메뉴 선택, 수량 선택, 가격 표시, 메뉴 고르고 나갈건지 더 주문할건지 확인
		// 칼국수를 몇 개 주문할지 사용자에게 값을 받음
		System.out.println("칼국수를 몇 개 주문하시겠습니까 ? : ");
		int kal = scan.nextInt();
		
		// 왕만두를 몇 개 주문할지 사용자에게 값을 받음
		System.out.println("왕만두를 몇 개 주문하시겠습니까 ? : ");
		int wang = scan.nextInt();
		
		// 돈까스 주문 수량에 따라 1개면 8천원, 나머지 개수는 o만 o천원으로 출력
		System.out.println("돈까스 " + don + "개를 주문하였습니다.");
		if (don == 1) {
			System.out.println("가격은 8천원 입니다." + "\n");
		} else if ((don * 8000 % 10000) == 0 ){
			System.out.println("가격은 " + (don * 8 / 10) + "만원 입니다." + "\n");
		} else {
			System.out.println("가격은 " + (don * 8 /10) + "만 " + (don * 8 % 10) + "천원 입니다." + "\n");
		}

		// 칼국수 주문 수량에 따라 1개면 6천원, 나머지 개수는 o만 o천원으로 출력
		System.out.println("칼국수 " + kal + "개를 주문하였습니다.");
		if ( kal == 1) {
			System.out.println("가격은 6천원 입니다." + "\n");
		} else if ((kal * 6000 % 10000) == 0 ){
			System.out.println("가격은 " + (kal * 6 / 10) + "만원 입니다." + "\n");
		} else {
			System.out.println("가격은 " + (kal * 6 /10) + "만 " + (kal * 6 % 10) + "천원 입니다." + "\n");
		}

		// 왕만두 주문 수량에 따라 1개면 5천원, 나머지 개수는 o만 5천원으로 출력
		System.out.println("왕만두 " + wang + "개를 주문하였습니다.");
		if (wang == 1) {
			System.out.println("가격은 5천원 입니다." + "\n" + "\n");
		} else if ((wang * 5000 % 10000) == 0 ){
			System.out.println("가격은 " + (wang * 5 / 10) + "만원 입니다." + "\n");
		} else {
			System.out.println("가격은 " + (wang * 5 /10) + "만 " + (wang * 5 % 10) + "천원 입니다." + "\n");
		}

		
	}
}
