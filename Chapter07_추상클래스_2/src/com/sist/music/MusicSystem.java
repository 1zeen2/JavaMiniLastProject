package com.sist.music;

// 음악 시스템 추상 클래스 정의
public abstract class MusicSystem {
	// 음악 데이터 배열 정의 (최대 50개)
	public static Music[] musics = new Music[50];
	
	// 데이터 초기화를 위한 추상 메서드 선언.
	public abstract void init();	
	// 읽어오는 파일 명이 다르기 때문에 선언만 해두고
	// 실제 데이터 초기화는 하위 클래스에서 구현해야 한다.
	
	// 움악 목록 출력 메서드
	public void list() {
		System.out.println("======= 목록 출력 ========");
		int i = 1;
		for (Music m : musics) {
			System.out.println(i + "." + m.getTitle()); // 각 음악의 제목 출력
			i++;
		}
	}
	
	// 음악 상세 정보 출력 메서드
	public void detial(int mno) {
		System.out.println("============= 상세 보기 ==============");
		Music m = musics[mno - 1];	// 배열 인덱스는 0부터 시작하므로 입력된 번호에서 - 1
		System.out.println("제목 : " + m.getTitle());	// 제목 출력
		System.out.println("가수명 : " + m.getSinger());	// 가수 명 출력
		System.out.println("앨범 : " + m.getAlbum());	// 앨범 출력
		
	}
	
	// 음악 검색 메서드
	public void find(String title) {
		System.out.println("=================== 검색 ======================");
		for (Music m : musics) {
			if (m.getTitle().contains(title)) {		// 제목에 입력한 문자열이 포함된 음악이 있는지 검사
				System.out.println(m.getTitle());	// 검색 된 음악의 제목 출력
			
			}
		}
	}
	

}
