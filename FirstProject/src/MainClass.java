/*
 * 프로그램 : 컴퓨터에 명령을 수행하게 만든다.
---------------------------------------------
 * 데이터 저장	=========>	데이터 가공	==========>	가공된 데이터 출력
 * 	ㅣ					(유저의 요청)					ㅣ
 * 	ㅣ											솔루션
 * 	ㅣ											윈도우 (명령 프롬프트)	=>	Application
 * 	ㅣ
 * 	ㅣ											SI/SM
 * 	ㅣ											---------------------------------------------
 * 	ㅣ											브라우저				=>	Web	Application
 * 	ㅣ											핸드폰				=>	Mobile	Application
 * 	ㅣ											---------------------------------------------
 * 	ㅣ
 * 	ㅣ			=====>	연산자	/	제어문
 * 	ㅣ					------------------	반복	(묶어서 사용)	=>	메소드
 * 	ㅣ
 * 	ㅣ
 * 	한개		:	변수
 * 	여러개	:	배열(같은 데이터)	/	클래스(다른 데이터)
 * 	==>	단점	(프로그램 종료시에 자동 삭제)
 *	==>	RAM
 *	-----------------------------------------------
 *	영구적인 저장 장치
 *		1)파일
 *		2)RDBMS	=>	오라클
 */
import java.io.*;
public class MainClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\javaDev\\movie.txt");
		int i = 0;
		StringBuffer data=new StringBuffer();
		while((i=fr.read())!=-1) // 파일 끝날 때 종료 => -1	EOF
		{
			data.append((char)i);	
		}
		fr.close();
		System.out.println(data.toString());
	}

}
