
public class InsertCharAtPosition {
	 public static void main(String[] args) {
		  
	      StringBuilder str = new StringBuilder("Tutorial");
	      System.out.println("string = " + str);

	      // insert character value at offset 8
	      str.insert(0, 's');

	      // prints StringBuilder after insertion
	      System.out.print("After insertion = ");
	      System.out.println(str.toString());
	   }      
}