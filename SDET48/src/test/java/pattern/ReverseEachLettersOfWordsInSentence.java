package pattern;

public class ReverseEachLettersOfWordsInSentence {
	public static void main(String[] args) {
		String s="I       am in     Ooty";
		String[] splitArr = s.split("\\s+");
		for (int i = 0; i < splitArr.length; i++) {
			String a = splitArr[i];
			for (int j = a.length()-1; j >=0 ; j--) {
				System.out.print(a.charAt(j));
			}
			System.out.print(" ");
		}		
	}
}
