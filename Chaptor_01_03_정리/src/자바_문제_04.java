// char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성
public class 자바_문제_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = '0';
		int ch1 = (int)ch;
		if (0 <= ch1 && ch1 <= 9) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}		//ch를 어떻게 int로 바꿀 것 인가.
}
