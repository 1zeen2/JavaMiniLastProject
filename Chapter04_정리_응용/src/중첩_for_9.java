
import java.util.*;

public class 중첩_for_9 {

	public static void main(String[] args) {
		//중복이 없는 난수를 발생하는 로또 번호 추출
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for ( int j = 0; j < i; j++) {
				if ( lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		System.out.println((Arrays.toString(lotto)));
		
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
					
			}
		}
		System.out.println("================오늘의 로또 번호 ~!~!~!~!==============");
		for (int i : lotto) {
			System.out.println(i + " ");
			try  {
				Thread.sleep(2000);
			} catch(Exception ex) {}
		}
			
	}
}
