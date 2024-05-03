/*
 * 파일 한 개에 클래스가 여러 개 있는 경우
 * 	=> public class 한 번만 사용
 * 	   ----------- => public은 한 번만 사용할 수 있고 public class 이름이 저장 명이 되어야 한다
 * 
 *	예)
 *		class A
 *		class B
 *		public class C => C.java
 *		----------- 파일 명 == 클래스 명
 *
 *		class A
 *		class B
 *		------- A.java, B.java
 *		=> 가급적이면 main이 있는 클래스 명
 *	
 *		=> 따라서 컴파일이 된다
 *		class A
 *		class B
 *		-------- A.class, B.class ==> 같은 폴더에서는 같은 이름의 클래스 명을 사용할 수 없다.
 *
 */


import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;

class Music
{
   String rank;
   String title;
   String singer;
   String album;
   String poster;
}

class MelonMusic{
	static Music[] musics = new Music[100];
	  {
	      try {
	         int k = 1;
	         for (int i = 50; i <= 100; i+= 50)
	         {
	            Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get(); // 소스를 싹 긁어와라
	            Elements title = doc.select("tr.lst" + i + "div.wrap div.rank01 a");
	            Elements singer = doc.select("tr.lst" + i + "div.wrap div.rank02 a");
	            Elements album = doc.select("tr.lst" + i + "div.wrap div.rank03 a");
	            Elements poster = doc.select("div.wrap a.image_typeAll img");
	            for (int j = 0; j < title.size(); j++) {
	               System.out.println("순위 : " + (k));
	               System.out.println("노래명 : " + title.get(j).text());
	               System.out.println("가수명 : " + singer.get(j).text());
	               System.out.println("앨범 : " + album.get(j).text());         // <> 사이에 들어가면 
	               System.out.println("이미지 : " + poster.get(j).attr("src"));  // >< 사이에 들어가면 attr
//	               System.out.println("동영상 키 : "+youtubeData(title.get(j).text()));
	               System.out.println("======================================");
	               FileWriter fw =
	            		   new FileWriter("c:\\javaDev\\melon.txt", true);
	               String data = (j+1)	+ "|" 
	            		   				+ title.get(j).text() + "|"
	            		   				+ singer.get(j).text() + "|"
	            		   				+ album.get(j).text() + "|"
	            		   				+ poster.get(j).text() + "|"
//	            		   				+ youtubeData(title.get(j).text())
	            		   				+ "\r\n";
	               fw.write(data);
	               fw.close();
	               k++;
	            }
	         }     
	    	  FileReader fr = new FileReader("c:\\javaDev\\melon.txt");
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
	    		  String[] ss = s.split("\\|");
	    		  musics[i] = new Music();
	    		  musics[i].rank = ss[0];
	    		  musics[i].title = ss[1];
	    		  musics[i].singer = ss[2];
	    		  musics[i].album = ss[3];
	    		  musics[i].poster = ss[4];
	    		  
	    		  i++;
	    	  }
	      } catch (Exception ex) {}
	   }
}
public class MusicMain {

	public static void main(String[] args) {
	

	}

}
