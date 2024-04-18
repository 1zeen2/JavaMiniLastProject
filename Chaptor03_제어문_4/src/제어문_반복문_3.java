// 1 ~ 100까지의 합
public class 제어문_반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i<= 100; i ++) {
			sum += i;
			System.out.println("i = " + i + ", sum =" + sum);
		}
		System.out.println("1 ~ 100까지의 합 : " + sum);
	}

}
