/*
 * 1|
 * 쇼생크 탈출|
 * 드라마|
 * https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 * 팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
 * 2016 .02.24 재개봉, 1995 .01.28 개봉|
 * 15세 관람가|
 * 프랭크 다라본트
 */
import java.util.*;
import java.io.*;	//	파일 입출력을 가능하게 하는 기능 => 데이터 읽기 => 메모리에 저장

// 사용자 정의 데이터 형을 만들고 시작해야 한다 => 한 개에 대한 영화 정보 => 응용
// ---------------- 배열 혹은 클래스
class Movie {
	String mno;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String director;

}
public class 멤버변수_초기화 {
	Movie[] movies = new Movie[1938];	//	선언만 하는 영역
	// 초기화를 하고 사용해야 한다						||
	// 파일 읽기 => 구현부라 작업이 불가능 => 블록을 새로 열어야 한다.
	{
		try {
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			// 파일 읽기 => 반드시 예외 처리를 진행해주어야 한다. (URL)
			StringBuffer sb = new StringBuffer();
			// 문자열을 임시로 저장해주는 기능 => 버퍼링을 줄여 실행 속도를 향상시켜준다.
			
			int i = 0; // 파일의 글자 읽기 => ASCII => 정수형으로 변경해주어야 한다
			String m = " ";
			while((i = fr.read()) != -1) {	// -1 ==> EOF 
				sb.append((char)i);
			//	m += (char)i;
			}
			fr.close();
			// System.out.println(m);
			String temp = sb.toString();
			// String 메서드 활용
			String[] movie = temp.split("\n");
			
			int j = 0;
			
			for (String mm : movie) {
				movies[j] = new Movie();	// 클래스 초기화를 하여 => 저장할 공간을 확보한다.
											// 클래스 초기화가 빠지면 오류가 나므로 꼭 해주어야 한다.
				String[] data = mm.split("\\|");
				movies[j].mno = data[0];
				movies[j].title = data[1];
				movies[j].genre = data[2];
				movies[j].poster = data[3];
				movies[j].actor = data[4];
				movies[j].regdate = data[5];
				movies[j].grade = data[6];
				movies[j].director = data[7];
				j++;
				
			}
			
		} catch (Exception ex) {}
	}
	// 목록을 출력하는 메서드 생성
	public static void main(String[] args) {
		멤버변수_초기화 m = new 멤버변수_초기화();
		Scanner scan = new Scanner(System.in);
		System.out.println("============ 영화 목록 ==============");
		
		for (Movie movie : m.movies) {	//	클래스 변수 . <<을 꼭 찍어줘야 출력이 가능하다
			System.out.println(movie.mno + "." + movie.title);
		}
		System.out.println("------------------검색---------------------");
		String actor = scan.next();
		System.out.println("영화명 입력 : ");
		
		int count = 0;
		
		for (Movie movie : m.movies) {
			if (movie.title.contains(actor)) {
				System.out.println(movie.title + "(" + movie.actor + ")");
				count++;
			}
		}
		System.out.println("출연한 영화는 총 " + count + "건 입니다.");
		System.out.println("============================= 영화 명 검색==================");
		String movieName = scan.next();
		System.out.println("영화 제목 검색 : ");
		
		int count1 = 0;
		
		for (Movie movie : m.movies) {
			if (movie.title.contains(movieName)) {
				System.out.println(movie.title + "(" + movieName + ")");   
				count1++;
			}
	      }
	      System.out.println("출연한 영화 총"+count+ "건입니다");
	      
	      System.out.println("===== 시청 연령 검색 =====");
	      System.out.print("나이 입력 : ");
	      String grade=scan.next();
	      count=0;
	      for(Movie movie:m.movies) {
	         if(movie.grade.contains(grade)) {
	            System.out.println(movie.title+"("+movie.grade+")");
	            count++;
	            
	         }
	      }
	      System.out.println("===== 장르 검색 =====");
	      System.out.print("장르 입력 : ");
	      String genre=scan.next();
	      count=0;
	      for(Movie movie:m.movies) {
	         if(movie.genre.contains(genre)) {
	            System.out.println(movie.title+"("+movie.genre+")");
	            count++;
	            
	         }
	      }
	      System.out.println("===== TOP 10 =====");
	      for(int i=0; i<10; i++) {
	         System.out.println(m.movies[i].mno+"."+m.movies[i].title);
	      }
		System.out.print("1 ~ 1938번 사이의 정수를 입력 : ");
		int no = scan.nextInt();
		Movie mm = m.movies[no-1];
		System.out.println("순위 : " + mm.mno);
		System.out.println("영화명 : " + mm.title);
		System.out.println("출연 : " + mm.actor);
		System.out.println("이미지 : " + mm.poster);
		System.out.println("장르 : " + mm.genre);
		System.out.println("등급 : " + mm.grade);
		System.out.println("감독 : " + mm.director);
	}

}
