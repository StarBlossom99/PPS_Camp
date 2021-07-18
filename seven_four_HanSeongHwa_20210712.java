import java.util.*;

public class seven_four_HanSeongHwa_20210712 {
	public static void main(String [] args) {
		Scanner kb = new Scanner(System.in);
		
		String string;
		string = kb.next();
		kb.close();
		List<String> array = new ArrayList<String>();
		
		for(int i = 0; i<string.length();i++) {
			array.add(string.substring(i));
		}
		
		array.sort(null);
		
		for(int i = 0;i<string.length();i++) {
			System.out.println(array.get(i));
		}
	}
}
