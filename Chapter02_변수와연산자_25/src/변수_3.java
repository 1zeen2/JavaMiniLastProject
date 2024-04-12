/*
 *	국어	영어	수학	=>	총점	/	평균	/	학점	(A , B , C , D , F)
 */
public class 변수_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor 	= 90;
		int eng 	= 80;
		int math	= 75;
		int total	= kor + eng + math;
		
		double avg	= total/3.0;
			
			System.out.println("국어 점수" + kor);
			System.out.println("영어 점수" + eng);
			System.out.println("수학 점수" + math);
			System.out.printf("평균: %.2f", avg);		//	"평균: %.2f" 는 되는데 "평균: %.2d"는 왜 안되는지
		
	}

}
