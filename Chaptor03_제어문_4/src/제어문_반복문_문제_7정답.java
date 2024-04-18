
public class 제어문_반복문_문제_7정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 30; i ++) {
			if (i %2 == 0) {
				System.out.printf("%2d ", i);	//	==> "%2d " 	==> 2자리를 사용하여 일의 자리 숫자가 배열이 맞아 보기가 깔끔함
				if(i %3 == 0) {					//	==> "%02d " ==>	1의 자리가 02, 04, 06, 08로 출력되어 배열이 잘 맞음.
					System.out.println();
				}
			}
			}
	}
}
