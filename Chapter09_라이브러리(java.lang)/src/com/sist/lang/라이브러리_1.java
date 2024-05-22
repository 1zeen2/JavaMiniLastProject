package com.sist.lang;
/*
 * 	라이브러리 => 자바에서 지원하는 클래스
 * 					=> J2SE		/	 J2EE
 * 						|=> 기본		  |=> 웹에서 사용하는 라이브러리 => servlet-api => JSP
 * 					외부에서 지원하는 클래스 => Jsoup / SimpleJSON / CSV / Spring
 * 
 * => java.lang => import 생략이 가능하다.
 * 		= Object
 * 		= String
 * 		= Math
 * 		= System
 * 		= StringBuffer
 * 		= Wrapper : 데이터 형을 클래스화 해서 사용이 쉽게 해준다.
 * 			= Integer
 * 			  ------- ***
 * 			= Double
 * 			  ------- ***
 * 			= Boolean
 * 			  ------- **
 * 			= Float
 * 			= Byte
 * 	
 * => java.util => 필수적으로 import 사용해야 한다.
 * 		= Scanner
 * 		= Calendar / Date	
 * 					 ---- ***
 * 		= StringTokenizer	
 * 		  --------------- ***
 * 		= Collection
 * 			= List	:	ArraryList, LinkedList, Vector
 * 						----------- ***
 * 			= Set	:	HashSet, TableSet
 * 						-------- ***
 * 			= Map	:	Hashtable, HashMap
 * 								   ------- ***
 * 
 * => java.io => 입출력 관련 기능
 * 				 FileInputStream / FileOutputStream
 * 				 ---------------------------------- ***  
 * 				 FileReader	/ FileWriter
 * 				 ------------------------ ***
 * 				 InputStream / OutputStream
 * 				 ---------------------------------------------
 * 				 BufferedReader	/ BufferedWriter
 * 				 --------------- ***
 * 				 BufferedInputStream / BufferedOutputStream
 * 
 * => java.net => URLEncoder / URLDecoder
 * 				  ---------- ***
 * 				  Socket / ServerSocket
 * 				  URL
 * 
 * => java.sql => 오라클 연동 관련
 * 		-------------
 * 		= Connection |
 * 		  -----------|	  ************
 * 		= Statement  |=>  *매우 중요함*
 * 		  -----------|	  ************
 * 		= ResultSet  |	
 *        -----------
 *	-----------------------------------------------------------------------------
 *	=> 2차 자바 (웹) => HttpServletRequest / HttpServletResponse / HttpSession / Cookie
 *					   -------------------	-------------------	  -----------	-------
 *								|					|					|			|=> 클라이언트 브라우저에 저장할 때 사용
 *								|					|					|=> 서버에 정보를 저장할 때 사용
 *								|					|=> 자바에서 브라우저로 결과 값 전송할 때 사용 
 *								|=> 브라우저에서 전송한 값을 자바에서 받을 때 사용
 *
 * 	기본 문법 ~ 예외 처리까지 그대로 적용.
 * 	-------- + 라이브러리 + 사용자 클래스 => 프로그램이 제작
 * 			   ------------------------
 * 				=> 문법과 어휘
 * 				=> 숙어, 문장 ==> 라이브러리 (자바를 사용해서 프로그램을 만들 수 있게 미리 제작한 클래스의 집합)
 * 				   --------- 회화												  -----------------------
 * 																					API (Application Program Interface)
 * 	=> 	java.lang / java.util / java.io / java.sql
 * 			|		------------------------------
 * 			|			=> 사용하기 위해서는 반드시 import 를 사용하여 클래스를 읽어야 한다
 * 			|=> import 생략 가능
 * 
 * 	=> java.lang
 * 		1. Object
 * 			1) 모든 클래스의 상속을 내리는 최상위 클래스 => (extends Object) 가 생략되어있다.
 * 
 * 			2) Object 가 가지고 있는 기능 (제공된 메서드)
 * 				= toString() => 객체를 문자열로 변환 => String
 * 					원형) public String toString()
 * 						=> 문자열 변환 => (String), toString(), valueOf()
 * 
 * 				= clone() => 메모리를 복제 (새로운 메모리를 생성)
 * 									 ----
 * 						 		  => 참조 : 공동으로 사용
 * 						  => 메모리 주소 이용 (배열, 클래스)
 * 				= finalize() : 소멸자 => 메모리에서 해제 => 자동으로 호출
 * 				= 객체 비교 : equals();
 * 				= -------- hashCode ****
 * 
 * 
 * 		class A {
 * 			int a;
 * 			int b;
 * 		}
 * 		
 * 		A aa = new A();
 * 		A cc = new A(); ==> cc.a = 0, cc.b = 0 ===> 아직 값이 참조되기 전이라 초기값인 0이 복사됨
 * 		aa.a = 100;
 * 		aa.a = 200;
 * 		
 * 		A bb = aa.clone(); => bb.a = 100, bb.b = 200
 * 
 * 
 * 
 */
import java.util.*;

public class 라이브러리_1 {
	
	public 라이브러리_1() {
		
	}
	public static void main(String[] args) {
//		int[] arr = {10, 20, 30};
//		int[] temp = arr; // 참조 ==> 같은 주소를 제어하고 있기 때문에 temp 값이 바뀌면 arr 값도 바뀐다.
//						  // 얕은 복사
//		
//			System.out.print("arr = ");
//			System.out.println(Arrays.toString(arr));
//			
//			System.out.print("temp = ");
//			System.out.println(Arrays.toString(temp));
//			
//			temp[0] = 100;
//			temp[1] = 200;
//			temp[2] = 300;
//			System.out.println("======== temp 값 변경 ==========");
//			
//			System.out.print("arr = ");
//			System.out.println(Arrays.toString(arr));
//			
//			System.out.print("temp = ");
//			System.out.println(Arrays.toString(temp));
//			// 같은 메모리 공간을 제어 => 참조
//			// 메서드를 통해서 데이터를 변경할 때 ==> Call By Reference (메모리 주소에 의한 참조)
		int[] arr = {10, 20, 30};
		int[] temp = arr.clone();
		
		System.out.print("arr = ");
		System.out.println(Arrays.toString(arr));
		
		System.out.print("temp = ");
		System.out.println(Arrays.toString(temp));
		
		System.out.println("=======temp 값 변경 ========");
		
		temp[0] = 100;
		temp[1] = 200;
		temp[2] = 300;
		
		System.out.print("arr = ");
		System.out.println(Arrays.toString(arr));
		
		System.out.print("temp = ");
		System.out.println(Arrays.toString(temp));
		
			
	}

}

