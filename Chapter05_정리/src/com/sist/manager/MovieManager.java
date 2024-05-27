package com.sist.manager;
// 사용자의 요청이 있을 경우 처리하는 부분
/*
 *	모든 데이터를 관리하는 부분.
 *
 *	1. 데이터 읽기 => 시작과 동시에 자동 초기화를 할 것인지.
 *				  => 생성자를 사용할 것인지 결정해야 한다.
 *
 *	2. 요청에 대한 처리 => 메서드
 *		=> 전체 목록 (페이지 나누기)
 *		=> 검색 결과 출력
 *		=> 상세 보기
 *	---------------------------------------- 이번에는 윈도우에서 처리하는 방식으로 진행.
 *	3. 패키지 => 관련된 클래스끼리 모아서 관리한다.
 *		=> 접근 지정어 => 패키지가 다르기 때문에 전부 public 으로 사용할 예정.
 */
import java.io.*;
import java.util.*;
import com.sist.vo.*; // Movie 클래스를 가져올 수 있게 함
public class MovieManager {
	// Movie에 있는 모든 데이터를 읽어서 저장 => 변수 => 모든 User 가 공통된 데이터를 사용한다.
	private static Movie[] movies = new Movie[1938];	// Movie 클래스의 객체를 담을 배열을 생성합니다. 
														// 배열의 크기는 1938로 정의되었으며, private로 선언된 정적 클래스형 배열입니다.
	/*
	 * 	변수 => 기본형 / 배열 / 클래스
	 * 	Movie : 사용자 정의 데이터 형 클래스 => 배열, 형 변환도 가능하다.
	 * 
	 * 	초기화 하는 방법
	 * 	1. static{}을 사용한다.
	 * 	2. 생성자를 사용한다.		====>  생성자를 공부중이므로 이 방식을 사용.
	 */
	// 초기화 => 생성자 => UserMain에서 사용해야 한다.
	public MovieManager() {
		// 파일에서 데이터를 읽어서 저장한다. ==> 예외 처리 ==> 컬렉션 // 까지 되면 웬만한 프로그램을 짤 수 있지만, 지금은 도스창을 통해서 구현.
		
		try {
			/*	정상수행 => 명령문
			 *	=> 예외 처리는 모든 문장에 있다 => 생략 가능하기 때문에 생략을 해왔었음.
			 *	=> 파일 입출력 / 네트워크 / 데이터 베이스 ==> 이 3가지는 꼭 예외 처리를 해주어야 한다.
			 */
			FileReader fr = new FileReader("C:\\javaDev\\movie.txt");
			int i = 0; // fr.read() => 리턴 형이 정수형이다. (문자의 번호를 읽어온다) 읽어올 때는 int,저장할 때는 char로 저장해야 함.
			StringBuffer sb = new StringBuffer(); // 읽어서 데이터를 누적해 실행 속도를 향상시킨다.
			
			while ((i = fr.read()) != -1) {	// EOF
				sb.append((char)i);
			}
			// 반드시 파일을 닫아주어야 한다.
			fr.close();
			
			String data = sb.toString(); // 전체 데이터를 모아준다.
			String[] temp = data.split("\n");
			i = 0;
			for (String s : temp) {
				String[] movie = s.split("\\|");						
				// split, replaceAll => ?, ., +, *, | => 기호 자체를 이용할 때는 => \\. << 을 이용해야 한다. => \\를 사용하지 않으면 연산자로 인식(처리)가 된다.
				//						------------- 	  (등의 정규식 기호)
				movies[i] = new Movie();
				movies[i].setRank(movie[0]);
				// 변수에 값을 세팅 ==> setter
				movies[i].setTitle(movie[1]);
				movies[i].setGenre(movie[2]);
				movies[i].setPoster(movie[3]);
				movies[i].setActor(movie[4]);
				movies[i].setRegdate(movie[5]);
				movies[i].setGrade(movie[6]);
				movies[i].setDirector(movie[7]);
		
				i++;
			}
		} catch(Exception ex) {}
		
	}
/*
		public static void main(String[] args) {
			MovieManager m = new MovieManager();
			for (Movie movie : m.movies) {
				System.out.println(movie.getRank() + "." + movie.getTitle());
			}
		}
*/
	public Movie[] getMovies() {
        return movies;
    }
		public Movie[] movieListData(int page) {
			int total = movieTotalPage();
			int leng = 20;
			
			if (page == total)
				leng = 18;
			Movie[] movie = new Movie[leng];
			
			int j = 0;
			int pagecnt = (20 * page) - 20;
			
			/*
			 * 1page =>  0 ~ 19
			 * 2page => 20 ~ 39
			 * 	...
			 */
			
			for (int i = 0; i < movies.length; i++) {
				if (j < 20 && i >= pagecnt) {
					movie[j] = new Movie();
					movie[j] = movies[i];
					j++;
				}
			}
			
			return movie;
			
		}
		public int movieTotalPage() {
			return (int)(Math.ceil(movies.length / 20.0));
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
/*	
 * 		int total = m.movieTotalPage();
			
			System.out.println("1 ~" + total + "사이의 페이지를 입력 : ");
			int page = scan.nextInt();
			
			Movie[] movie = m.movieListData(page);
			
			for (Movie mm : movie) {
				System.out.println(mm.getRank() + "." + mm.getTitle());

			}
*/
			System.out.print("검색어 입력 : ");
			String title = scan.next();
			
			Movie[] movie = m.movieFindData(title);
			
			for (Movie mm : movie) {
				System.out.println(mm.getRank() + "." + mm.getTitle());
			}
			System.out.println("=========================");
			System.out.print("상세 보기 할 영화 번호 : ");
			int mno = scan.nextInt();
			
			Movie mmm = m.movieDetailData(mno);
			// 메서드 (요청 처리 => 기능)
			// 처리 기능 / 데이터만 있는 클래스(데이터형)
			// 파일 / 오라클 => 데이터만 있는 클래스에 값을 채워서 전송
			System.out.println("순위 : " + mmm.getRank());
			System.out.println("영화 명 : " +mmm.getTitle());
			System.out.println("감독 : " + mmm.getDirector());
			System.out.println("출연 : " + mmm.getActor());
			System.out.println("출연 : " + mmm.getGenre());
			System.out.println("등급 : " + mmm.getGrade());
			System.out.println("감독 : " + mmm.getDirector());
			
		}

	
}
