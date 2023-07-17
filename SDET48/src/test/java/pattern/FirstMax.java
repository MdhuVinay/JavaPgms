package pattern;

public class FirstMax //edited in github by madhu
{
	public static void main(String[] args) {
		int[] arr= {7,-3,0,1,2,-9};
		int fmin = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (fmin>arr[i]) {
				fmin=arr[i];
			}
		}
		System.out.println(fmin);
	}
}
