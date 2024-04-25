
public class 배열_3 {

	public static void main(String[] args) {
		String[] names = {"홍길동", "심청이", "이순신", "강감찬", "춘향이"};
		String[] sex =	{"남자", "여자", "남자", "남자", "여자"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "(" + sex[i] + ")");
		}
		System.out.println("===============================");
		int i = 0;
		for (String name : names) {
			System.out.println(name + "(" + sex[i] + ")");
			i++;
		}
			
	}
}
