
public class five_six_HanSeongHwa_20210715 {
	public static void main(String[] args) {
		String string = "race a car";
		
		boolean judge = true;
		judge = isPalindrome(string);
		System.out.println(judge);
	}
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		boolean result = true;
		int a = 0;
		int b = s.length()-1;
		char alpha;
		char beta;
		
		while(a<b) {
			alpha = s.charAt(a);
			beta = s.charAt(b);
			if(!isAlpha(alpha)) {
				a++;
				continue;
			}
			if(!isAlpha(beta))  {
				b--;
				continue;
			}
			if(alpha != beta) {
				result = false;
			}
			a++;
			b--;
		}

		return result;
	}
	private static boolean isAlpha(char c) {
		return Character.isDigit(c) || Character.isLetter(c);
	}
}
