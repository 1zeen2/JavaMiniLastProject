
public class 배열문제_6 {

	public static void main(String[] args) {
		/*
		 * 6. int[] num = { 94, 85, 95, 88, 90 }; 다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오
		 */
		// 정수형 mum 배열 생성과 동시에 초기화
		int[] num = {94, 85, 95, 88, 90};
		
		// 최소값, 최대값을 구하기 위한 정수형 변수 두 개 선언
		int max = num[0];
		int min = num[0];
		
		// 각 배열에 들어있는 정수의 크기를 비교하여 순서를 바꿈
		for (int i : num) {
			if (max < i)	// if (94<94) if (94<85) if(94 < 95) ...
				max = i;
			if (min > i)
				min = i;
		}
		
		System.out.println("최대 값 : " + max);
		System.out.println("최소 값 : " + min);

	}

}
