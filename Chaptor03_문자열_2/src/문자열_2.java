//	contains

/*
 *  JDBC => DBCP => MyBatis => (JPA)
 *  						   -------------------------------- ===> 요즘 기술 // 3천 후반을 노리려고 한다면 JPA / React -Query, Next는 공부를 해야 함
 *  Ajax => Vue	 => React   => Redux => React - Query => Next (넉스트??)
 *   1차		2차		 3차 ================================ 4차
 *  									----------------------- ===> 요즘 기술
 *  MSA
 *  
 *  => JDBC, Ajax => 2000년대 초반 기술이라 큰 매리트가 없을 것으로 예상.
 *  
 */
// https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg=2
import java.util.Scanner;

import javax.swing.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 문자열_2 {

	public static void main(String[] args) throws Exception {
		// Jsoup 셀레니즘
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 제목으로 검색, 2. 가수명으로 검색");
		
		int menu = scan.nextInt();
		
		int k = 1;
		
		if (menu == 1) {
			System.out.println("제목 검색");
			String fd = scan.next();
			
			for (int i  = 1; i <= 4; i++) {
				
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg=" + i).get();
				Elements title = doc.select("table.list-wrap a.title");
				Elements singer = doc.select("table.list-wrap a.artist");
				
				for (int j = 0; j < title.size(); j++) {
					if (title.get(j).text().contains(fd)) {
						System.out.println(k + "." + title .get(j).text()
								+ "(" + singer.get(j).text() + ")"
								);
						k++;
					}
				}
			}
		} else if (menu == 2) {
			System.out.println("가수 검색");
			String fd = scan.next();
			
			for (int i  = 1; i <= 4; i++) {
				
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg=" + i).get();
				Elements title = doc.select("table.list-wrap a.title");
				Elements singer = doc.select("table.list-wrap a.artist");
				
				for (int j = 0; j < title.size(); j++) {
					if (singer.get(j).text().contains(fd)) {
						System.out.println(k + "." + title .get(j).text()
								+ "(" + singer.get(j).text() + ")"
								);
						k++;
					}
				}
			}
		}
	}
}
