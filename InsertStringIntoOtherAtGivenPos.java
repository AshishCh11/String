
public class InsertStringIntoOtherAtGivenPos {
	 public static void main(String[] args) 
	    { 
	        StringBuffer str = new StringBuffer("ashish chavan"); 
	            
	        System.out.println("string = " + str); 
	  
	        // insert boolean value at offset 8 
	            str.insert(7, "subhash ");
	       // str.insert(7, 's');  for char
	  
	        // prints stringbuffer after insertion 
	        System.out.print("After insertion = "); 
	        System.out.println(str.toString()); 
	    } 
	
}
