// 학점을 구하는 메서드를 구현하시오 => ChoiceFormat
public class 메서드_문제_8 {

	static char munje_8 (int score) {
		
		char c = ' ';
		
		switch(score / 10) {
		case 10: case 9:
			c = 'A';
			break;
		case 8: 
			c = 'B';
			break;
		case 7: 
			c = 'C';
			break;
		case 6:
			c = 'D';
			break;
		default :
			c = 'F';
			break;
		}
		return c;
	}
	public static void main(String[] args) {
		char c = munje_8(90);
		System.err.println(c);

	}

}
