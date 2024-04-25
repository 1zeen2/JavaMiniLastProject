//	1. 배열의 범위를 벗어나면 오류가 발생한다. 0 ~ 개수 -1
//	2. 프로그래머의 실수가 가장 많은 곳	=> 실행 시에 오류가 발생
//	ArrayIndexOutOfBoundsException ==> 배열의 범위가 잘못되었다는 에러
/*
 * 	2000개의 배열을 크롤링 하려는데 중간에 널값이 있거나 값이 빠지면 ArrayIndexOutOfBoundsException이 발생한다.
 * 	배열은 선언을 한 후 크기를 정해서 가져오기 때문에 가변이 가능한 List 를 사용하는 것이 좋고
 * 	고정적일 때는 사용이 위험한 경우가 많다.
 */
// 5장부터 8장까지 내용이 핵심. 배열은 1차배열까지만. 10.2장 자바의 컬렉션을 모르면 웹으로 넘어갈 수가 없음.
// 12장은 오라클 연동할 때 필요하기 때문에 굉장히 중요함

public class 배열_4 {

	public static void main(String[] args) {
		int[] arr = {1, 2};
		
		System.out.println(arr[2]);
		
	}
}

