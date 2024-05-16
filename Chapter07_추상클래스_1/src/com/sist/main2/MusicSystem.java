package com.sist.main2;
/*
 * 	Movie => CGV / MegaBox / 롯시
 * 			 --------------------
 * 			 목록 / 상세 / 검색 / 예약
 * 
 * 	Music => Genie / Melon
 * 	----- 뮤직 만들 때 => 상속
 * 			 목록 / 상세 / 겸색
 */
public abstract class MusicSystem {
	public static Music[] musics = new Music[50];
	// 데이터 초기화
	public abstract void init(); 
	// 설계가 되어 있다.
	public abstract	void find(String title);
	public abstract void list();
	public abstract void detail(int mno);
	
}
