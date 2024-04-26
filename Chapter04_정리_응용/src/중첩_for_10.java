//	알파벳 10개를 임의로 추출한 후에 정렬해서 출력 => ASC / DESC

import java.util.Arrays;

public class 중첩_for_10 {
	
	public static void main(String[] args) {
		
		char[] ca = new char[10];
		
		for (int i = 0; i < ca.length; i ++) {
			ca[i] = (char)((int)(Math.random() * 26) + 65);
		}
		System.out.println("======== 정렬 전 ===========");
		System.out.println(Arrays.toString(ca));
		System.out.println("======== 정렬 후 ===========");
		
		for (int i = 0; i <= ca.length - 1; i ++) {
			for (int j = i + 1; j < ca.length; j++)	{
				if (ca[i] < ca[j]) {
					char temp = ca[i];
					ca[i] = ca[j];
					ca[j] = temp;
				}
			}
			
		}
		System.out.println("DESC");
		System.out.println(Arrays.toString(ca));
		
		for (int i = 0; i <= ca.length - 1; i ++) {
			for (int j = i + 1; j < ca.length; j++)	{
				if (ca[i] > ca[j]) {
					char temp = ca[i];
					ca[i] = ca[j];
					ca[j] = temp;
				}
			}
			
		}		
		System.out.println("ASC");
		System.out.println(Arrays.toString(ca));
		
	}
}
