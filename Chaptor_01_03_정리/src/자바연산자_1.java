/*
 * 	연산자
 * 	1. 단항연산자
 * 		= 증감 연산자	: 반복문에서 주로 사용
 * 			++, --	: 1증가, 1 감소
 * 
 * 		= 전치 연산자	: 먼저 증가한 후 연산 처리
 * 			int a = 10;
 * 			int b = ++a;
 * 
 * 		= 후치 연산자	: 연산 처리 후 증가
 * 			int a = 10;
 * 			int b = a++;
 * 			b = a;
 * 			b = a + 1;
 * 
 * 		= 부정 연산자  : 조건문에서 주로 사용
 * 			무조건 결과 값 : true / false
 * 			!(5 < 6 && && 6 == 8) ===> 6은 5보다 크고 8과 같지 않다.
 * 
 * 		= 형변환 연산자	: 실수 -> 정수, 문자 -> 정수, 정수 -. 문자 ...
 * 		  ---------
 * 			데이터 형에 대한 형변환 ==> 클래스 형변환(is-a, has-a)
 * 			-----------------
 * 				데이터 형의 크기
 * 							----------> UpCasting
 * 				byte < char < int < long < double
 * 							<---------- DownCasting
 * 				=> UpCasting 	=>	자동 변경
 * 				<= DownCasting <=	강제 변경	=> 형변환 연산자
 * 			예)
 * 				int a = 'A';
 * 						--- char => int 자동 변경
 * 				double d = 10;
 * 						   -- int => double로 자동 변경
 * 				int a = 10.5;
 * 						---- double => int로 자동 변경이 되지 않아 강제 형변환을 해야 함
 * 
 * 			*** boolean은 true / false이기 때문에 형변환이 없다.
 * 			*** 필요한 경우에만 형변환을 사용한다
 * 
 * 	2. 이항연산자 => 연산 대상이 2개인 경우
 * 		=> 산술 연산자
 * 			= 비트 연산자(&, |, ^), 쉬프트 연산자(<<, >>), 반전 연산자(~) ==> 거의 사용하지 않음
 * 			  											|양수 -> 음수
 * 														|음수 -> 양수 에 사용
 * 			=> +, -, *, /, % => 5개의 연산
 *			 
 *			=>	+ 는 덧셈, 문자열 결합 기능을 가지고 있다.
 *			   	/ 는 0으로 나눌 수 없으여, 정수/정수는 정수가 나온다.
 *			   	% 는 왼쪽 편의 부호만 남는다 (5 % -3 = 2), (-5 % 3 = -2) 
 *			----------------------------------------------------------------------
 *			다른 데이터 형일 경우에는 큰 데이터 형으로 결과값이 나온다
 *			*** int 이하 (byte, char)의 연산 결과는 int.
 *				byte + byte = int
 *				byte + char = int
 *				char + byte = int
 * 		=> 비교 연산자
 * 		=> 논리 연산자
 * 			&& => AND 연산자 => 로그인 같이 전부 맞아야 하는 경우에 사용
 * 			|| => OR  연산자 => 둘 중에 하나만 맞으면 되는 경우에 사용
 * 
 * 		=> 대입 연산자
 * 			+=	=> 여러개 증가 가능
 * 			-= 	=> 여러개 감소 가능
 * 			*=, /=, %= 는 사용 빈도가 없다.
 * 
 * 	3. 삼항연산자	=> 소스를 줄이기 위해 주로 사용.
 * 		(조건) ? 값 1 : 값 2
 * 		----
 * 		true 	=> 값 1 수행
 * 		false 	=> 값 2 수행
 * 		---------------------- if ~ else
 * 
 * 		HTML => 자바 연결
 * 		<%
 * 			if(curpage > 1) {
 * 		<%
 * 			<a href = "list.jsp?page=<%=curpage%>">
 * 		%>
 * 			} else {
 * 			
 * 				}
 * 		%>
 * 
 * 		<a href = "list.jsp?page=<%curpage>1?curpage-1:curpage%>">
 * 		
 * 		=> 산술연산자 = 형변환연산 결합 => 통계, 평균 => 단독으로 사용
 * 		=> 비교연산자, 논리연산자 => 제어문에서 주로 사용
 * 								if / for
 * 		---------------------------------------------------------------
 * 		자바는 누가 필요한 것을 빠르게 찾는지가 중요하다
 * 		80%는 이미 제작되어있고 20%만 찾아서 조립하는 방식
 */
public class 자바연산자_1 {

		public static void main(String[] args) {
			
			}
		}
