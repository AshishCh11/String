import java.util.Arrays;

public class AnagramString {
	public static void main(String args[])
	{
       IsAnagram("ashish", "shaish");
       IsAnagram("ashish", "shisha");
	}
static void IsAnagram(String s1,String s2)
{
	String copy1=s1.replaceAll("\\s","");
	String copy2=s2.replaceAll("\\s","");
	
	Boolean status=true;
	if(copy1.length()!=copy2.length())
	{
		status=false;
	}
	
	else
	{
		char [] c1=copy1.toLowerCase().toCharArray();
		char[] c2=copy2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);;
		Arrays.sort(c2);
		
		status=Arrays.equals(c1,c2);
		
	}
	
	if(status)
	{
		System.out.println(s1+" and "+s2+ " is anagram");
	}
	else
	{
		System.out.println(s1+" and "+s2+ " not anagram");
	}
}
	
}

