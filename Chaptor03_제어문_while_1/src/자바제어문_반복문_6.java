/*
 * 	while문
 * 		반복문 => 반복 횟수가 지정이 안 된 경우 주로 사용
 * 		형식)
 * 			초기 값 ----------------1
 * 			while(조건문) {
 * 				반복 수행 문장 -----------2
 * 				증감식 -----------------3
 * 			}
 * 			무한루프
 */
import java.util.Scanner;
public class 자바제어문_반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while (true) {		// 반드시 종료하는 프로그램을 제작해야 한다. ==> break 위치를 고려해야 함
			System.out.println("====== 메뉴 ======");
			System.out.println("1. 뮤직 목록");
			System.out.println("2. 뮤직 검색 (제목)");
			System.out.println("3. 뮤직 목록 (가수)");
			System.out.println("4. 뮤직 보기");
			System.out.println("9. 프로그램 종료");
			System.out.println("=================");
			System.out.printf("메뉴 선택 : ");
			int menu = scan.nextInt();
			
			//switch => 다중 조건문
/*			if (menu == 1) {
				System.out.println("뮤직 전체 목록을 요청하셨습니다.");
			} else if (menu == 2) {
				System.out.println("노래 명으로 검색합니다.");
			} else if (menu == 3) {
				System.out.println("가수 명으로 검색합니다.");
			} else if (menu == 4) {
				System.out.println("동영상을 요청하셨습니다.");
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
			} else {	
				System.out.println("잘못 입력하셨습니다.");
				// while을 종료한다
				break;
				
				   //break	 => 반복문을 종료 (중단)
				   //continue => 조건식으로 이동 => 처음부터 실행할 때 사용 
			
*/
			switch(menu) {
			case 1:
				System.out.println("뮤직 전체 목록을 요청하셨습니다.");
				break;
			case 2:
				System.out.println("노래 명으로 검색합니다.");
				break;
			case 3:
				System.out.println("가수 명으로 검색합니다.");
				break;
			case 4:
				System.out.println("동영상을 요청하셨습니다.");
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}

		}
	}

}
