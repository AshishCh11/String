
public class RemoveDuplicates {
	 public static void main(String[] args) {
	        String str1 = "aaabbbabacdeabbbba";
	        System.out.println(removeDuplicateChars(str1));
	    }
	 
	    private static String removeDuplicateChars(String sourceStr) {
	        // Store encountered letters in this string.
	        char[] chrArray = sourceStr.toCharArray();
	        String targetStr = "";
	 
	        // Loop over each character.
	        for (char c : chrArray) {
	            // See if character is in the target
	            if (targetStr.indexOf(c) == -1) { //indexOf returnd first occurence
	                
	            	targetStr += c; // Use StringBuilder as shown below
	            }
	        }
	        return targetStr;
	    }
	
}
