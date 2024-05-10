package com.sist.group.user;
/*
 * 2|
 * SPOT! (Feat. JENNIE)|
 * 지코 (ZICO)|
 * SPOT!|
 * xfqBQ2XhBCg
 * 
 */

import java.util.*;
import com.sist.group.manager.*;
import com.sist.group.vo.*;
public class UserMain {

   public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      MovieManager mgr=new MovieManager(); 

      while(true) {
         System.out.println("========== 메 뉴 ==========");
         System.out.println("1. 목록 보기");
         System.out.println("2. 제목으로 검색");
         System.out.println("3. 순위 검색");
         System.out.println("4. 종료");
         System.out.println("==========================");
         System.out.print("메뉴 선택:");
         int menu=scan.nextInt();
         if(menu==1) {     
            int total=mgr.movieTotalPage();
            System.out.println("1~"+total+"사이의 페이지 입력:");
            int page=scan.nextInt();

            Movie [] movie=mgr.movieListData(page);
            for(Movie m:movie) {
               System.out.println(m.getRank()+"."+m.getTitle());
            }
         }
         else if(menu==2) {
            System.out.println("검색어 입력 (대소문자 구분) :");
            String title=scan.next();
            Movie[] movie=mgr.movieFindData(title);
            for(Movie m:movie) {
               System.out.println(m.getRank()+"."+m.getTitle());
            }
         }
         else if(menu==3) {
            System.out.println("순위 검색 :");
            int mno=scan.nextInt();
            Movie mmm = mgr.movieDetailData(mno);

			System.out.println("순위 : " + mmm.getRank());
			System.out.println("노래 제목 : " +mmm.getTitle());
			System.out.println("가수 명 : " + mmm.getSinger());
         }
         else if(menu==4) {
            System.out.println("프로그램 종료");
            break;
         }
         else {
            System.out.println("없는 메뉴 입니다");
         }
      }
   }

}