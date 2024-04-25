// 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다. (실적 0~100)1) 사번별 실적을 출력하시오.
// 사원(1) 50
// 1월 실적의 총점과 평균을 출력하시오.
// 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오.
public class 문자열배열_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] work = {50, 40, 35, 12, 70};
		int sum = 0;
		
		int max = work[0];
		int min = work[0];
		for (int i = 0; i < work.length; i ++) {
			
			sum += work[i];
			if (max < work[i])
				max = work[i];
			
			if (min > work[i])
				min = work[i];
			System.out.println("사원" + (i + 1) + "의 실적 : " + work[i]);
		}
		System.out.println(sum);
		System.out.printf("평균 : %.2f\n", sum/(double)work.length);
		System.out.println(max);
		System.out.println(min);
		
		

	}

}
