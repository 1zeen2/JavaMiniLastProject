package com.sist.music;

import java.io.*;

public class GenieMusic extends MusicSystem {

	@Override
	public void init() {
		try {
			FileReader fr = new FileReader("c:\\javaDev\\genie.txt");
			StringBuffer sb = new StringBuffer();	// 문자열을 누적하기 위한 StringBuffer 생성.
			int i = 0;
			while ((i = fr.read()) != -1) {			// EOF
				sb.append((char) i);				// 읽어들인 문자를 StringBuffer에 누적
			}
			fr.close();
			// buffer => 임시 기억 장소 => 누적
			String data = sb.toString();			// StringBuffer에 저장된 문자를 문자열로 변환
			// String 은 문자에 제한이 없다.
			String[] mdata = data.split("\n");		// 개행 문자를 기준으로 배열에 저장
			i = 0;
			for (String s : mdata) {				// 배열에 저장된 문자열을 Music 객체 배열에 저장.
//				System.out.println(s);
				if (i > 50) break;
				musics[i] = new Music();			// Music 객체 생성 후 배열에 저장
				String[] temp = s.split("\\|");	
				/*
				 * | 가 나올 때 마다 잘라준다. => |는 이미 사용 중에 있기 때문에 \\를 두 개 씩 주어야 한다
				 * => 정규식 ==> ^, $, ., ?, |, +, * ===> 기호 자체를 가지고 올 때
				 */
				musics[i].setMno(temp[0]);
				musics[i].setTitle(temp[1]);
				musics[i].setSinger(temp[2]);
				musics[i].setAlbum(temp[3]);
				musics[i].setPoster(temp[4]);
				i++;
			}
		} catch (Exception ex) {}
		
	}

}
