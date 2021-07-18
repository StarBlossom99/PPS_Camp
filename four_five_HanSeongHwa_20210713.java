
public class four_five_HanSeongHwa_20210713{
	public static void main(String [] args) {
		int n = 8;
		boolean result = isPowerOfFour(n);
		
		System.out.println(result);
	}
	public static boolean isPowerOfFour(int n) {
		boolean result = false;
		for(int i = 0;i<32;i++) {
			if(n == Math.pow(4,i)) {
				result = true;
			}
		}
		return result;
	}
}
