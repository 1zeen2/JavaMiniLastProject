// 초기화 블럭 => 자동 호출 클래스 블럭 안에 {} 를 사용.
import java.util.*;

class Sawon {
	int sabun;
	String name;
	String dept;
	String job;
	String loc;
	int pay;
	
	
	// 초기화 ==> 파일 읽기, 라이브러리, 데이터베이스 연결 => {}를 통해 구현
	{
/*
		sabun = 1;
		name = "홍길동";
		dept = "개발부";
		job = "대리";
		loc = "서울";
		pay = 3600;
*/
		for (int i = 0; i < 10; i ++) {
			sabun = 1;
		}
	}
	//생성자를 만듦
	/*
	 * 	=> 멤버 변수의 초기화를 담당한다.
	 * 	=> 메모리에 저장시에 호출되는 메서드
	 * 	=> 모든 클래스에 1개 이상 존재한다.
	 * 		=> 없는 경우 컴파일시 자동으로 추가된다.
	 * 	=> 리턴 형이 없다.
	 * 	=> 클래스 명과 동일하다.
	 * 	=> 생성자는 한 개가 아닌 여러 개 일 수 있다
	 */
	
	// 생성자가 아니라 일반 메서드이다. ==> 리턴 형이 메서드로 존재하기 때문.
	void Sawon() {
	}
	
	// 생성자. ==> 생성자는 반드시 new 생성자() 형식을 지켜주어야 한다.
	/*
	 * 기본 초기 값 => 명시적 초기화 = 초기화 블럭 = 생성자
	 * 									  | static{} 도 많이 사용함.
	 * 				  ---------------------------------- 3가지 중에 하나 사용하면 되는데, 대부분 생성자를 많이 사용한다.
	 * class A {
	 * 	int a = 10;
	 * 	{
	 * 		a = 100;
	 * 	}
	 * 
	 *	 A() {
	 * 		a = 200;
	 * 	}
	 * }
	 * 
	 * 	A aa = new A();
	 * 
	 * 	------ aa ------
	 * 	 	  0x100			
	 * 	----------------	0x100
	 * 							------------
	 * 							  ---a---
	 * 							  0 => 10 => 100 => 200
	 * 							  -------
	 * 							------------
	 * 	관련된 데이터가 여러 개 저장시에는 => 메모리 주소를 이용하여 접근한다. => 참조변수
	 * 																		 --------
	 * 																		배열 / 클래스
	 * 	일반 1개의 변수만 이용
	 * 	
	 * 	** 객체 지향 프로그램은 
	 * 		여러 개의 데이터 + 여러 개의 메서드를 한 곳에 저장한 후에 동시에 제어한다.
	 * 		-------------------------------- 저장 공간을 객체라고 한다.
	 * 													---- 한 번에 기능을 만들어서 사용.	
	 * 													1. 재사용이 용이하다.
	 * 													   ------ ***
	 * 													2. 수정, 추가가 편리하다
	 * 													3. 데이터를 보호
	 * 		1970's
	 * 		SW			HW 	=>	SW언어 / HW 언어
	 * 							-----
	 * 						  고급 언어
	 * 	C언어 : 절차적 언어		직접 회로 : 필요시마다 재사용을 가능하게 만든다.
	 * 			=> 재사용이 안됨.
	 * 			=> 편집기 => 한 번 사용하면 저장이 안됨
	 * 
	 * 		1980's
	 * 	C++ : 객체 지향 프로그램 => 직접 회로를 이용 => 저장 후에 다시 사용이 가능하게 만든다
	 * 												  ----------------------------------
	 * 	 
	 * 														
	 * 
	 * 
	 */
	Sawon() {
		Scanner scan = new Scanner(System.in);		// 구현부 이기 때문에 선언부로 들어가게 되면 기능을 하지 못한다.
		System.out.print("사번을 입력하세요 : ");
		sabun = scan.nextInt();
		
		System.out.println("이름 입력 : ");
		name = scan.next();
		
		System.out.println("부서 입력 : ");
		dept = scan.next();
		
	}
}
public class 클래스_4 {

	public static void main(String[] args) {
		Sawon hong = new Sawon(); // 저장하는 과정 => 메모리 공간이 생김 ==> 변수들의 공간이 생김(sabun, name, dept, job, loc, pay)
		System.out.println("사번 : " + hong.sabun);
		System.out.println("이름 : " + hong.name);
		System.out.println("부서 : " + hong.dept);
		System.out.println("직급 : " + hong.job);
		System.out.println("지역 : " + hong.loc);
		System.out.println("급여 : " + hong.pay);
		
		// Sawon() <==== 에러
		// new Sawon();	<=== 반드시 new를 붙여주어야 한다.

	}

}
