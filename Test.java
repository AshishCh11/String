
public class Test {

	public static void main(String[] args) {

		String s = "Ashish";

		String rev=revString(s);
		System.out.println(rev);
		
	}

	private static String revString(String s) {
		if(s.isEmpty())
		{
			return s;
		}
		else
		{
			return revString(s.substring(1))+s.charAt(0);
			
			
		}
		
		
		
	}

}
