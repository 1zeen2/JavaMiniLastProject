import java.util.Arrays;

public class 실무_중복없는난수 {

	public static void main(String[] args) {
		
		int[] lotto = new int [6];
		//난수를 받는 변수
		int su = 0;	
		//중복 여부를 확인하는 변수 
		boolean bCheck = false;
		
		for (int i = 0; i < lotto.length; i++) {
			bCheck = true;
		// 중복이면 다시 수행. 중복이 아닌 경우 종료 후 lotto 저장
			while(bCheck) {	
				su = (int)(Math.random() * 45) + 1;
				bCheck = false;
				
				for (int j = 0; j < i; j++) {
					if (lotto [j] == su) {
						bCheck = true;
						break;
					}
				}
				lotto[i] = su;
			}
		}
		System.out.println(Arrays.toString(lotto));
	}

}
