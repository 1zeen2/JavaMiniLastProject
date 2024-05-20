package com.sist.main;
/*
 * finally
 *   
 *   예외처리
 *     try {
 *         정상수행코드 
 *         => 에러 발생
 *     } catch {
 *         에러에 대한 대비 => 사전에 에러 방지 => 에러 복구
 *     } catch {
 *         에러에 대한 대비 => 사전에 에러 방지 => 에러 복구= 다시입력(continue)
 *     }
 *     Finally => 생략이 가능 (필요시에만 사용) {
 *     파일 닫기 / 서버닫기 / 오라클 닫기 ==> DDOS
 *     => try 수행, catch 수행 - 무조건 수행이 된다
 *     }
 *     흐름 :	에러가 없을 때 ==> 1 > 2 > 3 > 4 > 5 > 7
 *				에러가 있을 때 ==> 1 > 2 > 3 > 6 > 7
 *     	
 *     문장 1
 *     문장 2 
 *     try {
 *     	문장 3
 *     	문장 4	==> 에러 발생
 *     	문장 5
 *     } catch (예외 처리 클래스) {
 *     	문장 6
 *     } finally {
 *     	문장 7	(에러 여부와 관계 없이 무조건 수행)
 *     }
 */
public class 예외처리_8 {

   public static void main(String[] args) {
	   System.out.println("1");
	   System.out.println("2");
	   
	   try {
		   System.out.println("3");
		   System.out.println("4");
		   System.out.println("5");
	   } catch (Exception e) {		// 에러 발생 시에만 수행
		   System.out.println("에러 처리 => 6");	// printStackTrace(), getMessage()
	   } finally {
		   System.out.println("7");	// 파일 닫기, 오라클 닫기	 => 서버 부하가 심하다
	   }
   }

}