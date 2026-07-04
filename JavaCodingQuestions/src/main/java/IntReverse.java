
public class IntReverse {
	
	public static void main(String[] args) {
		int number = 1234;
		int originalnumber = number;
		int reverseNumber = 0;
		
		while(number > 0) {
			int reminder = number %10;
			reverseNumber =(reverseNumber*10)+reminder;
			number = number/10;
		}
		
		System.out.println(reverseNumber);
	}

}
