/*
 *	소스가 많은 경우 => 나열하지 않고 => 기능 별로 묶어서 분리
 *	문장 => 단락을 나눠서 처리한다
 *	---------------------------------------------
 *	오류 발생 시 => 해당 메서드만 찾으면 돼서 찾기가 편하다 => 수정하기 편리하다
 *	----------------------------------------------------------- 이를 구조적인 프로그램 이라고 함.
 *	메서드
 *		= 재사용 => 다른 클래스와 연결하여 사용
 *		  ----	1. 신뢰성이 뛰어나다. (이미 사용 중에 있고 검증이 된 상태기 때문에)		
 *		  ---- 	2. 소스 량을 줄일 수 있다.
 *		  ----	3. 개발 속도가 빨라진다. (코드 조립 후 => 약간의 수정만 거치면 됨)
 *		  ----	
 *
 *		= 반복 제거
 *			같은 내용 소스 코딩을 줄임 = 한 개로 통합하여 처리
 *			수정하기 편리하다
 *			== 개발 / 유지 보수
 *			   SI	   SM
 *			=> 개발하는데 1년이 걸린다면 유지 보수에는 10 ~ 15년 정도 걸린다.
 *			
 *
 */

// 국, 영, 수, 물, 국, 화 점수를 입력받아 출력하라.
import java.util.*;

public class 메서드_구조적프로그램 {

	static int input(String msg) {				// 옵션 지정자, 리턴 타입, 메서드 명, 파라미터
		Scanner scan = new Scanner(System.in);
		System.out.print(msg + "입력 : ");
		return scan.nextInt();
	}
	public static void main(String[] args) {
		int k = input("국어");					// 리턴 타입, 변수 명, 메서드명, (입력값..?)
		int e = input("영어");
		int m = input("수학");
/*		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 입력");
		int kor = scan.nextInt();
		
		System.out.println("영어 입력");
		int eng = scan.nextInt();
		
		System.out.println("수학 입력");
		int math = scan.nextInt();
		
		System.out.println("물리 입력");
		int p = scan.nextInt();
		
		System.out.println("국사 입력");
		int h = scan.nextInt();
		
		System.out.println("화학 입력");
		int m = scan.nextInt();
*/
		

	}

}
