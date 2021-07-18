import java.util.*;

public class thirteen_three_HanSeongHWa_20210715 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int num = 0;
		int length = 0;
		num = kb.nextInt();	
		length = kb.nextInt();
		
		int fruit = 0;
		List<Integer> array = new ArrayList<Integer>();
		for(int i = 0;i<num;i++) {
			fruit = kb.nextInt();
			array.add(fruit);
		}
		array.sort(null);
		
		for(int i = 0;i<num;i++) {
			fruit = array.get(i);
			if(length>=fruit) {
				length++;
			}
			else {
				break;
			}
		}
		System.out.println(length);
	}
}
