import java.util.*;

public class seven_two_HanSeongHwa_20210712 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		
		int ten = 0;
		int one = 0;
		String string = "";
		String num = "";
		
		n1 = kb.nextInt();
		n2 = kb.nextInt();
		kb.close();
		
		List<String> array = new ArrayList<String>();
		
		for(int i = n1;i<n2+1;i++) {
			num = Integer.toString(i);
			ten = i/10;
			one = i%10;
			if(i>=10) {
				if(ten == 1) {
					string = "one";
				}
				else if(ten == 2) {
					string = "two";
				}
				else if(ten == 3) {
					string = "three";
				}
				else if(ten == 4) {
					string = "four";
				}
				else if(ten == 5) {
					string = "five";
				}
				else if(ten == 6) {
					string = "six";
				}
				else if(ten == 7) {
					string = "seven";
				}
				else if(ten == 8) {
					string = "eight";
				}
				else if(ten == 9) {
					string = "nine";
				}
				
				if(one == 1) {
					string = string.concat(" one");
				}
				else if(one == 2) {
					string = string.concat(" two");
				}
				else if(one == 3) {
					string = string.concat(" three");
				}
				else if(one == 4) {
					string = string.concat(" four");
				}
				else if(one == 5) {
					string = string.concat(" five");
				}
				else if(one == 6) {
					string = string.concat(" six");
				}
				else if(one == 7) {
					string = string.concat(" seven");
				}
				else if(one == 8) {
					string = string.concat(" eight");
				}
				else if(one == 9) {
					string = string.concat(" nine");
				}
				else {
					string = string.concat(" zero");
				}
			}
			else {
				if(one == 1) {
					string = "one";
				}
				else if(one == 2) {
					string = "two";
				}
				else if(one == 3) {
					string = "three";
				}
				else if(one == 4) {
					string = "four";
				}
				else if(one == 5) {
					string = "five";
				}
				else if(one == 6) {
					string = "six";
				}
				else if(one == 7) {
					string = "seven";
				}
				else if(one == 8) {
					string = "eight";
				}
				else if(one == 9) {
					string = "nine";
				}
			}
			array.add(string.concat(" " +num));
		}
		array.sort(null);
		
		for(int i = 0;i<array.size();i++) {
			if(i%10 == 9) {
				if(array.get(i).length() >7) {
					System.out.print(Integer.parseInt(array.get(i).substring(array.get(i).length()-2)));
				}
				else {
					System.out.print(Integer.parseInt(array.get(i).substring(array.get(i).length()-1)));
				}
				System.out.println(" ");
			}
			else {
				if(array.get(i).length() >7) {
					System.out.print(Integer.parseInt(array.get(i).substring(array.get(i).length()-2)) + " ");
				}
				else {
					System.out.print(Integer.parseInt(array.get(i).substring(array.get(i).length()-1)) + " ");
				}
			}
		}
	}
}
