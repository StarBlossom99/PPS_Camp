import java.util.*;

public class five_five_HanSeongHwa_20210714 {
	public static void main(String[]args) {
		int n = 3;
		List<String> array = fizzBuzz(n);
		
		System.out.println(array);
	}
	public static List<String> fizzBuzz(int n){
		List<String> array = new ArrayList<String>();
		for(int i =  1;i<=n;i++) {
			if((i%3 == 0) && (i%5 == 0)) {
				array.add("FizzBuzz");
			}
			else if (i%3 == 0) {
				array.add("Fizz");
			}
			else if(i%5 == 0) {
				array.add("Buzz");
			}
			else {
				array.add(Integer.toString(i));
			}
		}
		return array;
	}
}
