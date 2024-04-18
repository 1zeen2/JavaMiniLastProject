import java.util.Scanner;
/*
 * "C:\Windows\System32\notepad.exe" ===> 메모장
 * "C:\Program Files\WindowsApps\Microsoft.Paint_11.2402.32.0_x64__8wekyb3d8bbwe\PaintApp\mspaint.exe" ===> 그림판
 * "C:\Program Files\Google\Chrome\Application" ====> 크롬
 */
import java.io.*;
import java.rmi.server.ExportException;
public class 제어문_선택문_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("메모장, 그림판, 크롬 >>");
		
		switch (scan.next()) {
			case "메모장":
				Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe");
				break;
			case "그림판":
				Runtime.getRuntime().exec("C:\\Program Files\\WindowsApps\\Microsoft.Paint_11.2402.32.0_x64__8wekyb3d8bbwe\\PaintApp\\mspaint.exe");
				break;
			case "크롬":
				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
		}
		
		

	}

}
