package pattern;

public class Pattern01 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			char ch = 'A';
			for (int j = 0; j < i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
