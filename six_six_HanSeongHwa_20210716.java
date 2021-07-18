import java.io.*;
import java.util.*;

public class six_six_HanSeongHwa_20210716 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wf = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(bf.readLine());
		
		String[] array = new String[num];
		
		for(int i = 0;i<num;i++) {
			array[i] = bf.readLine();
		}
		
		Arrays.sort(array, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				if(str1.length() == str2.length()) {
					int a = 0, b = 0;
					for(int i = 0;i<str1.length();i++) {
						if(str1.charAt(i)>='1' && str1.charAt(i)<='9') {
							a = a + (str1.charAt(i) - '0');
						}
						if(str2.charAt(i)>='1' && str2.charAt(i)<= '9') {
							b = b + (str2.charAt(i) - '0');
						}
					}
					if(a==b) {
						return str1.compareTo(str2);
					}
					return Integer.compare(a, b);
				}
				return Integer.compare(str1.length(), str2.length());
			}
		});
		
		for(String s: array) {
			wf.write(s + "\n");
		}
		wf.flush();
	}
}
