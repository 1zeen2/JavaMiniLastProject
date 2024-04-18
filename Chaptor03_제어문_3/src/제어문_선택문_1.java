/*
 * 자바가 제공하는 제어문 : 필요한 내용만 출력, 반복 수행, 반복 제어
 * 					  --------------  ------  -------
 * 												|종료, 제외
 * 												break continue
 * 										|for, while, do ~ while
 * 						|조건문, 선택문 (다중 조건문과 동일)
 * -----------------연산자 + 제어문 = 메소드
 * 	1) 조건문 : 사용 빈도가 가장 많다
 * 		=> 단일 조건문 : 검색 => 검색어 입력 여부 확인, 상세 보기			
 * 					  형식)
 * 						if (조건문) {					====>	부정연산자 (!)
 * 							true => 수행 / false => 스킵		비교연산자 (==, !=, <. >, <=, >=)		
 * 						}									논리연산자 (&&, ||)
 * 		=> 선택 조건문 : true / false를 나눠서 처리.
 * 			=> 로그인(로그인 된 경우 / 안된 경우)		아이디(쭝복이 된 경우 / 안된 경우)
 * 						true		false				true		false
 * 				if (조건문) {
 * 					true	==> 메인 화면으로 이동
 * 				}
 * 				else {
 * 					false	==> ID, PWD 오류 메시지 전송
 * 				}
 * 		
 * 		=> 다중 조건문 : 여러개의 조건 중 하나만 수행
 * 					 => 메뉴 클릭, 키보드(키값), =>게임
 * 						------------ 웹 => 화면 변경, 종료, 새로 고침
 * 				if (조건) {
 * 					true ==> 수행	 후 종료	/	false ==> 다음으로 이동
 *				}
 *				else if (조건) {
 *					true ==> 수행	 후 종료	/	false ==> 다음으로 이동
 *				}
 *				else if (조건) {
 *				}	
 *					... 
 *				else {
 *					생략 가능
 *				}
 *
 *		=> 선택문 : 다중 조건문을 단순화					=> 웹에서는 거의 사용 안한
 *			=> 한 개의 값이 있는 경우 => 선택문			=> 화면 이동(JSP) = Spring
 *			=> 범위가 있는경우 = 다중조건문				=> Front(Router)
 *			score >= 90 && score <= 100 =====> 10	=> 간결하며 게임에서 키보드 같은 경우에 사용한다.
 *			score = 90, 91, 92 ...
 *
 *			*** 웹에서 자주 사용	=> if	/	if ~ else	/	for	/	while
 *				=> 데이터베이스에서 값을 가져올 때 사용 : SQL(80%)
 *				=> HTML / CSS / JavaScript == 화면 UI =>vue, Re
 *						  | (데이터 처리 *요청 처리)
 *							java
 *						  |
 *							Oracle	: 데이터를 저장하는 공간 (영구적)
 *							--------------------------	AWS (PaaS)	=> Linux
 *	형식)
 *		switch (정수, 문자, 문자열) { => 문자
 *			case '+' : 문자 중에 +가 들어온 경우
 *			처리 문장
 *				break; 	=> 처리 후에 종료
 *			case '-' : 문자 중에 -가 들어온 경우
 *				break; = 처리 후에 종료
 *			....
 *			default		=> case에 없는 데이터가 있는 경우 => 다중 조건문 else
 *				처리 문장
 *		}
 *			
 *		=> 같은 처리		100/10 ==> 10 9 8 7 ...
 *		switch (정수) {
 *			case 10 :
 *				A
 *				break;
 *			case 9 :			======> 잘못된 예시
 *				A
 *				break;
 *		}
 *		switch (정수) {
 *			case 10
 *			case 9				======> 올바른 예시 
 *				A						break 가 없는 경우도 있으며 break가 없는 경우 아래에 있는 break까지 수행
 *				break;
 *		}
 *
 * 
 */
import java.util.Scanner;
public class 제어문_선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 정수 입력 : ");
		int num1 = scan.nextInt();
		System.out.println("연산자 입력(+. -. *. /)");
		char op = scan.next().charAt(0);
		System.out.println("두 번째 정수 입력 : ");
		int num2 = scan.nextInt();
		/*
		 * 	문자		==> ''
		 * 	문자열	==> ""
		 */
		switch (op)
		{
		case '+':
			// 처리 문장
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			// case 한 개 수행 => break를 사용
			break;
			
		case '-':
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
			
		case '*':
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
			
		case '/':
			if (num2 == 0)
				System.out.println("0으로 나눌 수 없다.");
			else
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			break;
		//	연산자가 잘못된 경우 => default는 생략이 가능하다
		default :
			System.out.println("잘못된 연산입니다.");
			//	마지막에는 break를 사용할 수도, 하지 않을 수도 있다.
			// *** case에 등록된 값이 중복되면 오류.
			// *** case에 들어가는 데이터형은 통일되어야 한다.ㅌ
		}
	}

}
