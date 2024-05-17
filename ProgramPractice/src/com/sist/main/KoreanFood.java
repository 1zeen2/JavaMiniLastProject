package com.sist.main;

public class KoreanFood {
	private String[] menu = {"왕돈까스", "닭갈비 덮밥", "짜장 덮밥", "서교 알밥", "규동", "가츠동", "쫄면", "떡만두국", "육개 순두부", "카레 덮밥", 
							"불고기 덮밥", "제육 덮밥", "돈까스 마요", "꼬막 비빔밥","치킨 마요", "육회 비빔밥", "육개장", "돈밥"};
	public void printRandomMenu() {
		int i = (int)(Math.random() * menu.length);
		
			System.out.println(menu[i]);
	}
}
