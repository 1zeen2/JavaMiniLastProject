// 	1에서 100까지 3의 배수를 더하는 while 문의 빈칸에 적절한 코드를 삽입하라.

/*
 * 1 ~100 까지 for문을 돌리고
 */
public class 자바제어문_반복문_문제03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0, i=1;
		
		while (i < 100) {
		    if(i %3 != 0) {
		        i++;
		        // continue를 사용하여 프로그램이 계속 돌아가게 해야 한다.
		        continue;
		    }
		    else sum += i;
		    i++;
		}
        System.out.println("총 값" + sum);
	}

}
