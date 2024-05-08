package com.sist.vo;

import lombok.*;
@Data
public class Movie {
	//	private => Movie 클래스의 블럭 안에서만 사용이 가능하다.
   private int rank;
   private String title;
   private String actor;
   private String director;
   private String grade;
   private String genre;
   private String regdate;
   public Movie() {
       
    }
/*
 *   실제 데이터값은 은닉화
 *   ------------ 읽기 / 변경 => 메소드를 이용해서 변수의 값을 직접 가지고 오는 것이 아닌 인덱스를 통해 주소 값으로 접근이 가능하게 만든다 : 캡슐화
 *   		변수에 대한 기능을 부여한다 ===> 변수를 public 으로 공개하지 않고 getter, setter 를 사용.
 */
    
   public static void main(String[] args) {

   }
}