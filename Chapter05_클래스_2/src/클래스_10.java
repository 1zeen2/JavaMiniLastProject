/*
 * 	static / instance 변수의 차이점
 * 	------	 --------
 * 	  |			| new를 사용할 때 마다
 * 	  | 메모리 공간 1개를 생성하고 => 모든 객체가 공유한다
 */
class Member {
	String name;
	String address;
	
}
class MemberSystem {
	// 같은 배열을 공유하기 위해 static 사용
	// 데이터가 공통으로 사용이 될 때 => 크롤링, 파일 읽은 데이터 => 오라쿨에 저장되는 데이터는 static
	static Member[] members = new Member[3];		//	배열은 객체 생성하는 부분이 아니라 저장할 공간만 만들어준다.
	// Member[] memebers = new Member[3] ==> null, null, null ==> 크기만 정하고 주소를 할당하지 않았기 때문에.
	/*
	 * 각각 저장하는 변수 => 
	 */
	static int index = 0;
}
public class 클래스_10 {

	public static void main(String[] args) {
		MemberSystem ms1 = new MemberSystem();
		ms1.members[ms1.index] = new Member();	// 크기를 만들어준다.
		ms1.members[ms1.index].name = "홍길동";
		ms1.members[ms1.index].address = "서울";
		ms1.index++;
		
		ms1.members[ms1.index] = new Member();
		ms1.members[ms1.index].name = "심청이";
		ms1.members[ms1.index].address = "경기";
		ms1.index++;
		
		ms1.members[ms1.index] = new Member();
		ms1.members[ms1.index].name = "박문수";
		ms1.members[ms1.index].address = "인천";
		
		for (Member m : ms1.members) {
			System.out.println(m.name + ", " + m.address);
		}
		
		MemberSystem ms2 = new MemberSystem();
		 
		for (Member m : ms2.members) {
			System.out.println(m.name + ", " + m.address);
		}
	}

}
