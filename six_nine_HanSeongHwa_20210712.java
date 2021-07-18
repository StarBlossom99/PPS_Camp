import java.util.*;

public class six_nine_HanSeongHwa_20210712 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String string = kb.next();
		kb.close();
		int score = 0;
		int score1 = 0;
		int score2 = 0;
		String string1 = "";
		String string2 = "";
		List<String> array = new ArrayList<String>();
		
		for(int i = 0;i<string.length();i++) {
			if(i<string.length()) {
				string1 = string.substring(i,i+1);
			}
			if(i+1<string.length()) {
				string2= string.substring(i,i+2);
			}
			
			if(string1.equalsIgnoreCase("s")){
				array.add(string1);
			}
			else if(i == string.length()-1){
				array.add(string1);
			}
			else {
				array.add(string2);
				i++;
			}
		}

		for(int i = 0;i<array.size();i++) {
			
			
			
			if(i<=8) {
				if(array.get(i).equalsIgnoreCase("s")) {
					if(array.get(i+1).equalsIgnoreCase("s") && array.get(i+2).equalsIgnoreCase("s")) {
						score = score + 10*3;
					}
					else if(array.get(i+1).equalsIgnoreCase("s") && !array.get(i+2).equalsIgnoreCase("s")){
						if(array.get(i+2).substring(0,1).equalsIgnoreCase("-")) {
							score1 = 0;
						}
						else {
							score1 = Integer.parseInt(array.get(i+2).substring(0,1));
						}
						score = score + 20 + score1;
					}
					else if(!array.get(i+1).equalsIgnoreCase("s")) {
						if(array.get(i+1).substring(0,1).equalsIgnoreCase("-")) {
							score1 = 0;
						}
						else {
							score1 = Integer.parseInt(array.get(i+1).substring(0,1));
						}
						if(array.get(i+1).substring(1,2).equalsIgnoreCase("-")) {
							score2 = 0;
						}
						else if(array.get(i+1).substring(1,2).equalsIgnoreCase("p")) {
							score2 = 10 - score1;
						}
						else {
							score2 = Integer.parseInt(array.get(i+1).substring(1,2));
						}
						score = score + 10 + score1 + score2;
					}
				}
				else if(array.get(i).substring(1,2).equalsIgnoreCase("p")){
					if(array.get(i+1).equalsIgnoreCase("s")) {
						score = score + 10*2;
					}
					else if(!array.get(i+1).equalsIgnoreCase("s")) {
						if(array.get(i+1).substring(0,1).equalsIgnoreCase("-")) {
							score1 = 0;
						}
						else {
							score1 = Integer.parseInt(array.get(i+1).substring(0,1));
						}
						score = score + 10 + score1;
					}	
				}
				else {
					if(array.get(i).substring(0,1).equalsIgnoreCase("-")) {
						score1 = 0;
					}
					else {
						score1 = Integer.parseInt(array.get(i).substring(0,1));
					}
					if(array.get(i).substring(1,2).equalsIgnoreCase("-")) {
						score2 = 0;
					}
					else {
						score2 = Integer.parseInt(array.get(i).substring(1,2));
					}
					score = score + score1 + score2;
				}
			}
			
			if(i==9) {
				if(array.get(i).equalsIgnoreCase("s")) {
					score = score + 10;
				}
				else if(array.get(i).substring(1,2).equalsIgnoreCase("p")) {
					score = score + 10;
				}
				else {
					if(array.get(i).substring(0,1).equalsIgnoreCase("-")) {
						score1 = 0;
					}
					else {
						score1 = Integer.parseInt(array.get(i).substring(0,1));
					}
					if(array.get(i).substring(1,2).equalsIgnoreCase("-")) {
						score2 = 0;
					}
					else {
						score2 = Integer.parseInt(array.get(i).substring(1,2));
					}
					score = score + score1 + score2;
				}
			}
			if(i==10) {
				if(array.get(i).equalsIgnoreCase("s")) {
					score = score + 10;
				}
				else if(!array.get(i).equalsIgnoreCase("s")) {
					if(array.get(i).length()==1) {
						if(array.get(i).substring(0,1).equalsIgnoreCase("-")) {
							score1 = 0;
						}
						else {
							score1 = Integer.parseInt(array.get(i).substring(0,1));
						}
						score = score + score1;
					}
					else {
						if(array.get(i).substring(0,1).equalsIgnoreCase("-")) {
							score1 = 0;
						}
						else {
							score1 = Integer.parseInt(array.get(i).substring(0,1));
						}
						if(array.get(i).substring(1,2).equalsIgnoreCase("-")) {
							score2 = 0;
						}
						else if(array.get(i).substring(1,2).equalsIgnoreCase("p")) {
							score2 = 10 - score1;
						}
						else {
							score1 = Integer.parseInt(array.get(i).substring(1,2));
						}
						score = score + score1 + score2;
					}
				}
			}
			if(i==11) {
				if(array.get(i).equalsIgnoreCase("s")) {
					score = score + 10;
				}
				else {
					if(array.get(i).substring(0,1).equalsIgnoreCase("-")) {
						score1 = 0;
					}
					else {
						score1 = Integer.parseInt(array.get(i).substring(0,1));
					}
					score = score + score1;
				}
			}
			
			score1 = 0;
			score2 = 0;
		}
		System.out.println(score);
	}
}
