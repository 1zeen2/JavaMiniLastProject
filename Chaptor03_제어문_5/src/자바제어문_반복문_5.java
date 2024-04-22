/*
 * A ~ Z 사이에서 사용자가 입력한 알파벳이 몇 번째에 있는지 확인
 */
import java.util.Scanner;
public class 자바제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("알파벳을 입력하시오 : ");
		char ch = scan.next().charAt(0);
		
		int i = 1;	// 위치 확인ㅠ
		
		for (char c = 'A'; c <= 'Z'; c++) {
			if(ch == c)
				break;	// 종료 ==> i 변수를 이용해서 ~번째 확인 => index
			i++;
		}
		System.out.println(ch + "는(은) " + i + "번째 있습니다.");	// 소문자도 같이 되게끔 해보기
	}

}
//	입력한 알파벳이 몇번째에 해당하는 알파벳인지 확인 후 그만돌아야돼
