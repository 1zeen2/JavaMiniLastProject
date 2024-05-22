package com.sist.music;

import java.io.*;

public class MusicSystem {
	private static Music[] musics = new Music[200];
	
	static {
		FileReader fr = null;
		try {
			// CheckedException	=> 컴파일 시에 예외 감시
			// => 초기화 블럭은 throws 사용이 불가능하다.
			// 				   ------ Method에서만 가능.
			fr = new FileReader("C:\\JavaDev\\genie.txt");
			// "C:\JavaDev\genie.txt"
			int i;
			StringBuffer sb = new StringBuffer();
			// 데이터 문자열 결합이 많은 경우 => StringBuffer / StringBuilder
			//									 비동기식	 	 동기식
			//									ArrayList	/	Vector
//			String data = "";
			while ((i = fr.read()) != - 1) {
				sb.append((char)i);
//				data += (char)i;
			}
//			System.out.println(data);
			// System.out.println(sb.toString());
			String data = sb.toString();
			String[] temp = data.split("\n");
			i = 0;
			for (String s : temp) {
				String[] m = s.split("\\|");
				musics[i] = new Music();
				musics[i].setMno(Integer.parseInt(m[0]));
				musics[i].setTitle(m[1]);
				musics[i].setSinger(m[2]);
				musics[i].setAlbum(m[3]);
				musics[i].setPoster(m[4]);
				musics[i].setKey(m[5]);
				i++;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception ex) {}
		}
	}
	public int musicTotalPage() {
		return (int) (Math.ceil(musics.length / 20.0));
	}
	public Music[] musicListData() {
		return musics;
	}
	
	public Music musicDetailData(int mno) {
		Music m = new Music();
		for (Music mm : musics) {
			if (mm.getMno() == mno) {
				m = mm;
				break;
			}
		}
		return m;
	}
	public Music[] musicFindData(String fd) {
		int count = 0;
		
		for (Music m : musics) {
			if (m.getTitle().contains(fd)) {	// boolean 이기 때문에 if문 안에 사용이 가능하다.
				count++;
			}
		}
		Music[] mm = new Music[count];
		int i = 0;
		
		for (Music m : musics) {
			if (m.getTitle().contains(fd)) {
				mm[i] = m;
				i++;
			}
		}
		return mm;

	}
}
