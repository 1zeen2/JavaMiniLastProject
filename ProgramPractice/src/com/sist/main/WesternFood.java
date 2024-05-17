package com.sist.main;

// 난수를 통해 해당되는 메뉴 출력
// 메뉴는 햄버거 피자.
// 변수는 숨겨준다.
public class WesternFood {
	private String ofood[] = new String[2];

	
	public void food( ) {
		int m = (int)(Math.random() * ofood.length) + 1;
	}

}
