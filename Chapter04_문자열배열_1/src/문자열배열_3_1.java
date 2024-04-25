import java.nio.file.spi.FileSystemProvider;
import java.util.*;

public class 문자열배열_3_1 {

	public static void main(String[] args) {
		String[] 과일 = {
				"사과:apple",
				"배:pear",
				"밤:chestnut",
				"잣:pine nut",
				"호두:walnut",
				"도토리:acorn",
				"귤:tangerine",
				"딸기:strawberry",
				"파인애플:pineapple",
				"포도:grape",
				"복숭아:peach",
				"살구:apricot",
				"매실:Japanese apricot",
				"자두:plum",
				"키위:kiwi",
				"토마토:tomato",
				"블루베리:blueberry",
				"앵두:cherry",
				"바나나:banana",
				"오렌지:orange",
				"수박:watermelon",
				"멜론:melon",
				"참외:oriental melon",
				"망고:mango",
				"레몬:lemon",
				"석류:pomegranate",
				"자몽:grapefruit",
				"대추:jujub",
				"감:persimmon",
				"곶감:dried persimmon",
				"리치:litchi",
				"모과:quince",
				"오디:mulberry",
				"유자:citron",
				"무화과:fig",
				"호박:pumpkin",
				"오이:cucumber",
				"양파:onion",
				"마늘:garlic",
				"생강:ginger",
				"무:radish",
				"쑥:mugwort",
				"당근:carrot",
				"인삼:ginseng",
				"산삼:wild ginseng",
				"더덕:deodeok",
				"죽순:bamboo shoot",
				"파프리카:paprika",
				"피망:pimiento",
				"부추:chives",
				"파:green onion",
				"감자:potato",
				"고구마:sweet-potato",
				"가지:eggplant",
				"옥수수:corn",
				"후추:pepper",
				"고추:chili, hot pepper",
				"배추:Chinese cabbage",
				"양배추:cabbage",
				"상추:lettuce",
				"양상추:lettuce",
				"시금치:spinach",
				"콩:bean",
				"땅콩:peanut",
				"깨:sesame",
				"깻잎:sesame leaf",
				"콩나물:bean sprouts",
				"버섯:mushroom",
				"미역:seaweed"
		};
		// 영문 단어 중에 가장 긴 이름을 가진 단어를 찾는다.
		// 영문 단어 중에 가장 짧은 이름을 가진 단어를 찾는다.
		
		// 영어 과일명 이라는 문자열 배열을 하나 만들고 크기는 과일이라는 배열의 크기와 같게 설정한다.
		String[] 영어과일명 = new String[과일	.length];	
		//	0번 인덱스부터 마지막 인덱스까지 : 이후로 값을 자름.
		for (int i = 0; i < 과일.length; i++) {
            영어과일명[i] = 과일[i].substring(과일[i].indexOf(":") + 1);
        }
        for (String ef : 영어과일명) {
            System.out.println(ef);
        }

        String 최장명 = 영어과일명[0]; // 가장 긴 문자열을 저장할 변수 초기화
        String 최단명 = 영어과일명[0]; // 가장 짧은 문자열을 저장할 변수 초기화

        // 배열의 첫 번째 값부터 마지막 값까지 비교하여 최댓값과 최솟값을 찾음
        for (int i = 1; i < 영어과일명.length; i++) {
            if (영어과일명[i].length() > 최장명.length()) {
                최장명 = 영어과일명[i]; // 최장명 갱신
            }
            if (영어과일명[i].length() < 최단명.length()) {
                최단명 = 영어과일명[i]; // 최단명 갱신
            }
        }

        System.out.println("가장 긴 영문명: " + 최장명);
        System.out.println("가장 짧은 영문명: " + 최단명);
    }
}


