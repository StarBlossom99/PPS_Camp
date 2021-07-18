import java.io.*;
import java.util.StringTokenizer;

public class eight_eight_HanSeongHWa_20210715 {
	public static void main(String[] args) throws IOException {
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter kb2 = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(kb.readLine());
		
		for(int i = 0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(kb.readLine()," ");
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			kb2.write((m+n) + "\n");
		}
		              
		kb2.flush();
		
	}
}
