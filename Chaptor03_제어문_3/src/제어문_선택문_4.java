// 10, 9 = A / 8 = B / 7 = C / 6 = D / 나머지 = F
public class 제어문_선택문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int)(Math.random() * 11);
		System.out.print("score = " + score);
		
		switch (score) {
			case 10:	// if (score == 10 || score == 9)
			case 9:
				System.out.println(" A");
				break; 
			case 8:
				System.out.println(" B");
				break;
			case 7:
				System.out.println(" C");
				break;
			case 6:
				System.out.println(" D");
				break;
			default:
					System.out.println(" F");
			
		}
	}

}
