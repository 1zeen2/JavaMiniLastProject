// 리턴형 (O), 매개 변수 (O)
import java.util.Scanner;

public class 메서드_2 {
	static boolean isLogin(String id, String pwd ) {
		// 매개 변수는 여러 개 사용이 가능, 리턴형은 1개만 사용이 가능
		// 매개 변수가 많은 경우 = 클래스, 배열을 이용 = 3개 이상 하는 경우가 많음.
		final String ID = "admin";
		final String PWD = "1234";
		
		/*
		 * 메서드 안에 선언되는 변수, 상수는 메서드 안에서만 사용이 가능하다
		 * ------------------------ 매개 변수도 메서드 안에서만 사용이 가능
		 */
		boolean bCheck = false;
		if (id.equals(ID) && pwd.equals(PWD)) {
			bCheck = true;
		} else {
			bCheck = false;
		}
		return bCheck; // 사용자 요청에 대한 결과 값
		// 리턴에 사용하는 데이터형과 실제 전송하는 값이 일치하거나 선언 값보다 작아야 한다.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("아이디 입력");
		String id = scan.next();
		System.out.println("비밀 번호 입력");
		String pwd = scan.next();
		// 기능 요청
		// 메서드에서 넘겨주는 결과 값을 받는다
		boolean bCheck = isLogin(id, pwd);
		// 숫자인 경우에는 큰 데이터 형으로 받을 수 있다.
		// int(리턴 형) => long, double
		// 기능 처리     => 윈도우나 브라우저에 출력
		
		if (bCheck) {
			System.out.println(id + "님 로그인 되었습니다.");
		} else {
			System.out.println("아이디나 비밀번호가 다릅니다.");
		}

	}

}
