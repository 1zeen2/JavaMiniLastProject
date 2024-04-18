// 12, 1, 2 = 겨울 / 3, 4, 5 = 봄 / 6, 7, 8 = 여름 / 9, 10, 11 = 가을
import java.util.Scanner;
public class 제어문_선택문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.println("달 입력 : ");
	int month = scan.nextInt();
	
	switch (month) {
	case 3: case 4: case 5:						// if (month == 3 || month == 4 || month == 5)
		System.out.println("봄 입니다.");			// if (month >= 3 && <= 5)
		break;
	case 6: case 7: case 8:
		System.out.println("여름 입니다.");
		break;
	case 9: case 10: case 11:
		System.out.println("가을 입니다.");
		break;
	case 12: case 1: case 2:
		System.out.println("겨울 입니다.");
		break;
	default :
		System.out.println("1 ~ 12 사이의 숫자만 입력해주세요.");
	}
	
	}

}
