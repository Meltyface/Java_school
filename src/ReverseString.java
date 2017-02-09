
public class ReverseString implements java.lang.CharSequence {

	private String s;

	public ReverseString(String s) {
		this.s = s;
	}

	private int fromEnd(int i) {
		return s.length() - 1 - i;
	}

	public char charAt(int i) {
		return s.charAt(fromEnd(i));
	}

	public int length() {
		return s.length();
	}

	public CharSequence subSequence(int start, int end) {
		StringBuilder sub = new StringBuilder(s.subSequence(fromEnd(end), fromEnd(start)));
		return sub.reverse();
	}

	public String toString() {
		StringBuilder s = new StringBuilder(this.s);
		return s.reverse().toString();

	}

	private static int random(int max) {
		return (int) Math.round(Math.random() * (max + 1));
	}

	public static void main(String[] args) {
		ReverseString s = new ReverseString("Java is a stupid language and really inefficient");

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		System.out.println("");

		int start = random(s.length() - 1);
		int end = random(s.length() - 1 - start) + start;
		System.out.println(s.subSequence(start, end));

		System.out.println(s);

	}
}