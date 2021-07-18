import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class six_five_HanSeongHwa_20210712 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int insert = 0;
		int num = 0;
		num = kb.nextInt();
		
		List<Integer> array = new ArrayList<Integer>();
		
		
		for(int i = 0;i<num;i++) {
			insert = kb.nextInt();
			
			if(!array.contains(insert)) {
				array.add(insert);
			}
		}
		kb.close();
		array.sort(null);
		
		for(int j = 0;j<array.size();j++) {
			System.out.print(array.get(j) + " ");
		}
	}
}
