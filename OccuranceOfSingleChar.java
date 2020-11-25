
public class OccuranceOfSingleChar {

	public static void main(String[] args) {

       String s="ashish chavan";
      int count=s.length()-s.replaceAll("a","").length();
      
       System.out.println(count);

	}

}
