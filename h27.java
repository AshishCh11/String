import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class h27 {

    // Complete the substrCount function below.
    static int palindromHalfLength(int i, String s) {
        int step = 1;
        char palChar = s.charAt(i-1);
        while (i-step>=0 && i+step<s.length()
                && s.charAt(i-step) == palChar
                && s.charAt(i+step) == palChar) step++;

        return step-1;
    }
    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        if (s.length() == 0) return 0;
        long res = 1;
        int countSimChar = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) == s.charAt(i)) {
                countSimChar++;
            }  else {
                res += palindromHalfLength(i, s);
                countSimChar = 1;
            }
            res += countSimChar;
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

//Special String Again
//Output Format
//
//Print a single line containing the count of total special substrings.
//
//Sample Input 0
//
//5
//asasd
//Sample Output 0
//
//7  (a s a s d asa sas)
//Explanation 0
//
//The special palindromic substrings of  are 



