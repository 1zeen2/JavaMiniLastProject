//무한 루프
/*
 * 간단한 게임 : UpDown게임
 * => 1 ~ 100 사이의 난수를 발생 => 맞추는 프로그램
 * => 힌트가 있음 (up, down)
 * => 1~ 100 사이가 아닌 다른 수가 입력된 경우 => 제외를 하고 다시 입력 => continue
 * => 정답일 경우 => break (for문 중료)
 * => 반복제어문 : break, continue
 * 
 */
import java.util.Scanner;
public class 제어문_반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int count = 0;
	Scanner scan = new Scanner(System.in);
	int com = (int)(Math.random() * 100) +1;
	
	for (;;) {
		System.out.println("숫자를 입력하세요.");
		int user = scan.nextInt();
		
		if(user < 1 || user > 100) {
			System.out.println("입력 값에 오류가 있습니다.");
			continue;
		}
		count++;
		
		if (com > user) {
			System.out.println("입력값보다 큰 수를 입력하세요. ");
		} else if (com < user) {
			System.out.println("입력값보다 작은 수를 입력하세요. ");
		} else {
			System.out.println("정답입니다.");
			break;		// => for 종료 => 게임 종료 => System.exit(0);
		}
	}
	System.out.println(100 - (count * 5) + "점");
	
	

	}

}

/*						내가 생각한 작성하는 순서
 * 		
 * 		1. 입력을 할 수 있게끔 해주는 클래스 호출
 * 		2. 난수를 생성
 * 		3. 입력 값을 정수 형식으로 받음
 * 		4. 두 수를 비교.
 * 		5. 입력 값이 낮은 경우 up을, 높은 경우 down을, 같은 경우 break를 깨고 나오는 코드 작성
 * 		6. 1 ~ 100 사이가 아닌 경우 continue로 처음으로 돌아가게끔 하는 코드 작성
 * 
 */