/*
 * 	단일 조건문
 * 	-------- 단점
 * 	if(조건) {
 * 	}
 * 	--------
 * 	if(조건) {
 * 	}
 * 	-------- 독립 문장 이기 때문에 속도가 느리다.(전부 하나씩 실행해야 하기 때문에) 
 * 	
 * 	선택 조건문 => true / false => 나눠서 처리
 * 		if(조건문) {
 * 			true
 * 		}
 * 		else {
 * 			false
 * 		}
 * 
 * 	**	if
 * 		=>	정상 수행
 * 		else
 * 		=>	오류	=>	입력 문제
 * 		-------------------
 * 		오류 발생
 * 		1)	프로그래머의 실수 => 오류 해결이 어려움	=> 예외 처리
 * 		2)	사용자 입력이 잘못된 경우	=> if ~ else
 * 
 * 
 */
// 1 ~ 100 사이의 난수 하나를 뽑아 짝수인지 홀수인지 if, if else로 구분하여 출력.
public class 제어문_조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random() * 100) + 1;
		System.out.println("num = " + num);
		if (num %2 == 0) {
			System.out.println(num + "는(은) 짝수 입니다.");
		}
		else {
			System.out.println(num + "는(은) 홀수 입니다.");
		}
	}

}
