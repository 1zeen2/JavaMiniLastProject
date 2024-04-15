/*
 * 부정연산자
 * ! (NOT) ==> boolean변수에서만 사용이 가능
 * 턴
 */
public class 연산자_단항연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck = false;
			//System.out.println(bCheck);
			//System.out.println(!bCheck)
		int count = 0;
		while(count < 10) {	//	count가 10보다 작을 때까지만 반복
			bCheck = !bCheck;
			if(bCheck == true)
				System.out.println("컴퓨터");
			else
				System.out.println("본인");
			count++;	//  반복이 한 번 끝날 때마다  count를 증가시킴
		}	
	}

}
