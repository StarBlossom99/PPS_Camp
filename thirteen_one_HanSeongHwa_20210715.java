import java.io.*;
import java.util.StringTokenizer;

public class thirteen_one_HanSeongHwa_20210715 {
	public static void main(String[] args) throws IOException {
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(kb.readLine()," ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int count = 0;
		
		int[] array = new int[m];
		
		for(int i =0;i<m;i++) {
			array[i] = Integer.parseInt(kb.readLine());
		}
		
		for(int i = m-1;i>=0;i--) {
			if(array[i]<=n) {
				count = count + (n/array[i]);
				n = n % array[i];
			}
		}
		kb.close();
		
		System.out.println(count);
	}
}
