import javax.xml.transform.Result;

public class 문자열배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lotto = {
		15,16,17,25,30,31,
		7,12,23,32,34,36,
		10,16,19,32,33,38,
		11,13,20,21,32,44,
		16,20,26,36,42,44,
		3,13,30,33,43,45,
		3,7,11,20,22,41,
		10,12,13,19,33,40,
		7,19,26,37,39,44,
		6,14,30,31,40,41,
		1,3,4,29,42,45,
		6,16,34,37,39,40,
		1,7,21,30,35,38,
		10,12,29,31,40,44,
		13,14,22,26,37,38,
		6,7,13,28,36,42,
		17,26,29,30,31,43,
		3,20,28,38,40,43,
		12,16,21,24,41,43,
		14,33,34,35,37,40,
		1,12,16,19,23,43,
		8,14,28,29,34,40,
		6,7,15,22,26,40,
		10,17,22,30,35,43,
		7,18,19,26,33,45,
		6,20,23,24,28,30,
		12,19,21,29,40,45,
		4,18,31,37,42,43,
		11,21,22,30,39,44,
		13,14,18,21,34,44,
		11,16,25,27,35,36,
		4,7,17,18,38,44,
		8,12,13,29,33,42,
		3,7,14,15,22,38,
		21,26,27,32,34,42,
		1,9,16,23,24,38,
		13,16,23,31,36,44,
		4,8,18,24,37,45,
		6,10,11,14,36,38,
		4,8,17,30,40,43,
		3,7,9,33,36,37,
		1,23,24,35,44,45,
		1,6,20,27,28,41,
		6,18,28,30,32,38,
		16,18,20,23,32,43,
		1,2,11,21,30,35,
		3,6,14,22,30,41,
		1,10,18,22,28,31,
		4,7,19,26,33,35,
		7,10,19,23,28,33,
		6,11,16,19,21,32,
		3,18,19,23,32,45,
		3,6,9,18,22,35,
		3,6,22,23,24,38,
		20,31,32,40,41,45,
		4,24,27,35,37,45,
		3,10,24,33,38,45,
		7,10,22,25,34,40,
		11,23,25,30,32,40,
		8,13,19,27,40,45,
		13,20,24,32,36,45,
		4,7,12,14,22,33,
		14,19,27,28,30,45,
		22,26,29,30,34,45,
		5,17,26,27,35,38,
		21,26,30,32,33,35,
		6,12,31,35,38,43,
		3,5,13,20,21,37,
		6,12,17,21,32,39,
		2,20,33,40,42,44,
		7,16,25,29,35,36,
		6,14,15,19,21,41,
		12,17,20,26,28,36,
		3,5,12,22,26,31,
		5,14,15,23,34,43,
		6,7,9,11,17,18,
		8,16,26,29,31,36,
		2,3,6,19,36,39,
		7,16,24,27,37,44,
		2,14,15,22,27,33,
		2,5,22,32,34,45,
		9,14,34,35,41,42,
		26,31,32,33,38,40,
		3,11,15,20,35,44,
		1,6,12,19,36,42,
		6,7,22,32,35,36,
		2,5,11,17,24,29,
		12,30,32,37,39,41,
		5,7,12,13,18,35,
		14,16,27,35,39,45,
		5,12,13,31,32,41,
		8,9,20,25,29,33,
		9,18,20,22,38,44,
		10,14,16,18,29,35,
		5,6,11,29,42,45,
		12,15,17,24,29,45,
		12,27,29,38,41,45,
		1,4,13,17,34,39,
		3,19,21,25,37,45,
		12,18,22,23,30,34,
		15,26,28,34,41,42,
		14,23,31,33,37,40,
		3,11,14,18,26,27,
		21,22,26,34,36,41,
		5,11,18,20,35,45,
		1,9,12,26,35,38,
		9,12,15,25,34,36,
		15,23,29,34,40,44,
		9,11,30,31,41,44,
		8,11,16,19,21,25,
		8,11,15,16,17,37,
		8,13,18,24,27,29,
		7,15,30,37,39,44,
		1,4,29,39,43,45,
		17,25,33,35,38,45,
		6,10,12,14,20,42,
		2,8,19,22,32,42,
		1,3,9,14,18,28,
		13,17,18,20,42,45,
		4,7,14,16,24,44,
		6,11,15,24,32,39,
		1,4,13,29,38,39,
		1,3,8,24,27,35,
		6,14,16,18,24,42,
		12,20,26,33,44,45
		};
		int[] result = new int[46];
		for (int i = 0; i < lotto.length; i++) {
			result[lotto[i]]++;
		}
		for (int i = 1; i < result.length; i++) {
		if (result[i] >= 49)
			System.out.println(i + "=>" + result[i]);
		}
	}
}
