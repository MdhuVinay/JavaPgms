package pattern;

public class ExceptSomeDigit {
	public static void main(String[] args) {
		
		int[] arr={2, 3, 7};     //output: 1, 4, 5, 6, 8, 9, 10
		for (int i = 1; i <=10; i++) {
			boolean flag=false;
			for (int j = 0; j < arr.length; j++) {
				if (i==arr[j]) {
					flag=true;
				}
			}
			if (flag==false) {
				System.out.println(i);
			}
		}
	}
}
