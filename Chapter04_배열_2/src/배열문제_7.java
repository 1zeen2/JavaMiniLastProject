
public class 배열문제_7 {

	public static void main(String[] args) {
		// 풀이 Pass. 5번 문제와 동일하니 풀어볼 것.
		// 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
		
		int avg = 0;
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) +1;
			System.out.println("생성한 정수 10개 확인 : " + arr[i]);
		}
		for (int i :arr) {
			avg += i;
		}
		System.out.println("배열에 든 숫자들의 평균" + avg / 10);
	}

}
