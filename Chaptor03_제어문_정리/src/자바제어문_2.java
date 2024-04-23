
public class 자바제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i  = 1; i <= 5; i++ ) {
			if (i == 3) continue;
			System.out.println(" i = " + i);
		}
		System.out.println("===================");
		
		int i = 1;
		
		while (i < 5) {
			if (i ==3) continue;
			System.out.println("i  = " + i);
		}
		System.out.println("====================");
		
		int j = 1;
		
		while (j <= 5) {
			if (j == 3)
				continue;
			System.out.println(" j :" + j);
			j++;
		}
	}

}
/*
 *	구구단 / 페이지 나누기 => 조건
 *	  |			  | 
 *    |			1차 for문
 *   2차 for문 
 */

