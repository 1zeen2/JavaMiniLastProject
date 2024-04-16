import java.util.Scanner;
/*
 * 	c 			=> 	include
 * 	c#			=>	using
 * 	Python		=>	import
 * 	JavaScript	=>	import
 * 	기존에 만든 클래스를 불러온다. 라이브러리 읽기
 * 	같은 폴더에 있는 경우는 생략하며 다른 폴더에 있는 경우에만 사용한다.
 */
public class 연산자_입력값처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어, 영어, 수학 점수 입력을 받아서 총점, 평균을 출력.
		
		// 입력 값을 저장할 메모리 공간이 필요함
		int kor, eng, math, total;
		double avg;
		
		// 사용자로부터 입력값을 받아서 변수에 초기화
		// 키보드로부터 입력값 읽기
		Scanner scan = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하시오 : ");	// 국어, 영어, 수학 점수를 한번에 입력하는 방법
		//System.out.print("국어 점수");									// 국어 점수를 입력받는 방법
		kor = scan.nextInt();
		
		//System.out.print("영어 점수");									// 영어 점수를 입력받는 방법
		eng = scan.nextInt();
		
		//System.out.print("수학 점수");									// 수학 점수를 입력받는 방법
		math = scan.nextInt();
		
		// 사용자 요청 ==> 프로그램에서 요청 처리 결과를 보여준다 => 연산자
		total = kor + eng + math;
		avg = total / 3.0;
		
		System.out.println("====== 결과 ======");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
	}

}
