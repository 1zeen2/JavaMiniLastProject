package test1;

public class IndexOf {
	public static void main(String[] args) {
		String msg = "가게 이름 (세부사항) 추가 정보 (기타)";
		String temp = "";
		temp = msg.substring(0, msg.indexOf("(")) + "\n" + msg.substring(msg.indexOf("("));
		System.out.println(temp);

	}
}
