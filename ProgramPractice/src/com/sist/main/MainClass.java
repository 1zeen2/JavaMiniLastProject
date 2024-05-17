package com.sist.main;

// 클래스, 사용. 추상 클래스가 가능하다면 사용하려고 함.
// 난수 발생 => 한, 중, 일, 양식 선택 => 그 중에서 메뉴 랜덤 추출하여 출력하는 프로그램 구현 예정

public class MainClass {

	public static void main(String[] args) {
		KoreanFood koreanFoodn = new KoreanFood();
		koreanFoodn.printRandomMenu();
	}
}
