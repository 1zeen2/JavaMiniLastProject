
public class 연산자문제_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random() * 100) + 1;
		int num2 = (int)(Math.random() * 100) + 1;
		
		System.out.println("====== 결과 값 ======");
		System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
		//					  -- ===> 2개를 출력해야 나오는 경우가 있음
		
		
	}

}
