/*
 * 	컴퓨터 / 사용자	 => 가위바위보
 * 	----	---
 *   난수		입력
 *   
 *   => 0은 가위, 1은 바위, 2는 보자기로 임의 설정.
 *   
 */
import java.util.Scanner;
public class 제어문_단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 난수를 생성하여 값을 생성한다.					(Math.random())
		 * 
		 * 2. 값을 출력하지 않은 상태로 유저에게 입력을 요청한다.	import java.util.Scanner
		 * 												.nextInt()
		 * 3. 입력한 값에 따라 결과를 나타낸다.					
		 */
		int com = (int)(Math.random() * 3);	// 0, 1, 2 중 하나 난수 출력.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2)");
		int user = scan.nextInt();
				
		if(user == 0) {
			System.out.println("User : 가위");
		}
		if(user == 1) {
			System.out.println("User : 바위");
		}
		if(user == 2) {
			System.out.println("User : 보");
		}
		
		if(com == 0) {
			System.out.println("컴퓨터 : 가위");
		}
		if(com == 1) {
			System.out.println("컴퓨터 : 바위");
		}
		if(com == 2) {
			System.out.println("컴퓨터 : 보");
		}
		System.out.println("====== 게임 결과 ======");
		int result = com - user;
		if(result == -2 || result == 1)
			System.out.println("컴퓨터 Win !!");
		if(result == -1 || result == 2)
			System.out.println("플레이어 Win !!");
		if(result == 0)
			System.out.println("무승부 입니다.");
/*		
 * 		연산 결과 값에 따라 게임 결과를 출력하는 알고리즘
 * 
		if(com == 0 && user == 0)				==> 0 - 0 = 0
			System.out.println("비겼습니다.");
		if(com == 0 && user == 1)				==> 0 - 1 = -1
			System.out.println("이겼습니다.");			
		if(com == 0 && user == 2)				==> 0 - 2 = -2
			System.out.println("졌습니다.");
		
		if(com == 1 && user == 0)				==> 1 - 0 = 0
			System.out.println("졌습니다.");			
		if(com == 1 && user == 1)				==> 1 - 1 = 0
			System.out.println("비겼습니다.");			
		if(com == 1 && user == 2)				==> 1 - 2 = -1
			System.out.println("이겼습니다.");	
		
		if(com == 2 && user == 0)				==> 2 - 0 = 0
			System.out.println("이겼습니다.");			
		if(com == 2 && user == 1)				==> 2 - 1 = 1
			System.out.println("졌습니다.");			
		if(com == 2 && user == 2)				==> 2 - 2 = 0
			System.out.println("이겼습니다.");	
*/		
	}

}
