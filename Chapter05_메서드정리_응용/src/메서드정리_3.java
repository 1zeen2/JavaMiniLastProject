
public class 메서드정리_3 {
	static void swap(int[] arr) {
		System.out.println("변경 전 : arr[0] = " + arr[0] + "arr[1] = " + arr[1]);
		int temp = arr[0];
		arr [0] = arr[1];
		arr[1] = temp;
		System.out.println("변경 후 : arr[0] = " + arr[0] + "arr[1] = " + arr[1]);
	}

	public static void main(String[] args) {
		// Call by Reference
		int[] temp = {100, 200};
		swap(temp);
		System.out.println("main => temp 값 : temp [0] =" + temp[0] + ", tema[1] =" + temp[1]);
	}

}
