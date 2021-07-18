import java.util.*;

public class six_two_HanSeongHwa_20210715 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Queue<Integer> a = new LinkedList<>();
		
		int n = 0;
		int k = 0;
		int temp = 0;
		n = kb.nextInt();
		k = kb.nextInt();
		
		for(int i = 0;i<n;i++) {
			a.add(i+1);
		}
		
		StringBuilder string = new StringBuilder();
		string.append('<');
		
		while(a.size()>1) {
			for(int i =0;i<k-1;i++) {
				temp = a.poll();
				a.offer(temp);
			}
			
			string.append(a.poll()).append(", ");
		}
		kb.close();
		
		string.append(a.poll()).append('>');
		System.out.println(string);
	}
}
