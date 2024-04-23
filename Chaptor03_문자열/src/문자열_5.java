// 복숭아:peach

public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f = "복숭아:peach";
		System.out.println("복숭아의 영어는?" + f);
		System.out.println("영어는 " +  f.substring(f.indexOf(":") + 1));		//	f. substring 	=> String f의 문자를 잘라온다 
																				// f.indexOF(":") + 1: 	=> : 글자 1개 뒤부터 
		/*
		 * substring : 문자열을 자르는 경우에 사용
		 * Hello Java
		 * 0123456789
		 * substring(6)		=> 6번 글자부터 잘라서 가져온다.			=>	Java
		 * substring(3, 8)	=> 3번 글자부터 8번 전까지 잘라서 가져온다	=>	lo Ja
		 * substring(int strartIndex)
		 * substring(int startIndex, int endIndex) => 앞쪽부터 잘라온다, 뒤쪽부터 잘라온다. ==> endIndex는 마지막 글자가 잘려온다.
		 * 								= endIndex - 1
		 */
		
		String msg = "Hello Java";
		System.out.println(msg.substring(0, 7) + "...");
	}

}
