import java.util.*;

public class seven_five_HanSeongHwa_20210713 {
	public static void main(String [] args) {
		Scanner kb = new Scanner(System.in);
		
		String string = kb.next();
		kb.close();
		String result = "";
		
		
		List<Integer> array = new ArrayList<Integer>();
		
		for(int i = 0;i<string.length();i++) {
			array.add(Integer.parseInt(string.substring(i,i+1)));
		}
		
		array.sort(null);
		
		for(int i = 0;i<array.size();i++) {
			if(i==0) {
				result = Integer.toString(array.get(array.size()-1));
			}
			else {
				result = result.concat(Integer.toString(array.get(array.size()-1-i)));
			}
		}
		
		System.out.println(result);
	}
}