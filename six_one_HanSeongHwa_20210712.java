import java.util.Scanner;

public class six_one_HanSeongHwa_20210712{
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		long num = 0;
		num = kb.nextLong();
		kb.close();
		
		
		
		for(int i = 0;i<20;i++) {
			if(num >= Math.pow(2, i) && num <= Math.pow(2,i+1)) {
				if(num == 1) {
					System.out.println(num);
					System.exit(0);
				}
				num = num - (int)Math.pow(2,i);
				System.out.println(num*2);
			}
		}
		
	}
}
