package com.sist.main;
/*
 * 	ArrayList / HashSet	/ HashMap
 * 	---------	------	  -------
 * 		|		   |		 |=> 두가지 동시에 저장 (id : admin), (pwd:1234) 같은 경우
 * 		|		   |=> Set는 중복 제거를 함.
 * 		|=> List는 중복 제거를 하지 않음
 * 
 * 	=>	자료 구조 : 데이터 저장, 데이터 수정, 데이터 추가, 데이터 삭제, 데이터 검색
 * 				  -------	--------  --------	--------- ---------
 * 								|					|		  |
 * 								-------------------------------
 * 												|
 * 										데이터를 찾을 수 있는 구분자
 * 					=> ArrayList : 인덱스 번호가 구분자이다. ==> 그래서 중복이 있음.
 * 					=> Set		 : 데이터 자체가 구분자이다. ==> 그래서 중복이 없음.
 * 					=> Map		 : Key(중복 없음), Value(중복 있음)
 * 				  -----------------------------------------------------------
 * 					배열 보완 => 고정적인걸 ==> 가변적으로 바꿈
 * 							  ------------------------ 삭제, 추가가 불가능하다.
 * 				  -----------------------------------------------------------
 * 					=> 자바 : 컬렉션 (여러 개 수집 => 관리)
 * 
 * 						Collection
 * 							|
 * 		-----------------------------------------
 * 		|					|					|
 * 	   List			 	   Set				   Map
 * 		|				    |					|
 * 	ArrayList			 HashSet			 HashMap
 * 	LinkedList			 TreeSet			 HashTable
 * 	Vector	
 * 
 * 		=>	개발자 선호에 따라 각각 사용하는게 다름
 * 			-----------------------------
 * 			ArrayList<String> list = new ArrayList<String>() ===> 비권장.
 * 			List <String> list = new ArrayList<String>() 	 ===> 권장 ====> 상위 클래스로 접근하는 것을 권장한다.
 * 			List <String> list = new Vector<String>() 	 
 * 			List <String> list = new LinkedList<String>() 	 ===> 각각 가지고 있는 메서드 들이 달라 상위 클래스로 접근하여 편하게 수정할 수 있게 함.
 * 
 * 			Set<String> list = new HashSet<String>()	==> Set의 경우에도 코드 수정이 용이하게 Set으로 접근.
 * 			Set<String> list = new TreeSet<String>()
 * 
 */
import java.util.*;

public class Set_6 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("홍길동");
		list.add("박문수");
		list.add("이순신");
		list.add("강감찬");
		list.add("채제원");
		
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			System.out.println(name);
			
		}
	}

}
