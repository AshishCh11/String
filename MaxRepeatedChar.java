
public class MaxRepeatedChar {

	public static void main(String[] args) {
		String s="baaabbbbbbbbbbbbbbaaaa";
		System.out.println(Rev(s));
	}
	static char Rev(String s)
	{
		char a=' ';
		int max=0;
		
		int aa[]=new int [500];
		for(int i=0;i<s.length();i++)
		{
			aa[s.charAt(i)]++;
		
			if(aa[s.charAt(i)]>max)
					a=s.charAt(i);
		}
		
     return a;
	
}
}