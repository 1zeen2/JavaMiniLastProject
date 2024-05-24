package com.sist.util;

import java.util.*;

public class 컬렉션_4 {

   public static void main(String[] args) {
      ArrayList<String> names1 = new ArrayList<String>();
      
      names1.add("홍길동");
      names1.add("박문수");
      names1.add("이순신");
      names1.add("강감찬");
      names1.add("심청이");
      
      System.out.println("==== names1 출력====");
      
      for (String name : names1) {
    	  System.out.println(name);
      }
      ArrayList<String> names2 = new ArrayList<String>();
      
      names2.add("홍길수");
      names2.add("박문수");
      names2.add("이순신");
      names2.add("강감찬");
      names2.add("심청이");
      
      System.out.println("==== names2 출력====");
      
      for (String name : names2) {
    	  System.out.println(name);
      }
      
      System.out.println("========데이터 복사=========");
      
      ArrayList<String> temp = new ArrayList<String>();
      
      temp.addAll(names1);
      
      for (String name : temp) {
    	  System.out.println(name);
       }
      
      System.out.println("======== 교집함=========");	// 오라클 => INTERSECT => JOIN(INNER JOIN)
      
      temp.retainAll(names2);
      
      for (String name : temp) {
    	  System.out.println(name);
       }
      
      System.out.println("=========차집합=============");	// 오라클 => MINUS => OUTER JOIN(LEFT, RIGHT)
      ArrayList<String> temp2 = new ArrayList<String>();
      temp2.addAll(names1);
      temp2.removeAll(names2);
      
      for (String name : temp2) {
    	  System.out.println(name);
       }
      
      ArrayList<String> names3 = new ArrayList<String>(names1.subList(0, 3));
      
      System.out.println("=========부분적 복사=============");
      
      for (String name : names3) {
    	  System.out.println(name);
       }
   }

}