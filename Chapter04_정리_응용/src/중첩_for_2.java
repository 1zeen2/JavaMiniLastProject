
public class 중첩_for_2 {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i ++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%2d * %2d = %2d\t",i ,j , (i * j));
			}
			System.out.println();
		}

	}
}
