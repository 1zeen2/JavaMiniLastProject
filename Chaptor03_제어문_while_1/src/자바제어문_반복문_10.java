// 빈도수 => 0, 1
public class 자바제어문_반복문_10 {
	/*
	 * int i = 1;
	 * while (i <= 5) {
	 * 	System.out.print(i);
	 *  i++
	 *  }
	 *  
	 *  i = 1  ==> i <= 5 ==> i출력 ==> i++ 
	 *  i = 2  ==> i <= 5 ==> i출력 ==> i++ 
	 *  i = 3  ==> i <= 5 ==> i출력 ==> i++ 
	 *  i = 4  ==> i <= 5 ==> i출력 ==> i++ 
	 *  i = 5  ==> i <= 5 ==> i출력 ==> i++ 
	 *  
	 *  i = 6이 되면 i <= 5가 성립하지 않기 때문에 종료.
	 */
	
	public static void main(String[] args) {
		// 0, 1의 개수
		
		int cnt0 = 0, cnt1 = 0, i = 1;
		
		while (i <= 100) {	// 반복 문장 => 난수를 발생하여 0인지 1인지 확인
			int num = (int)(Math.random() *2);
			
			if (num == 0)
				cnt0++;
			if (num == 1)
				cnt1++;
			i++;
		}
			System.out.println("0이 나올 경우 : " + cnt0);
			System.out.println("1이 나올 경우 : " + cnt1);
		}

}
