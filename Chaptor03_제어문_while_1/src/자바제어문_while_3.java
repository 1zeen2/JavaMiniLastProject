/*
 * 	A -> Z 		=> for
 * 	Z -> A		=> while
 */
public class 자바제어문_while_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.printf(c + " ");
		}
			System.out.println();
			System.out.println();
			System.out.println("============");
			System.out.println();
		char c= 'Z';
		
		while (c >= 'A') {
			System.out.printf(c + " ");
			c--;
		}
	}

}
