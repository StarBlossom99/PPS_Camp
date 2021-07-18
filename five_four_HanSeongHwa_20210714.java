
public class five_four_HanSeongHwa_20210714 {
	public static void main(String[] args) {
		String string = "2003-03-01";
		
		int result = dayOfYear(string);
		System.out.println(result);
	}
	public static int dayOfYear(String date) {
		int year = 0;
		int month = 0;
		int day = 0;
		int check = 0;
		int result = 0;
		year = Integer.parseInt(date.substring(0,4));
		month = Integer.parseInt(date.substring(5,7));
		day = Integer.parseInt(date.substring(8));
		
		if((year%4)==0 && (year%100)!=0 || (year%400)==0){
			check =1;
		}
		
		if(month == 1) {
			result = day;
		}
		else if(month == 2) {
			result = 31 + day;
		}
		else if(month == 3) {
			if(check ==1 ) {
				result = 60 + day;
			}
			else{
				result = 59 + day;
			}
		}
		else if(month == 4) {
			if(check ==1 ) {
				result = 91 + day;
			}
			else{
				result = 90 + day;
			}
		}
		else if(month == 5) {
			if(check ==1 ) {
				result = 121 + day;
			}
			else{
				result = 120 + day;
			}
		}
		else if(month == 6) {
			if(check ==1 ) {
				result = 152 + day;
			}
			else{
				result = 151 + day;
			}
		}
		else if(month == 7) {
			if(check ==1 ) {
				result = 182 + day;
			}
			else{
				result = 181 + day;
			}
		}
		else if(month == 8) {
			if(check ==1 ) {
				result = 213 + day;
			}
			else{
				result = 212 + day;
			}
		}
		else if(month == 9) {
			if(check ==1 ) {
				result = 244 + day;
			}
			else{
				result = 243 + day;
			}
		}
		else if(month == 10) {
			if(check ==1 ) {
				result = 274 + day;
			}
			else{
				result = 273 + day;
			}
		}
		else if(month == 11) {
			if(check ==1 ) {
				result = 305 + day;
			}
			else{
				result = 304 + day;
			}
		}
		else if(month == 12) {
			if(check ==1 ) {
				result = 335 + day;
			}
			else{
				result = 334 + day;
			}
		}
		return result;
	}
}
