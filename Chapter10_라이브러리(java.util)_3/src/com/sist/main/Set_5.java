package com.sist.main;
import java.util.*;

import javax.lang.model.element.Element;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.Jsoup;

public class Set_5 {
	public Set<String> genieData() {
		Set<String> genie = new HashSet<String>();
		
		try {
			Document doc = Jsoup.connect("Https://www.genie.co.kr/chart/top200").get();
			// 문서 저장 => HTML 문서를 저장합니다.
			// 태그의 값을 가져오는 것 = element
			Elements title = doc.select("table.list-wrap a.title");
			for (int i = 0; i < title.size(); i++) {
				genie.add(title.get(i).text());
			}
			
		} catch(Exception ex) {}
		return genie;
	}
	
	public Set<String> melonData() {
		
		Set<String> melon = new HashSet<String>();
		
		try {
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			// 문서 저장 => HTML 문서를 저장합니다.
			// 태그의 값을 가져오는 것 = element
			Elements title = doc.select("div.wrap_song_info div.rank01 a");
			for (int i = 0; i < title.size(); i++) {
				melon.add(title.get(i).text());
			}
			
		} catch(Exception ex) {}
		
		return melon;
	}
}
