
public class four_six_HanSeongHwa_20210714 {
	public static void main(String[] args) {
		int num = 38;
		int result = addDigits(num);
		
		System.out.println(result);
	}
	public static int addDigits(int num) {
		int result = 0;
		String string = "";
		
		while(num>=10) {
			string = Integer.toString(num);
			for(int i = 0;i<string.length();i++) {
				result = result + Integer.parseInt(string.substring(i,i+1));
			}
			num = result;
			result = 0;
		}
		return num;
	}
}
