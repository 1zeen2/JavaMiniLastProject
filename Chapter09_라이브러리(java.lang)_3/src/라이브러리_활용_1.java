/*
 * 	Object : 객체와 관련된 메서드를 가지고 있다.
 * 	생성 = 소멸, 객체 비교, 객체 복제 => 새롭게 생성 ...
 * 	Object는 모든 객체의 기능을 가지고 있다 => 모든 클래스에 상속을 내려서 사용
 * 
 * 		=> 소멸자	: finalizeZ()
 * 		=> 복제		: clone()
 * 		=> toString()	=> 거의 모든 프로그램의 오버라이딩 (상속을 받아서 기능 변경)
 * 		   -------- 라이브러리는 Overriding이 되어있다.
 * 		=> 모든 클래스는 extends Object
 * 		=> 모든 데이터형, 클래스는 Object로 묶어서 사용할 수 있다.
 * 		   ----------------------------------------------------
 * 			=> 항상 형변환을 시켜주어야 한다는 단점이 있다.
 * 			=> 상속을 내리면 
 * 				=> 상속을 받은 클래스의 추가적인 변수 / 메서드에는 접근이 불가능하다.
 * 				
 */
class Sawon { // extends Object
	String name;
	int sabun;
	
	public Sawon(String name, int sabun ) {
		this.name = name;
		this.sabun = sabun;
		
	}
	public String toString(String name, int sabun) {
		return "이름 : " + name +", 사번 : " + sabun;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
}
class Member {
	int mno;
	String name;
	
	public Member(int mno, String name) {
		this.mno = mno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "회원번호 : " + mno + ", 회원 이름 " + name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class 라이브러리_활용_1 {

	public static void main(String[] args) {
		Object obj2 = new Sawon("홍길동", 1);
		System.out.println(obj2.toString());
	/*	Sawon s = (Sawon) obj;
		
		s.sabun = 1;
		s.name = "채제원";
		s.print();
		*/
		
		Object obj = new Member(2, "심청이");
		System.out.println(obj.toString());
	}

}
