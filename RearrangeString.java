class RearrangeString
{ 
    static final int MAX_CHAR = 26; 
       
static String arrangeString(String str) 
    { 
        int char_count[] = new int[MAX_CHAR]; 
        int sum = 0; 
       
        // Traverse the string 
        for (int i = 0; i < str.length(); i++) 
        { 
            // Count occurrence of uppercase alphabets 
            if (Character.isUpperCase(str.charAt(i))) 
                char_count[str.charAt(i)-'A']++; 
       
            //Store sum of integers 
            else
                sum = sum + (str.charAt(i)-'0'); 
              
        } 
       
        String res = ""; 
       
        // Traverse for all characters A to Z 
        for (int i = 0; i < MAX_CHAR; i++) 
        { 
            char ch = (char)('A'+i); 
       
            // Append the current character 
            // in the string no. of times it 
            //  occurs in the given string 
            while (char_count[i]-- != 0) 
                res = res + ch; 
        } 
       
        // Append the sum of integers 
        if (sum > 0) 
            res = res + sum; 
       
        // return resultant string 
        return res; 
    } 
      
    // Driver method 
    public static void main(String args[])  
    { 
        String str = "ACCBA10D2EW30"; 
        System.out.println(arrangeString(str)); 
    } 
} 