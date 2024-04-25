
public class 문자열배열_2 {

	public static void main(String[] args) {
		String color = "red, blue, black, yellow, pink, magenta";
		String[] colors = color.split(",");
		
		for (String c : colors) {
			System.out.println(c + " ");
		}
		System.out.println();
		
		String names = "홍길동 | 심청이 | 춘향이 | 박문수 | 이순신 | 강감찬";
		String[] name2 = names.split("\\|");
		/*
		 * ?	=>	앞, 뒤의 값을 가져올 때 사용
		 * |	=> 	여러 개 중 하나를 가지고 올 때 선택	=>	A	|	B	|	C
		 * .	=>	임의의 1글자를 가지고 올 때 사용
		 * +	=>	한 개 이상의 문자가 있는 경우
		 * *	=> 	0개 이상의 문자
		 * ^	=>	시작
		 * $	=>	끝
		 * 			==> 정규식 사용 기호들은 앞에 꼭 \을 붙여줘야 올바르게 인식을 할 수가 있다.
		 */
		
		for (String n : name2) {
			System.out.println(n);
		}
	}
}
