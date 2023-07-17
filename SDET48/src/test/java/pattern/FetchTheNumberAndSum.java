package pattern;

public class FetchTheNumberAndSum {
	public static void main(String[] args) {
		addDigit();
		productDigit();
	}
	
	
	public static void addDigit() {
		String s="ts01se100s3";
		String[] numbers = s.split("\\D+"); //split based on non digit
		int sum=0;
		for (String num : numbers) {
			if (!num.isEmpty()) {
				int n = Integer.parseInt(num);
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}

	
	
	public static void productDigit() {
		String s="ts01se100s3";
		String[] numbers = s.split("\\D+"); //split based on non digit
		int product=1;
		for (String num : numbers) {
			if (!num.isEmpty()) {
				int n = Integer.parseInt(num);
				product=product*n;
			}
		}
		System.out.println(product);
	}

}
