import java.util.*;

public class fourteen_seven_HanSeongHwa_20210715 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int num = 0;
		num = kb.nextInt();
		int p = 0;
		int len = 0;
		int len2 = 0;
		
		String[] input = new String[num];
		
		for(int i = 0;i<num;i++) {
			input[i] = kb.next();
		}
		
		Arrays.sort(input, new Comparator<String>() {
			@Override
			public int compare(String str1,String str2) {
				return Integer.compare(str1.length(),str2.length());
			}
		});
		int j;
		for(int i = 0;i<num;i++) {
			len = input[i].length();
			
			for(j = i+1;j<num;j++) {
				len2 = input[j].length();
				
				if(len != len2) {
					break;
				}
			}
				Arrays.sort(input,i,j);
				i = j-1;
			
		}
		System.out.println(input[0]);
		for(int i =1;i<num;i++) {
			if(input[i-1].equals(input[i])) {
				continue;
			}
			System.out.println(input[i]);
			
		}
		
	}
}
