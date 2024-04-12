/*
 *		값 교환
 */
public class 변수_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	a	=	100;
		int	b	=	200;
		int	temp=	a;	//	int a 의 값을 임시로 저장
		
		a = b;			//	int b의 값을 a에 저장
		b = temp;		//	int temp의 값을 b에 저장
			System.out.println("a = "+a);
			System.out.println("b = "+b);
	}

}
