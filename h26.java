import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class h26 {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
    int j=0;
    int count=0;
    for(int i=1;i<s.length();i++){
        if(s.charAt(j) == s.charAt(i)){
            count++;
            j++;
        }
        else {
            j++;
        }
    }
    return count;
}
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

//Alternating Characters
//Sample Input
//
//5
//AAAA
//BBBBB
//ABABABAB
//BABABA
//AAABBB
//Sample Output
//
//3
//4
//0
//0
//4
//Explanation
//
//The characters marked red are the ones that can be deleted so that the string doesn't have matching consecutive characters.




