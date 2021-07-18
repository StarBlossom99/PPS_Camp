import java.util.Scanner;
import java.math.BigInteger;

public class tweleve_six_HanSeongHWa_20210715 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int num = 0;
		num = kb.nextInt();
		BigInteger a1 = new BigInteger("1");
		BigInteger a2 = new BigInteger("1");
		BigInteger a3 = new BigInteger("2");
		
		if(num<3) {
			System.out.println(a1);
		}
		else {
			for(int i = 0;i<num-2;i++) {
				a3 = a1.add(a2);
				a1 = a2;
				a2 = a3;
			}
			System.out.println(a3);
		}
		kb.close();
	}
}
