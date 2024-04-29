// 매개 변수 => 매서드 안에서만 사용이 가능한 변수  => 지역 변수
// 메서드 호출 시 메모리에 저장 => 메서드가 종료되면 자동으로 해제 (메모리에서 없어짐)

public class 메서드_3 {
	
	static int i = 1;	// 전역 변수 => 프로그램 종료 시에 메모리 해제
	
	static void	increament() {	// 호출 시 마다 변수는 자동 삭제 => 재 호출 시 다시 생성
		int i = 1; 	// 지역 변수가 우선 순위이기 때문에 전역 변수와 지역 변수가 같이 선언이 되면 지역 변수를 우선으로 한다.
		
		// 노란색 or 밤색	=> 지역 변수
		// 		파란색 	=> 클래스 변수
		
		System.out.println("i = " + 메서드_3.i);
		++메서드_3.i;
	}
	public static void main(String[] args) {
		increament();	//	{} (블록 혹은 지역) 안에 선언된 모든 변수는 메모리에서 삭제된다.
		increament();
		increament();
		
		
	}

}
