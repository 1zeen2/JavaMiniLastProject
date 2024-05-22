package com.sist.lang;
/*
 * 	String : 문자열 관리 => char[]을 제어
 * 			 => Overriding 불가능하다 (제공한 그대로 사용해야 한다)
 * 			 => 종단 클래스 (final 이 붙어있다) => 상속이 불가능한 클래스
 * 				----------------------------
 * 				Math, System, StringBuffer, Wrapper
 * 			 => 암기용
 * 
 * 	=>	String에 문자열을 저장하는 방법
 * 		일반 기본형처럼 사용
 * 		String s = "";	=> 일반 데이터형처럼 사용
 * 		객체 생성
 * 		String s = new String("");	=> 한글 코드 변환
 * 		*** 문자열은 자체가 메모리 주소
 * 			-------------------------
 * 			"Hello" => 메모리 주소 => {'H', 'e', ..}
 * 		String s1 = "Hello"
 * 		String s2 = "Hello"
 * 
 * 		s1 == s2 => 같다 ==> '=='는 메모리 주소 값을 비교할 때 사용한다.
 * 							 equals() : 실제 저장된 문자를 비교한다.
 * 	=> 기능 (메서드)
 * 		1.	public char charAt(int index) : 원하는 위치의 문자 한 개를 가지고 올 때 사용
 * 			문자열은 char[] => index 번호는 0번부터 시작.
 * 			"Hello Java"
 * 			 0123456789 => 0번부터 시작되는 index에 해당되는 문자
 * 			chatAt(6) ==> 'J'
 * 
 * 	*** 2. length() : 문자의 개수를 가지고 온다.
 * 			=> public int length()
 * 			=> "Hello Java"
 * 				0123456789	=> 길이 10 => 영문 / 한글 전부 글자 수로 인식 => 공백도 포함한다 (space 문자)
 * 		
 * 		3. toUpperCaese() / toLowerCase()
 * 			대문자 변환	 /	 소문자 변환
 * 			public String toUpperCase
 * 			public String toLowerCase
 * 	---------------------------------------------------
 * 	검색
 * 	*** 4. startsWith() : 시작 문자열이 같은 경우
 * 			public boolean stertsWith(String start)
 * 				=> 서제스트를 만드는 경우에 주로 사용된다.
 * 				   ------- 자동 완성기
 * 				=> cookie 저장 => cookie 읽기
 * 					=> 문자열만 저장이 가능하다.
 * 					=> 방문 맛집 / 레시피
 * 					   --------	 ------
 * 						food_  / recipe_
 * 
 * 
 * 	*** 5. endsWith()	: 끝나는 문자열이 같은 경우
 * 			public boolean endsWith(String end)
 * 				=> 확장자 찾기
 * 				=> 그림 파일 => gif, jpg, png, bmp, ...
 * 				=> A$(정규식) => %A (오라클)
 * 				=> img[src$ 'jpg | gif | png']
 * 
 * 	*** 6. contains()	: 해당 문자가 포함된 경우.
 * 			public boolean contains(String s)
 * 				=> 사이트에 나오는 모든 검색
 * 				=> [A](정규식), %A%(오라쿨)
 * 				=> img[src *= 'A']
 * 	
 * 	*** 7. equals() 	: 문자열이 같을 때
 * 			public boolean equals(String s)
 * 				=> 로그인, 아이디 찾기, 비밀번호 찾기에 주로 이용.
 * 				*** equalsIgnoreCase()
 * 				*** equals(), equalsIgnoreCase()
 * 					------	  ----------------
 * 					   |			  |=> 대소문자를 구분하지 않는다. (검색)
 * 					   |=> 대소문자를 구분한다 (로그인, 아이디 찾기, ...)
 * 
 * 	*** 8. indexOf()	: 앞에서부터 찾기(일반 문자열)
 * 			public int indexOf(찾는 문자, 찾는 문자열)
 * 
 * 	*** 9. lastIndexOf(): 뒤에서부터 찾기 (경로명, 확장자)
 * 			public int lastIndexOf(찾는 문자, 찾는 문자열)
 * 				
 * 	** 10. replace()	: 문자나 문자열을 변경할 때 사용한다.
 * 			public String replace(String s1, String s2)
 * 			public String replace(char c1, char c2)
 * 								  -------  -------- 변경할 문자
 * 									 |=> 변경해야 하는 대상
 * 				=> 크롤링 ==> 오라클에 저장할 때 자주 사용
 * 				   ----------------
 * 					=> ||, &, ...	==> 이미지가 있는 경우
 * 					   --  -
 * 					   |   |=> Scanner
 * 					   |=> 문자열 결합
 * 
 * 				=> Overloading 되어있다.
 * 			
 * 
 * 	** 11. replaceAll()	: 정규식 이용 => 빅데이터에서 많이 사용
 * 						  ------ 문자 형태
 * 			맛있다 맛있고 맛있는 ...을 찾는다면
 * 			맛있+으로 한번에 다 찾을 수 있다.
 * 			데이터
 * 		    ------
 * 				= 정형화된 데이터 => 프로그램에 필요한 데이터만 수집 (데이터베이스 안에 저장)
 * 				= 반정형화 데이터 => 구분만 되어있는 상태 ==> HTML / XML / JSON
 * 				= 비정형화 데이터 => 구분이 없는 데이터 (트위터, 페이스북)
 * 				  ------------- 정형화 시키고 => 통계, 분석을 하는 것 
 * 								 (빅데이터)			(머신러닝)
 * 			public String replaceAll(String regex, String 변경문자열)
 * 			
 * 			[ABCDEFG한글입니다]
 * 			[A-Z], ""	=> 알파벳 전체를 공백으로 변경 ==> [한글입니다]만 남는다.
 * 			[가-힣], ""	=> 한글 전체를 공백으로 변경 ==> [ABCDEFG]만 남는다.
 * 			[0-9], ""	=> 숫자를 전부 공백으로 변경.
 * 
 * 	** 12. subString()	: 문자열을 자르는 경우에 사용
 * 			public String substring(int start)
 * 				"Hello Java"
 * 					   ----
 * 				 0123456789	
 * 					   ---- 6 값을 주면 Java만 남는다.
 * 
 * 			public String substring(int start, int end)
 * 				"Hello Java"
 * 				 0123456789
 * 				   --- 2, 5 ==> end - 1 ===> to에 해당하는 값은 포함되지 않아서 234번째 자리의 문자만 남는다.
 * 				
 * 	** 13. valueOf()	: 모든 데이터 형을 문자열로 변환.
 * 			public static String valueOf(Object o)
 * 			   *** ------
 * 			public static String valueOf(int o)
 * 			public static String valueOf(double o)
 * 			public static String valueOf(float o)
 * 			public static String valueOf(boolean o)
 * 				=> String s = "Hello Java";
 * 					s.length()
 * 					s.substring()...
 * 					String.valueOf(10) => "10"
 * 				*** 웹은 모든 데이터가 String이기 때문에 중요하다.
 * 					입력창 : JTextField
 * 							 -----
 * 							<input type = text>
 * 							"10" => 변경이 가능하게 클래스를 지원한다 ==> Wrapper
 * 
 * 	** 14. split()		: 구분자 별로 문자열을 잘라서 배열에 저장.
 * 			public String[] split(String regex) => 정규식을 이용한다.
 * 
 * 	** 15. trim()		: 좌우의 공백을 제거.
 * 			public String trim()
 * 			--------------------------------------------------- 자바스크립트가 동일하다. (지금 배우는 메서드와)
 */
public class String_1 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		
		if (s1 == s2) {
			System.out.println("s1과 s2는 같다.");
		} else {
			System.out.println("s1과 s2는 다르다.");
		}
		
		if (s1 == s3) {
			System.out.println("s1과 s3는 같다.");
		} else {
			System.out.println("s1과 s3는 다르다.");
		}
		
		if (s1.equals(s3) == true) {
			System.out.println("s1과 s3는 같다.");
		} else {
			System.out.println("s1과 s3는 다르다.");
		}
		if (s1.equals(s2) == true) {
			System.out.println("s1과 s2는 같다.");
		} else {
			System.out.println("s1과 s2는 다르다.");
		}
	}

}
