package com.sist.group.manager;

import java.io.*;
import java.util.*;
import com.sist.group.vo.*;
public class MovieManager {

	private static Movie[] movies = new Movie[200];
	public MovieManager() {
			try {
			Reader fr = new FileReader("C:\\javaDev\\genie.txt");
			int i = 0; 
			StringBuffer sb = new StringBuffer();
			
			while ((i = fr.read()) != -1) {
				sb.append((char)i);
			}
	
			fr.close();
			
			String data = sb.toString();
			String[] temp = data.split("\n");
			i = 0;
			for (String s : temp) {
				String[] movie = s.split("\\|");													
				movies[i] = new Movie();
//				movies[i].setRank(movie[0]); 
				movies[i].setTitle(movie[1]);
				movies[i].setSinger(movie[2]);
		
				i++;
			}
		} catch(Exception ex) {}
		
	}
	public Movie[] getMovies() {
     return movies;
 }
		public Movie[] movieListData(int page) {
			int total = movieTotalPage();
			int leng = 50;
			
//			if (page == total)
//				leng = 18;
			Movie[] movie = new Movie[leng];
			
			int j = 0;
			int pagecnt = (50 * page) - 50;
			
			for (int i = 0; i < movies.length; i++) {
				if (j < 50 && i >= pagecnt) {
					movie[j] = new Movie();
					movie[j] = movies[i];
					j++;
				}
			}
			
			return movie;
			
		}
		public int movieTotalPage() {
			return (int)(Math.ceil(movies.length / 50.0));
		}
		// 상세 보기 할 때 리턴형을 잘 확인해야 함.
		public Movie movieDetailData(int mno) {
			return movies[mno - 1];
		}
		// 검색 기능을 추가
		public Movie[] movieFindData(String title) {
			int count = 0;
			
			for (Movie m :movies) {
				if (m.getTitle().contains(title)) {
					count++;
				}
			}
			// 선언시 => 개수 확인 후 => 데이터 값 채우기 => 동일하면 선언, 동일하지 않는 경우 가변형 => 배열
			// 동적 ==> 배열이기 때문에
			Movie[] movie = new Movie[count];
			int i = 0;
			for (Movie m : movies) {
				if (m.getTitle().contains(title)) {
					movie[i] = m;
					i++;
				}
			}
			
			return movie;
		}
		public static void main(String[] args) { 
			Scanner scan = new Scanner(System.in);
			MovieManager m = new MovieManager();

			System.out.print("제목 입력 : ");
			String title = scan.next();
			
			Movie[] movie = m.movieFindData(title);
			
			for (Movie mm : movie) {
				System.out.println(mm.getRank() + "." + mm.getTitle());
			}
			System.out.println("=========================");
			System.out.print("상세 보기 할 노래 순위 : ");
			int mno = scan.nextInt();
			
			Movie mmm = m.movieDetailData(mno);

			System.out.println("순위 : " + mmm.getRank());
			System.out.println("노래 제목 : " +mmm.getTitle());
			System.out.println("가수 명 : " + mmm.getSinger());

			
		}
	
}
