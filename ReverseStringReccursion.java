
public class ReverseStringReccursion {
 public static void main(String[] args) {
        String str = "Object";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        else
        
     return reverseString(str.substring(1))+str.charAt(0); 
      
    }
}


//        bject O
//        ject bO
//        ect jbo
//        ct ejbo
//        t cejbO
//          tcejb