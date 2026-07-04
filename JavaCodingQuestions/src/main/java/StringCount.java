
public class StringCount {
	
	public static void main(String[] args) {
		System.out.println("First Class in MacBook");
		
		String inputString = "Hello World";
		String output = "";
		String[] splitWords = inputString.split(" ");
		System.out.println(splitWords);
		for (String word : splitWords) {
			String reversedWord = "";
			char[] charArray = word.toCharArray();
			for (int i = charArray.length-1; i >= 0; i--) {
				reversedWord += charArray[i];
			}
			System.out.println("Reversed Word is "+reversedWord);
			output += reversedWord+" ";
			
		}
		
		System.out.println(output);
	}

}
