package com.sist.music;
// 캡슐화 코딩
//	=> 캡술화, Overriding
public class Music {
	private String mno;
	private String title;
	private String singer;
	private String album;
	private String poster;
	
	// 변수의 읽기, 쓰기 기능을 구현
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
	

}
