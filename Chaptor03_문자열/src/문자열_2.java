/*
 * 특정 문자가 몇 개 사용되었는지 개수를 세는 프로그램.
 * showInputDiaLog를 사용하기 위해 javax.swing.*;를 사용
 * 
 * 개수를 세기 위한 int형 변수 count 선언
 * 
 * i가 입력 값의 개수보다 커질 때 까지 for문을 돌리기 위해 i = 0; i < length(); i++ 을 사용 ==> 문자 개수만큼 for문을 돌려 문자의 개수 확인.
 * 
 * a나 A가 들어가면 개수를 올리기 위해
 * 
 * alpha.charAt(i)를 이용해 문자를 char c에 담고, 'A' or 'a'인 경우 count++ 사용
 * 
 */
import javax.swing.*;

public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String alpha = JOptionPane.showInputDialog("알파벳 입력");	//	문자를 입력받는 경우
		
		int count = 0;
		
		for (int i = 0; i < alpha.length(); i++) {					// length() : 문자 개수
			char c = alpha.charAt(i);								// 문자 1개씩 추출
				
			if (c == 'A' || c == 'a') {
				count++;
			}
		}
//		System.out.println(alpha + "에서 A나 a는 총" + count + "개 사용되었습니다.");
		JOptionPane.showMessageDialog(null, alpha + "에서 A, a는 총" + count +"개");		//결과 값 출력
		
	}

}
