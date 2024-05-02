/*
 * 	클래스
 * 		= 사용자 정의 데이터 형 : 데이터만 모아서 관리
 * 							 ----- 다른 데이터르 모아서 관리
 * 		= 액션 클래스 : 메서드를 여러 개 모아서 관리
 * 
 * 	** 클래스는 한 개에 대한 정보
 * 	class 사원
 * 	{
 * 		이름
 * 		부서
 * 		근무지
 * 		입사일
 * 		직위
 * 		연봉
 * 		성과급
 * 		....
 * 	}
 * 
 * 	class 학생
 * 	{
 * 		이름
 * 		학년	int
 * 		학점 char
 * 		주소 String ...
 * 		전화
 * 		나이
 * 		..
 * 	}
 */
// 데이터 형
// 개발자마자 다르다 => 특정한 양식으로 고정되어있지 않고 => 프로그램에 맞게 개발.
class student { // ==> student 클래스는 데이터로 변경되었다. 형 변환이 필요하다.
	String name;
	int age;
	String school_name;
}
class student1 {
//	String par = new student(); {
//		static = on
//	}
}

// => 저장
public class 클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student hong = new student();
		student shim = new student();
		student park = new student();
		
	}

}
  