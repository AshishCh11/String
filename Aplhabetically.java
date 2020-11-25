import java.util.Arrays;

public class Aplhabetically {
	 
    public static String sortString(String inputString) 
    { 
         
        char tempArray[] = inputString.toCharArray(); 
          
        Arrays.sort(tempArray); 
        return new String(tempArray); 
    } 
       
         public static void main(String[] args) 
        { 
        String inputString = "geeksforgeeks"; 
        String outputString = sortString(inputString); 
          
        System.out.println("Input String : " + inputString); 
        System.out.println("Output String : " + outputString); 
    } 
}
