
public class 제어문_반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. A ~ Z까지 출력
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c+ " " );
		}
		System.out.println();
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");
		}
		System.out.println();
		for (char c = 'Z'; c >= 'A'; c--) {
			System.out.print(c + " ");
		}
		System.out.println();
		for (char c = 'z'; c >= 'a'; c--) {
			System.out.print(c + " ");
		}
	}

}
