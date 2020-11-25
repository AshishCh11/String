import java.util.Scanner;

public class LongestSubstringWithRepeatingChars {
	 public static void main(String[] args) {
	       
	       String s="javaconceptoftheday";
	       String  maxWord = "", newWord = "";
	        int l = s.length(), i, j, max = 0;
	        for (i = 0; i < l; i++) 
	        {
	            newWord = s.substring(i);
	            for (j = i + 1; j < l; j++)
	               // if (newWord.indexOf(s.charAt(j)) + i != j)
	            	 if (i+newWord.indexOf(s.charAt(j)) != j)
	                    break;
	            if (j - i > max)
	            {
	                max = j - i;
	                maxWord = s.substring(i, j);
	            }
	        }
	        System.out.println(maxWord);
	        System.out.println(max);
	    }
}
