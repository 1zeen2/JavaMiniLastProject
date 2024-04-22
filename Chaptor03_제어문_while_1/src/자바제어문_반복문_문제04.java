//	1에서 50까지의 합을 더하는 while 문이다. 빈칸에 적절한 코드를 삽입하라.
public class 자바제어문_반복문_문제04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// 1~ 50의 합을 저장할 변수 sum과, while문에 사용할 변수 i를 선언
			int sum = 0, i = 1;
			
			// i의 값이 1부터 50이 될 때 까지 sum에 값을 저장하고 i를 1씩 올림
			while (true) { 
			    if(i == 50) break;	// i <= 50이 아닌 이유는 true가 되면 break를 통해 깨고 넘어오기 때문에 50이 되면 break가 되게끔 선언.
			    sum += i;
			    i ++;  
			} 
			
			// sum에 저장한 값을 출력.
			System.out.println(sum);
		}


	}
