
import java.util.*;
public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] books = {
			"자바와 오라클"	,
			"자바로 시작하는 오라클"	,
			"자바와 JSP"	,
			"자바와 Ajax",	
			"자바와 JQuery",
			"혼자 배우는 자바",	
			"자바 프로그래밍",
			"오라클 AND 자바",
			"최신 자바",
		}; 
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어 입력 : ");
		String fd = scan.next();
		
		for (String book : books) {
			//if (book.startsWith(fd)) {		//  시작 문자열이 같은 경우 ==> 자동완성 기능 만들 때 사용. 
			//if (book.endsWith(fd))			//	끝 문자열이 같은 경우
			if (book.startsWith(fd) || book.endsWith(fd))  {	//	==> contains	
				System.out.println(book);	
				try {
					Thread.sleep(1000);
				} catch (Exception ex) {
				}
			}
		}
	}
}
