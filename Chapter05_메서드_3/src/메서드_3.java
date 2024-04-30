// 사용자가 년 우러 일을 전송하면 출력하는 메서드 구현
// 받아서 출력할 것인가. 메서드에서 출력할 것인가 결정해야 함

	import java.util.Scanner;
	
	public class 메서드_3 {
		// 리턴 형이 없는 방식
		static void print(int year, int month, int day) {	// 옵션 지정자, 리턴 타입, 메서드 명
			System.out.println(year + "년 " + month + "월 " + day + "일");
			
		}
		// 반복 제거
		static int input(String msg) {				//	옵션 지정자, 리턴 타입, 파라미터
			Scanner scan = new Scanner(System.in);	//	입력값을 받기 위한 라이브러리
			System.out.println(msg + " 입력 : ");		//	입력값을 받기 위한 입력 창
			return scan.nextInt();					//  받은 입력 값 저장.
		}
		public static void main(String[] args) {
			int year = input("년");
			int month = input("월");
			int day = input("일");
			print(year, month, day);
	
		}
	
	}
