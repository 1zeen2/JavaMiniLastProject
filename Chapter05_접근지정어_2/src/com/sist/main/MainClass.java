package com.sist.main;
//  Movie 를 불러온다
import com.sist.vo.Movie;
//     클래스가 다른 폴더에 저장된 경우는 반드시 import 를 이용해서 불러온다
//          	--------- 자바에서는 패키지라고 함.
/*
 *    private / public
 *    
 *    변수 => private => 데이터 공개 (x)
 *        => 접근이 가능하게 만든다 --> getXxx(), setXxx()
 *    메소드 / 클래스 / 생성자 => 다른 클래스에 연결해줄 수 있어야 하기 때문에 -> public
 *    
 */
public class MainClass {

   public static void main(String[] args) {
//      메모리에 저장
      Movie movie = new Movie();
      movie.setRank(1);
      System.out.println("순위 : " + movie.getRank());
   }

}