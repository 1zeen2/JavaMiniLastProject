// 1 ~ 10까지 합을 구하는 메서드를 구현하시오.
//			----> 리턴 형은 있고
// ------> 매개 변수는 없다 (1 ~ 10으로 정해져 있기 때문에)

public class 메서드_문제_2 {
	static int numb() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		return sum;	// 값 = 리턴형에 사용되는 데이터형이 동일해야 한다.
	}
	public static void main(String[] args) {
		// 리턴 형이 있는 경우 결과 값을 받아야 한다
		// 데이터형 변수 = 메서드명();
		int sum = numb();	
		System.out.println(sum);
	}

}
