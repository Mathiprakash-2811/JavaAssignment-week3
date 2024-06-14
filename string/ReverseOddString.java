package string;

public class ReverseOddString {

	public static void main(String[] args) {
		 String test = "I am a software tester";

	       
	        String[] words = test.split("\\s+");

	       
	        for (int i = 0; i < words.length; i++) {
	           
	            if (i % 2 != 0) {
	               
	                words[i] = reverseWord(words[i]);
	            }
	        }

	        StringBuilder result = new StringBuilder();
	        for (String word : words) {
	            result.append(word).append(" ");
	        }

	       
	        String finalResult = result.toString().trim();

	       
	       
	        System.out.println("Modified String: " + finalResult);
	    }

	    
	    private static String reverseWord(String word) {
	        StringBuilder reversed = new StringBuilder(word);
	        return reversed.reverse().toString();

	}

}
