// 	1에서 100까지 3의 배수를 더하는 while 문의 빈칸에 적절한 코드를 삽입하라.

/*
 * 1 ~100 까지 for문을 돌리고
 */


public class 자바제어문_반복문_문제03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 총 합의 값을 저장할 수 있는 변수 sum과 while에 사용할 정수값을 담을 변수 i 선언.
		int sum = 0, i = 1;
		
		//100까지 i 값을 1씩 올림
		while (i < 100) {
			
			// i가 3의 배수가 아닐 경우 i++
		    if(i %3 != 0) {
		        i++;
		        
		        // continue를 사용하여 프로그램이 계속 돌아가게 해야 한다.
		        continue;
		    }
		    
		    //i의 값이 3의 배수일 때 else에 담는다
		    else sum += i;
		    i++;
		}
		
		// sum의 총 값을 출력.
        System.out.println("총 값" + sum);
	}

}
