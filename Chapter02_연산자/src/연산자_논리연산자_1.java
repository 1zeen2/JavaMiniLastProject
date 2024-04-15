/*	
 * 	논리연산자 ==> 결과값은 true / false
 * 	&&	=>	직렬연산자	=>	범위, 기간 포함
 * 			jumsu >= 0 && jumsu <= 100		0 ~ 100 사이에 있는지
 * 
 * 	||	=>	병렬연산자	=>	범위, 기간을 벗어난 경우
 * 			jumsu <	 0 || jumsu > 100
 * 
 * 
 * 	false				==>	false
 * 							=>	이후의 값에 상관 없이 false가 출력되니 연산이 되지 않음
 * 								속도가 빨라짐
 * 	(조건)	&&	(조건)
 * 	----		-----
 * 	  l			  l
 * 	  -------------
 * 			l
 * 		   결과값
 *	true				==>	true	==>	최적화 연산	
 *							=>	이후의 값에 상관 없이 true가 출력되니 연산이 되지 않음
 *								속도가 빨라짐
 *	(조건)	||	(조건)
 *	----		----
 *	  l			  l
 *	  -------------
 *			l
 *		   결과값
 *
 * 
 * 	--------------------------------------
 * 						&&			||
 * 	--------------------------------------
 *		true	true	true		true
 * 	--------------------------------------
 * 		true	false	false		true
 * 	--------------------------------------
 * 		false	true	false		true
 * 	--------------------------------------
 * 		false	false	false		false
 * 	--------------------------------------
 *
 *
 *
 */
public class 연산자_논리연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 9;
		
		/*	앞의 값이 false면 뒤의 전치연산자를 수행하지 않는 최적화 연산자
		 *	앞의 결과에 따라 뒤의 연산을 스킵할 수 있어 연산 속도가 빠르다는 장점이 있다.
		 */	
		
		boolean bCheck= x == y && ++ y == x;
		System.out.println("bCheck = " + bCheck);
		System.out.println("x = " + x); 
		System.out.println("y = " + y);

	}
}
