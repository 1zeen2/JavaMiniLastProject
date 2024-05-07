/*
 * 	변수 => 초기화 (프로그램에 필요한 데이터 값을 저장)
 * 	 | 필요한 값을 지정
 * 	 ----------------------
 * 	 | 파일 읽기
 * 	 | 웹 읽기 (크롤링)
 * 	 | 입력값을 받아서 처리
 * 	 ---------------------- 선언(x), 구현(o) ==> 클래스 {} 안에서는 사용이 불가능
 * 							---------------
 * 							| 초기화 블럭 / 생성자
 * 
 * 	*** 모든 클래스에는 생성자가 반드시 1개 이상 존재해야 한다.
 * 		=> 생성자가 없는 경우에는 컴파일 시에 자동으로 1개 추가한다.
 * 
 * 	*** Java 프로그램에서 자동으로 추가되는 내용
 * 		1. import java.lang.*;
 * 				  -----------
 * 				  String, Math, System은 자동으로 import가 추가 되게끔 구현이 되어 있음.
 * 
 * 		2. extends Object : 모든 클래스는 Object 클래스를 상속받는다
 * 		3. 메서드 => void => return 생략
 * 		4. 모든 클래스의 생성자가 없는 경우에는 => 자동으로 추가된다.
 */
class Student {
	// 변수
	String name = "홍길동";
	int hakbun = 1;
	String school_name = "SIST";
	String subject = "컴퓨터";
	int year = 2;
	// {}를 사용하지 않았기 때문에 명시적인 초기화를 사용해야 한다. => 객체 생성 시에 모든 데이터 값이 동일하다.
	/*
	 * 	클래스 영역에 들어가면 자동으로 초기화가 된다.
	 */
	// 초기화
	// 메서드
	
}
public class 클래스_3 {
//	int a = 100;	==>  선언과 동시에 값을 부여하는 것은 가능하지만 선언과 초기화 따로 사용하는 것은 불가능하여 {}을 부여해야 한다.
	
	public static void main(String[] args) {
		// 1. 학생 생성
		// hong이라는 메모리 주소 안에 name, subject, year, hakbun, school_name이 있음. => .을 이욯아여 접근
		Student hong = new Student();
							// 생성자 => return 형이 없고, class 명과 동일하다. => 외부에서 데이터를 읽어서 변수에 대입한다
							// 사용자로부터 입력 값을 받아서 초기화
							// 시작과 동시에 연결 => 서버 구동, 화면 UI, 데이터베이스 연동
							// 생략이 가능하며 => 생략 시 자동으로 컴파일러가 1개 추가해준다.
		System.out.println("이름 : " + hong.name);
		System.out.println("학년 : " + hong.year);
		System.out.println("학과 : " + hong.subject);
		
		System.out.println();
		
		// 2. 학생 생성
		Student shim = new Student();
		// 변경하는 방법
		shim.name = "심청이";
		shim.year = 3;
		shim.subject = "자바";
		
		System.out.println("이름 : " + shim.name);
		System.out.println("학년 : " + shim.year);
		System.out.println("학과 : " + shim.subject);
		
		System.out.println();
				
		// 3. 학생 생성 => part => 박문수 => 1학년 => 파이썬
		
		Student park = new Student();
		
		park.name = "박문수";
		park.year = 1;
		park.subject = "자바";
		
		System.out.println("이름 : " + park.name);
		System.out.println("학년 : " + park.year);
		System.out.println("학과 : " + park.subject);
		
		
	}

}
