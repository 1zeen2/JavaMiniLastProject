package com.sist.main;
/*
 * 서교밥상 메뉴를 골라주는 프로그램을 작성합니다.
 *   왕돈까스      카레 덮밥
 *   닭갈비 덮밥    불고기 덮밥
 *   짜장 덮밥      제육 덮밥
 *   서교 알밥     돈까스 마요
 *   규동         꼬막비빔밥 
 *   가츠동        치킨마요
 *   쫄면          육회비빔밥
 *   떡만두국       육개장
 *   육개순두부       돈밥
 */
// 메뉴가 전부 문자열이니 문자열 배열을 통해 난수 발생, 해당 인덱스에 참조되어있는 문자열 출력.
import java.util.Random;

class Menu {
	
    // 메뉴 리스트를 문자열 배열로 선언 및 초기화합니다.
    private String[] menuList = {
        "왕돈까스", "닭갈비 덮밥", "짜장 덮밥", "서교 알밥", "규동", 
        "가츠동", "쫄면", "떡만두국", "육개 순두부", "카레 덮밥", 
        "불고기 덮밥", "제육 덮밥", "돈까스 마요", "꼬막 비빔밥", 
        "치킨 마요", "육회 비빔밥", "육개장", "돈밥"
    };

	// 무작위 메뉴를 선택하여 출력하는 메서드를 정의합니다.
    public void random() {
        // Random 객체를 생성합니다.
        Random random = new Random();
        // 0부터 메뉴 리스트의 길이까지의 난수를 생성하여 무작위 인덱스를 선택합니다.
        int ranIndex = random.nextInt(menuList.length);
        // 선택된 무작위 메뉴를 출력합니다.
        System.out.println((ranIndex + 1) + "번 메뉴 " + menuList[ranIndex] + " 선택되었습니다.");
    }
}

// 메인 클래스입니다.
public class RandomMenu {
    public static void main(String[] args) {
        // Menu 객체를 생성합니다.
        Menu menu = new Menu();
        // 무작위 메뉴를 출력하는 메서드를 호출합니다.
        menu.random();
    }
}