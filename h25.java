import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class h25 {

    // Complete the makeAnagram function below.
  
		public static int numberNeeded(String first, String second) {
        int[] lettercounts = new int[26];
        for(char c : first.toCharArray()){
            lettercounts[c-'a']++;
        }
        for(char c : second.toCharArray()){
            lettercounts[c-'a']--;
        }
        int result = 0;
        for(int i : lettercounts){
            result += Math.abs(i);
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = numberNeeded(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

//Strings: Making Anagrams
//Input Format
//
//The first line contains a single string, .
//The second line contains a single string, .
//
//Constraints
//
//The strings  and  consist of lowercase English alphabetic letters ascii[a-z].
//Output Format
//
//Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.
//
//Sample Input
//
//cde
//abc
//Sample Output
//
//4
