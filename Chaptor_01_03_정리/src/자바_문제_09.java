// 0~12까지 2의 배수, 3의 배수의 합을 구하여라.
public class 자바_문제_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int a2 = 0, a3 = 0;
		
		for (int i = 0; i <= 12; i++) {
			if (i % 2 == 0)
				a2 += i;
			if (i % 3 == 0)
				a3 += i;
		}
		System.out.println("2의 배수의 합 : " + a2);
		System.out.println("2의 배수의 합 : " + a3);
*/	
/*
 * 1 ~ 100 까지의 7의 배수의 합, 9의 배수의 합을 구하시오.
 */
	int a7 = 0, a9 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0)
				a7 += i;
			if (i % 9 == 0)
				a9 += i;
			if (i %7 == 0 && i %9 ==0) {
				System.out.println("중복된 숫자를 추출하고,그 값을 나타냅니다" + i);
			}
		}
	System.out.println("7의 배수의 합 : " + a7);
	System.out.println("9의 배수의 합 : " + a9);
	System.out.println("각 배수의 합을 더하고 중복된 숫자를 제외한 값을 나타냅니다." + (a7 + a9 -63));
	}

}
/*
int a7 = 0, a9 = 0, a7and9 = 0;							gpt 답변
for (int i = 1; i <= 100; i++) {
    if (i % 7 == 0 && i % 9 == 0) {
        a7and9 += i; // 7과 9의 배수이면서 중복된 숫자
    } else if (i % 7 == 0) {
        a7 += i; // 7의 배수
    } else if (i % 9 == 0) {
        a9 += i; // 9의 배수
    }
}
System.out.println("7의 배수의 합 : " + a7);
System.out.println("9의 배수의 합 : " + a9);
System.out.println("중복된 숫자의 합 : " + a7and9);
System.out.println("각 배수의 합을 더하고 중복된 숫자를 제외한 값 : " + (a7 + a9 - a7and9));
*/
