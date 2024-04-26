//	중복이 없는 난수
//	1 ~ 10 10개의 난수 발생	=> 중복이 없게

/*
 *  
 *  
 */
public class 중첩_for_5 {

	public static void main(String[] args) {
		// 용도가 같은 정수 10개 저장.
		int[] arr = new int[10];		//	변수 이름을 1개로 통일 = 구분운 index로 함.
		// 제어하기가 편리하다	(읽기 / 쓰기) => 반복문을 사용하기 때문에 소스 코딩을 줄일 수 있다.
		// int a = random() => 500
		// class도 하나의 이름으로 통일하여 여러개를 동시에 제어하는게 편리함 => 인터페이스를 사용
		
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;			
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i +"");
		}
	}

}
//	9	5	2	8	1	3	7	6	4	10