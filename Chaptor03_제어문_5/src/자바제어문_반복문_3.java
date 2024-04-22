
public class 자바제어문_반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3 = 0, a5 = 0, a7 = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				a3 ++;
			if (i % 5 == 0)
				a5 ++;
			if (i % 7 == 0)
				a7 ++;
		}

	}

}
