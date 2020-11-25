import java.io.IOException;
import java.io.StringReader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharsWithAsteriks {
	public static class StringHistogram
	{
	  public static void main(String[] args) throws IOException
	  {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Please insert string: ");
	    String s = sc.nextLine();
	    sc.close();
	    System.out.println(s);

	    StringReader r = new StringReader(s);

	    Map<Character, Integer> histogram = new TreeMap<Character, Integer>();
	    int c;
	    while ((c = r.read()) !=-1) {
	      Integer count = histogram.get((char) c);   //integer class converts string to int and vice versa
	      if (count == null)                         // char is A to Z  c=given String
	        count = 0;
	     histogram.put((char) c, count+1);  //count intialize from 0. in while condition.
	     
	    }
	    r.close();
	    for (Entry<Character, Integer> entry : histogram.entrySet())
	      System.out.println(entry.getKey() + " (" + entry.getValue() + ") " + createAsterisk(entry.getValue()));
	  }

	  static String createAsterisk(int number) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < number; i++)
	      sb.append("*");
	    return sb.toString();
	  }
	}
}
