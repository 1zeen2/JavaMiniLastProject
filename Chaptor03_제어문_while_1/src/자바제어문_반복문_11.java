/*
 * 	while		=> 선조건 => 한 번도 수행하지 못할 수 있다.
 * 
 * 	do while	=> 후조건 => 무조건 한 번은 수행한다.
 * 
 * 	초기 값
 * 	while (조건식) {
 * 		반복 수행 문장
 * 		증감식
 * 	} 
 * 
 * 	int i = 10;
 * 
 *  while (i <= 5) {	===> 수행을 하지 못하여 시작과 동시에 종료.
 *  
 *  int i = 10;			--------- 1
 *  
 *  do {
 *  	반복 실행 문장	--------- 2
 *  	증감식			--------- 3
 *  } while (i <= 5);	--------- 4
 *  
 *  	while을 보완하기 위해 do ~ while이 생김 ====> C / C++ 에서는 많이 사용
 *  	=> JAVA에서는 사용 빈도가 거의 없다.
 *   
 *  }				
 */
public class 자바제어문_반복문_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		System.out.println(" ====== for ======= ");
		
		for (i = 1; i <= 10; i++) {
			System.out.println(i + " ");
		}
		System.out.println("\n ====== while ======");
		
		i = 1;
		
		while (i <= 10) {
			System.out.println(i + " ");
			i++;
		}
		System.out.println("\n ====== do while ======");
		
		i = 1;
		
		do {
			System.out.println(i + " ");
			System.out.println(i + " ");
			
		} while (i <= 10);
	}

}
