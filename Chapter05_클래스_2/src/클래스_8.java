/*
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

class Recipe2 {
	String title;
	String chef;
	String hit;
}
class RecipeSystem {
	Recipe2[] recipes = new Recipe2[40]; {	// 선언만 가능 => 외부에서 읽기(X) => 구현
		// 초기화 블럭 => 생성자 => 외부에서 데이터를 얻어올 때 / 파일에서 데이터를 얻어올 때
		// 배열에 데이터 초기화
		// class => selector => CSS 구분 (태그 / class / id) 디자인
		try {
			Document doc = Jsoup.connect("https://www.10000recipe.com/recipe/list.html").get();	// doc 안에  모든 데이터가 저장된다.
			// System.out.println(doc.toString());	// 문자열로 doc를 읽어들여옴.
			Elements title = doc.select("ul.common_sp_list_ul li.common_sp_list_li div.common_sp_caption_tit");
			// Element => 태그 <div> => 태그 여러 개를 가져오는 것 => Elements
			Elements chef = doc.select("ul.common_sp_list_ul li.common_sp_list_li div.common_sp_caption_rv_name");		//	() 안에 있는 값을 가져온다.
			Elements hit = doc.select("ul.common_sp_list_ul li.common_sp_list_li span.common_sp_caption_buyer");
			
			for (int i = 0; i < title.size(); i++) {
				// size = length
				recipes[i] = new Recipe2();
				recipes[i].title = title.get(i).text();
				recipes[i].chef = chef.get(i).text();
				recipes[i].hit = hit.get(i).text();
			}
			// Document ==> 문서 저장 클래스 => HTML을 저장
		} catch (Exception ex) {}	// 네트워크, 서버 연결, 파일 읽기 => 반드시 예외 처리.
		// 네트워크 (URL) => 웹서버 연결 후 저장된 데이터 가지고 오기 => 웹 크롤링
		// 초기화 블럭은 JVM에 의해 자동으로 호출
	}
}

public class 클래스_8 {

	public static void main(String[] args) {
		RecipeSystem rs = new RecipeSystem();
		int i = 1;
		for (Recipe2 r : rs.recipes) {
			System.out.println("레시피 번호 : " + i);
			System.out.println("레시피 명 : " + r.title);
			System.out.println("셰프 명 : " + r.chef);
			System.out.println(r.hit);
			System.out.println("============================");
			i++;
		}

	}

}
