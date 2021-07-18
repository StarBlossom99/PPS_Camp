public class two_three_HanSeongHwa_20210713 {
	public static void main(String [] args) {
		String[] array = {"dog","racecar","car"};
		
		String result = longestCommonPrefix(array);
		System.out.println(result);
		
		
	}
	public static String longestCommonPrefix(String[] strs) {
		int min = 0;
		int index = 0;
		String string;
		String result = "";
		boolean judge = true;
		
		for(int i = 0;i<strs.length;i++) {
			if(i==0) {
				min = strs[i].length();
				index = 0;
			}
			else {
				if(min>strs[i].length()) {
					min = strs[i].length();
					index = i;
				}
			}
		}
		
		for(int i = 0;i<min;i++) {
			if(i==0) {
				string = strs[index].substring(0,1);
				for(int j =0;j<strs.length;j++) {
					if(!string.equalsIgnoreCase(strs[j].substring(0,1))) {
						judge = false;
					}
				}
				if(judge == false) {
					result ="";
					return result;
				}
				else {
					result = string;
				}
			}
			else {
				string = strs[index].substring(0,i+1);
				for(int j = 0;j<strs.length;j++) {
					if(!string.equalsIgnoreCase(strs[j].substring(0,i+1))) {
						judge = false;
					}
				}
				if(judge == false) {
					result = strs[index].substring(0,i);
					return result;
				}
				else {
					result = string;
				}
			}
			judge = true;
		}
		return result;
	}
}
