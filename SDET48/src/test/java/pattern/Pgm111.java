package pattern;

public class Pgm111 {
	public static void main(String[] args) {
		String s="a0a2b1c3a9";  //aabcccaaaaaaaaa
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='0' && ch[i]<='9') {
				for (int j = ch[i]-48; j>0; j--) {
					System.out.print(ch[i-1]);
				}
			}
		}
	}
}
