package com.sist.main;
/*
 * 	try => 정상 수행이 가능한 문장
 * 	catch => try 안에 문장을 수행하는 과정에서 에러가 발생시 처리
 * 	----- 여러 개 사용이 가능하다, 예외 처리 클래스의 순서
 * 								 ----------------------
 * 								 크기 => 상속 => 상속도 => 위로 올라갈 수록 에러 처리의 기능이 많다.
 * 	Exception
 * 		|
 * 	RuntimeException
 * 		|		 
 * 	NumberFormatException, NullPointerException, ClasscastException
 * 
 * 	Exception => RuntimeExceptiion => NumberFormatException, NullPointerException, ClasscastException
 */
import java.util.*;

class A{}
class B extends A {}
public class 예외처리_4 {

	public static void main(String[] args) {
		try {
			A a = new A();
			B b = (B)a;
		} catch (ArithmeticException e) {
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
		} catch (NumberFormatException e) {}

	}

}
