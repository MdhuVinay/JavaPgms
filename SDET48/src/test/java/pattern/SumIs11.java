package pattern;

public class SumIs11 {
	public static void main(String[] args) {
		int[] arr= {1,3,5,2,8,9,10};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]+arr[j]==11) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}
