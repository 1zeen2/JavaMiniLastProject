
public class 제어문_선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = (int)(Math.random() * 3);
		//	정수 => 상수
		//	순서는 상관이 없다
		
		
		switch (com) {	// 정수를 받았을 때
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		// default 생략 가능.
		}
	}

}
