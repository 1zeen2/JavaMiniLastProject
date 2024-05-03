/*
 * class ClassName
 * {
 * 	---------------------------
 * 		int a;	=> 전역 변수로 int a를 선언함으로서 리턴값과 매개 변수를 따로 지정하지 않아도 된다.
 * 
 * 		void display() {
 * 		-------------------
 * 			변수 선언 => 지역 변수 => 메서드가 종료하면 사라진다 => 사용하려면 리턴형을 이욯해야 한다.
 * 			int a = 100;
 * 		-------------------
 * 		}
 * 		
 * 		void print() {
 * 
 * 		}
 * 		-------------------
 * 	}
 */
import java.util.*;

class Sawon {
	
	String name;
	String dept;
	String loc;
	String job;
	int pay;
}
// 사원 등록
// 사원 목록
// 사원 상세 보기
public class 멤버변수_초기화_활용 {
	static void sawonInsert() {
		Sawon s = new Sawon();
		s.name = "홍길동";
		s.dept = "개발부";
		s.loc = "서울";
		s.job = "대리";
		s.pay = 3600;
	}
	
	static void sawonList() {
//		System.out.println("이름 : " + s.name);
	}

	public static void main(String[] args) {
		sawonInsert();
		sawonList();

	}

}
