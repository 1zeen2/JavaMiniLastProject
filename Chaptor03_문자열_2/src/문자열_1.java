//	contains : 포함된 문자열 읽기 => 결과값 true false
/*
 * "searchMainDailyBoxOffice.do"
 * 	일일 박스오피스
 * 
 * "searchMainRealTicket.do"
 * 	실시간 예매율
 * 
 * "searchMainDailySeatTicket.do"
 * 	좌석 점유율
 */
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;

public class 문자열_1 {
	static String[] names = {
			"searchMainDailyBoxOffice.do",
			"searchMainRealTicket.do",
			"searchMainDailySeatTicket.do",
	};
	public static void  moviePrint(int no) throws Exception {
		
		Document doc = Jsoup.connect("https://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do").get();
		//System.out.println(doc);
		String data = doc.toString();
		data = data.substring(data.indexOf("["), data.lastIndexOf("]") + 1);
		//System.out.println(data);
		JSONParser jp = new JSONParser();
		JSONArray arr = (JSONArray)jp.parse(data);
		for (int i = 0; i < arr.size(); i++) {
			JSONObject obj = (JSONObject)arr.get(i);
			System.out.println((i + 1) + "." + obj.get("movieNm"));
		}
		
	}

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
	
		while (true) {
			System.out.println("=================================");
			System.out.println("1. 일일 박스오피스");
			System.out.println("2. 실시간 예매율");
			System.out.println("3. 좌석 점유율");
			System.out.println("4. 종료");
			System.out.println("=================================");
			
			System.out.println("메뉴 선택 : ");
			
			int menu = scan.nextInt();
			
			if (menu == 1) {
				Document doc = Jsoup.connect("https://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do").get();
				//System.out.println(doc);
				String data = doc.toString();
				data = data.substring(data.indexOf("["), data.lastIndexOf("]") + 1);
				//System.out.println(data);
				JSONParser jp = new JSONParser();
				JSONArray arr = (JSONArray)jp.parse(data);
				for (int i = 0; i < arr.size(); i++) {
					JSONObject obj = (JSONObject)arr.get(i);
					System.out.println((i + 1) + "." + obj.get("movieNm"));
				}
				// [] => JSONArray, {} => JSONObject
				// JSON => Vue, React, Ajax => Front-End
				//
				/*
				 * {"startYearDate":"2024.04.22",
				 * "endYearDate":"2024.04.22",
				 * "startDate":"2024년 04월 22일(월)",
				 * "endDate":"2024년 04월 22일(월)",
				 * "movieCd":"20234675",
				 * "showDt":"20240422",
				 * "thumbUrl":"/common/mast/movie/2024/02/thumb/thn_febb838d186b46878ca5467759930333.jpg","movieNm":"파묘","movieNmEn":"Exhuma","synop":"미국 LA, 거액의 의뢰를 받은 무당 ‘화림’(김고은)과 ‘봉길’(이도현)은\r\n기이한 병이 대물림되는 집안의 장손을 만난다.\r\n조상의 묫자리가 화근임을 알아챈 ‘화림’은 이장을 권하고,\r\n돈 냄새를 맡은 최고의 풍수사 ‘상덕’(최민식)과 장의사 ‘영근’(유해진)이 합류한다.\r\n\r\n“전부 잘 알 거야… 묘 하나 잘못 건들면 어떻게 되는지”\r\n\r\n절대 사람이 묻힐 수 없는 악지에 자리한 기이한 묘.\r\n‘상덕’은 불길한 기운을 느끼고 제안을 거절하지만,\r\n‘화림’의 설득으로 결국 파묘가 시작되고…\r\n\r\n나와서는 안될 것이 나왔다.\r\n\r\n\r\n","prdtYear":"2024","indieYn":null,"artmovieYn":null,"multmovieYn":null,"showTm":"133","showTs":"50","director":"장재현","prNm":"(주)쇼박스,(주)엠씨엠씨","dtNm":"(주)쇼박스","repNationCd":"한국","movieType":"장편","moviePrdtStat":"개봉","genre":"미스터리,공포(호러)","watchGradeNm":"15세이상관람가","openDt":"20240222","salesAmt":129113849,"audiCnt":13532,"totalSalesAmt":114043582262,"totalAudiCnt":11798651,"scrCnt":940,"showCnt":2558,"rank":1,"rankInten":1,"rankOldAndNew":"OLD","rownum":1},{"startYearDate":"2024.04.22","endYearDate":"2024.04.22","startDate":"2024년 04월 22일(월)","endDate":"2024년 04월 22일(월)","movieCd":"20236614","showDt":"20240422","thumbUrl":"/common/mast/movie/2024/03/thumb/thn_e3e20bd1edf347aeb3ae835d6cc5351a.jpg","movieNm":"쿵푸팬더4","movieNmEn":"Kung Fu Panda 4","synop":"오랜만이지! 드림웍스 레전드 시리즈 마침내 컴백!\r\n\r\n마침내 내면의 평화… 냉면의 평화…가 찾아왔다고 믿는 용의 전사 ‘포’\r\n이젠 평화의 계곡의 영적 지도자가 되고, 자신을 대신할 후계자를 찾아야만 한다.\r\n“이제 용의 전사는 그만둬야 해요?”\r\n\r\n용의 전사로의 모습이 익숙해지고 새로운 성장을 하기보다 지금 이대로가 좋은 ‘포’\r\n하지만 모든 쿵푸 마스터들의 능력을 그대로 복제하는 강력한 빌런 ‘카멜레온’이 나타나고\r\n그녀를 막기 위해 정체를 알 수 없는 쿵푸 고수 ‘젠’과 함께 모험을 떠나게 되는데…\r\n포는 가장 강력한 빌런과 자기 자신마저 뛰어넘고 진정한 변화를 할 수 있을까?","prdtYear":"2024","indieYn":null,"artmovieYn":null,"multmovieYn":null,"showTm":"93","showTs":"31","director":"마이크 미첼,스테파니 스티네","prNm":null,"dtNm":"유니버설픽쳐스인터내셔널 코리아(유)","repNationCd":"미국","movieType":"장편","moviePrdtStat":"개봉","genre":"애니메이션,액션,코미디","watchGradeNm":"전체관람가","openDt":"20240410","salesAmt":121679816,"audiCnt":12914,"totalSalesAmt":11803038661,"totalAudiCnt":1261223,"scrCnt":1022,"showCnt":3120,"rank":2,"rankInten":-1,"rankOldAndNew":"OLD","rownum":2},{"startYearDate":"2024.04.22","endYearDate":"2024.04.22","startDate":"2024년 04월 22일(월)","endDate":"2024년 04월 22일(월)","movieCd":"20228797","showDt":"20240422","thumbUrl":"/common/mast/movie/2024/03/thumb/thn_ffd473fbe96641fdac90c67f6501e754.jpg","movieNm":"범죄도시4","movieNmEn":"THE ROUNDUP : PUNISHMENT","synop":"신종 마약 사건 3년 뒤,\r\n괴물형사 ‘마석도’(마동석)와 서울 광수대는 배달앱을 이용한 마약 판매 사건을 수사하던 중\r\n수배 중인 앱 개발자가 필리핀에서 사망한 사건이\r\n대규모 온라인 불법 도박 조직과 연관되어 있음을 알아낸다.\r\n\r\n필리핀에 거점을 두고 납치, 감금, 폭행, 살인 등으로\r\n대한민국 온라인 불법 도박 시장을 장악한 특수부대 용병 출신의 빌런 ‘백창기’(김무열)와\r\n한국에서 더 큰 판을 짜고 있는 IT업계 천재 CEO ‘장동철’(이동휘).\r\n\r\n‘마석도’는 더 커진 판을 잡기 위해 ‘장이수’(박지환)에게 뜻밖의 협력을 제안하고\r\n광역수사대는 물론, 사이버수사대까지 합류해 범죄를 소탕하기 시작하는데…\r\n\r\n나쁜 놈 잡는데 국경도 영역도 제한 없다!\r\n업그레이드 소탕 작전! 거침없이 싹 쓸어버린다!\r\n","prdtYear":"2024","indieYn":null,"artmovieYn":null,"multmovieYn":null,"showTm":"109","showTs":"7","director":"허명행","prNm":"주식회사 빅펀치픽쳐스,(주)홍필름,(주)비에이엔터테인먼트","dtNm":"주식회사 에이비오엔터테인먼트,플러스엠 엔터테인먼트","repNationCd":"한국","movieType":"장편","moviePrdtStat":"개봉예정","genre":"액션,범죄","watchGradeNm":"15세이상관람가","openDt":"20240424","salesAmt":105198000,"audiCnt":9354,"totalSalesAmt":431240800,"totalAudiCnt":37607,"scrCnt":40,"showCnt":40,"rank":3,"rankInten":3,"rankOldAndNew":"OLD","rownum":3},{"startYearDate":"2024.04.22","endYearDate":"2024.04.22","startDate":"2024년 04월 22일(월)","endDate":"2024년 04월 22일(월)","movieCd":"20235613","showDt":"20240422","thumbUrl":"/common/mast/movie/2024/04/thumb/thn_3b5eac0471124516a50717782e73e4fd.jpg","movieNm":"스턴트맨","movieNmEn":"The Fall Guy","synop":"사람도 구하고, 영화도 구하고, X도 구하려다 X됐다…!\r\n\r\n잠수 이별을 택하고 후회뿐인 날을 보내던 스턴트맨 ‘콜트’(라이언 고슬링)\r\n영화감독이 된 전 여친 ‘조디’(에밀리 블런트)의 촬영장에 복귀하며 아련한 재회를 기대했\r\n지만… 갑자기 주연배우가 사라지고 콜트는 우선 그부터 찾아야만 한다!\r\n\r\n&lt;데드풀 2&gt; 감독이 말아주는 코미디, 액션, 로맨스 장르 풀코스\r\n액션도 터지고, 사랑도 터지고, 웃음도 터진다!","prdtYear":"2024","indieYn":null,"artmovieYn":null,"multmovieYn":null,"showTm":"126","showTs":"17","director":"데이빗 레이치","prNm":null,"dtNm":"유니버설픽쳐스인터내셔널 코리아(유)","repNationCd":"미국","movieType":"장편","moviePrdtStat":"개봉예정","genre":"액션,코미디,멜로/로맨스","watchGradeNm":"15세이상관람가","openDt":"20240501","salesAmt":71649000,"audiCnt":7961,"totalSalesAmt":229515000,"totalAudiCnt":24947,"scrCnt":34,"showCnt":34,"rank":4,"rankInten":-4,"rankOldAndNew":"NEW","rownum":4},{"startYearDate":"2024.04.22","endYearDate":"2024.04.22","startDate":"2024년 04월 22일(월)","endDate":"2024년 04월 22일(월)","movieCd":"20231677","showDt":"20240422","thumbUrl":"/common/mast/movie/2024/03/thumb/thn_3a7d99a378004dbb8679c6106144846e.jpg","movieNm":"남은 인생 10년","movieNmEn":"The Last 10 Years","synop":"스무 살이 되던 해, 수 만명 중 1명이 걸리는\r\n난치병으로 10년의 삶을 선고받은 ‘마츠리’는\r\n삶의 의지를 잃은 ‘카즈토’를 만나 사랑에 빠진다.\r\n\r\n처음 만난 봄, 즐거운 여름, 아름답던 가을, 깊어진 겨울까지\r\n하루하루 애틋하게 사랑한 두 사람\r\n\r\n하지만 쌓이는 추억만큼 줄어드는 시간 앞에\r\n결국 ‘마츠리’는 ‘카즈토’를 떠나기로 결심하는데…","prdtYear":"2022","indieYn":null,"artmovieYn":"Y","multmovieYn":null,"showTm":"124","showTs":"57","director":"후지이 미치히토","prNm":null,"dtNm":"(주)바이포엠스튜디오,(주)디스테이션","repNationCd":"일본","movieType":"장편","moviePrdtStat":"개봉","genre":"멜로/로맨스","watchGradeNm":"12세이상관람가","openDt":"20230524","salesAmt":49614183,"audiCnt":5052,"totalSalesAmt":4001713313,"totalAudiCnt":391932,"scrCnt":493,"showCnt":1028,"rank":5,"rankInten":-2,"rankOldAndNew":"OLD","rownum":5},{"startYearDate":"2024.04.22","endYearDate":"2024.04.22","startDate":"2024년 04월 22일(월)","endDate":"2024년 04월 22일(월)","movieCd":"20231041","showDt":"20240422","thumbUrl":"/common/mast/movie/2024/03/thumb/thn_6417ac2c3e824da38e64743c06b0d098.jpg","movieNm":"댓글부대","movieNmEn":"Troll Factory","synop":"실력 있지만 허세 가득한 사회부 기자 ‘임상진’\r\n대기업 ‘만전’의 비리를 취재하지만 오보로 판명되며 정직당한다.\r\n그러던 어느 날, 온라인 여론을 조작했다는 의문의 제보자가 찾아오는데…\r\n \r\n“기자님 기사 오보 아니었어요. 다 저희들이 만든 수법이에요”","prdtYear":"2024","indieYn":null,"artmovieYn":null,"multmovieYn":null,"showTm":"109","showTs":"25","director":"안국진","prNm":"(주)영화적순간,주식회사 디믹스스튜디오","dtNm":"(주)에이스메이커무비웍스","repNationCd":"한국","movieType":"장편","moviePrdtStat":"개봉","genre":"범죄,드라마","watchGradeNm":"15세이상관람가","openDt":"20240327","salesAmt":28832172,"audiCnt":2977,"totalSalesAmt":9187009982,"totalAudiCnt":966862,"scrCnt":500,"showCnt":895,"rank":6,"rankInten":-2,"rankOldAndNew":"OLD","rownum":6},{"startYearDate":"2024.04.22","endYearDate":"2024.04.22","startDate":"2024년 04월 22일(월)","endDate":"2024년 04월 22일(월)","movieCd":"20248466","showDt":"20240422","thumbUrl":"/common/mast/movie/2024/03/thumb/thn_ed2b0191b10f4dd2ba85beb68d609bb0.jpg","movieNm":"고스트버스터즈: 오싹한 뉴욕","movieNmEn":"Ghostbusters: Frozen Empire ","synop":"얼어붙은 세상을 깨라!\r\n\r\n무더운 여름의 뉴욕의 어느 날, 고대 유물 속 깨어난 ‘데스칠’로 인해 정체불명의 냉기가 몰려오고\r\n마침내 도시는 얼어붙고 만다.\r\n\r\n유령을 퇴치하는 ‘그루버슨’(폴 러드)과 라이즈 버스터즈 멤버들은\r\n얼어붙은 세상을 깨부수기 위해 유령 군단을 쫓기 시작하는데… ","prdtYear":"2023","indieYn":null,"artmovieYn":null,"multmovieYn":null,"showTm":"114","showTs":"55","director":"길 키넌","prNm":null,"dtNm":"소니픽쳐스엔터테인먼트코리아주식회사극장배급지점","repNationCd":"미국","movieType":"장편","moviePrdtStat":"개봉","genre":"액션,어드벤처","watchGradeNm":"12세이상관람가","openDt":"20240417","salesAmt":14289229,"audiCnt":1563,"totalSalesAmt":363204249,"totalAudiCnt":38523,"scrCnt":420,"showCnt":756,"rank":7,"rankInten":-2,"rankOldAndNew":"OLD","rownum":7},{"startYearDate":"2024.04.22","endYearDate":"2024.04.22","startDate":"2024년 04월 22일(월)","endDate":"2024년 04월 22일(월)","movieCd":"20247673","showDt":"20240422","thumbUrl":"/common/mast/movie/2024/04/thumb/thn_32b9d47f9ad142e39b5e8f7c98fff3e2.jpg","movieNm":"오멘: 저주의 시작","movieNmEn":"The First Omen","synop":"수녀가 되기 위해 로마에 가게 된 ‘마거릿’(넬 타이거 프리).\r\n그곳에서 새로운 삶을 시작하려는 그때,\r\n믿음을 뒤흔드는 어둠의 그림자를 마주한다.\r\n \r\n서서히 조여오는 끔찍한 공포가 마침내 정체를 드러내기 시작하는데 …\r\n \r\n6월 6일 6시 사탄의 아이가 태어나고,\r\n믿음이 향하는 곳이 뒤바뀐다!","prdtYear":"2024","indieYn":null,"artmovieYn":null,"multmovieYn":null,"showTm":"119","showTs":"11","director":"아르카샤 스티븐슨","prNm":null,"dtNm":"월트디즈니컴퍼니코리아 유한책임회사","repNationCd":"미국","movieType":"장편","moviePrdtStat":"개봉","genre":"공포(호러)","watchGradeNm":"15세이상관람가","openDt":"20240403","salesAmt":16081995,"audiCnt":1532,"totalSalesAmt":1805822872,"totalAudiCnt":175584,"scrCnt":287,"showCnt":425,"rank":8,"rankInten":-1,"rankOldAndNew":"OLD","rownum":8},{"startYearDate":"2024.04.22","endYearDate":"2024.04.22","startDate":"2024년 04월 22일(월)","endDate":"2024년 04월 22일(월)","movieCd":"20236295","showDt":"20240422","thumbUrl":"/common/mast/movie/2024/02/thumb/thn_1e9c09d38f7d4bcf8247e145a87de012.jpg","movieNm":"듄: 파트2","movieNmEn":"Dune: Part Two","synop":"황제의 모략으로 멸문한 가문의 유일한 후계자 폴.(티모시 샬라메) \r\n어머니 레이디 제시카(레베카 퍼거슨)와 간신히 목숨만 부지한 채 사막으로 도망친다.\r\n그곳에서 만난 반란군들과 숨어 지내다 그들과 함께 황제의 모든 것을 파괴할 전투를 준비한다.\r\n한편 반란군들의 기세가 높아질수록 불안해진 황제와 귀족 가문은 \r\n잔혹한 암살자 페이드 로타(오스틴 버틀러)를 보내 반란군을 몰살하려 하는데…\r\n\r\n2월, 운명의 반격이 시작된다!","prdtYear":"2024","indieYn":null,"artmovieYn":null,"multmovieYn":null,"showTm":"165","showTs":"37","director":"드니 빌뇌브","prNm":null,"dtNm":"워너브러더스 코리아(주)","repNationCd":"미국","movieType":"장편","moviePrdtStat":"개봉","genre":"액션","watchGradeNm":"12세이상관람가","openDt":"20240228","salesAmt":13846468,"audiCnt":1256,"totalSalesAmt":23301802781,"totalAudiCnt":1988386,"scrCnt":154,"showCnt":209,"rank":9,"rankInten":-1,"rankOldAndNew":"OLD","rownum":9},{"startYearDate":"2024.04.22","endYearDate":"2024.04.22","startDate":"2024년 04월 22일(월)","endDate":"2024년 04월 22일(월)","movieCd":"19950095","showDt":"20240422","thumbUrl":"/common/mast/movie/2024/04/thumb/thn_b997b01bc12a4e7b9cf3082500011deb.jpg","movieNm":"레옹 ","movieNmEn":"Leon","synop":"“사랑해요. 내 첫사랑 레옹.”_마틸다 \r\n“나도 행복해 지고 싶어. 잠도 자고, 뿌리도 내릴 꺼야.”_레옹 \r\n\r\n한 손엔 우유 2팩이 든 가방, 다른 한 손엔 화분을 들고 뿌리 없이 떠도는 킬러 레옹은 어느 날 옆 집 소녀 마틸다의 일가족이 몰살 당하는 것을 목격한다. 그 사이 심부름을 갔다 돌아 온 마틸다는 가족들이 처참히 몰살 당하자 레옹에게 도움을 청하다. 가족의 원수를 갚기 위해 킬러가 되기로 결심한 12세 소녀 마틸다는 레옹에게 글을 알려주는 대신 복수하는 법을 배우게 된다. 드디어 그녀는 가족을 죽인 사람이 부패 마약 경찰 스탠스임을 알게 되고, 그의 숙소로 향하게 되는데…","prdtYear":"1994","indieYn":null,"artmovieYn":"Y","multmovieYn":null,"showTm":"132","showTs":"43","director":"뤽 베송","prNm":"고몽","dtNm":"와이드 릴리즈(주),(주)제이앤씨미디어그룹,(주)팝파트너스","repNationCd":"프랑스","movieType":"장편","moviePrdtStat":"개봉","genre":"액션,범죄","watchGradeNm":"청소년관람불가","openDt":"19950218","salesAmt":8264290,"audiCnt":1129,"totalSalesAmt":455481047,"totalAudiCnt":60855,"scrCnt":94,"showCnt":139,"rank":10,"rankInten":0,"rankOldAndNew":"OLD","rownum":10}
				 */
			} else if (menu == 2) {
				Document doc = Jsoup.connect("https://www.kobis.or.kr/kobis/business/main/searchMainRealTicket.do").get();
				//System.out.println(doc);
				String data = doc.toString();
				data = data.substring(data.indexOf("["), data.lastIndexOf("]") + 1);
				//System.out.println(data);
				JSONParser jp = new JSONParser();
				JSONArray arr = (JSONArray)jp.parse(data);
				for (int i = 0; i < arr.size(); i++) {
					JSONObject obj = (JSONObject)arr.get(i);
					System.out.println((i + 1) + "." + obj.get("movieNm"));
				}
			
			} else if (menu == 3) {
				
			} else if (menu == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("존재하지 않는 메뉴입니다.");
			}
		}
		
		
		
	}
}
