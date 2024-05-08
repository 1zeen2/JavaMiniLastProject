package com.sist.vo;

import lombok.Data;

@Data
public class Movie {
	//	접근 지정어 => default => 같은 패키지 안에서만 접근이 가능하다.
	private int mno;
	private String title;
	private String genre;
	private String poster;
	private String actor;
	private String regdate;
	private String grade;
	private String directore;
	// Movie 클래스에서만 사용이 가능하다. => 다른 클래스 안에서는 사용이 불가능하다
	// 사용이 가능하게 만들기 위해 => 기능을 추가 (변수 : 저장 / 값 읽기) => getter	/ setter
}
