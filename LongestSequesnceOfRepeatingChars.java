
public class LongestSequesnceOfRepeatingChars {

	public static void main(String[] args) {
		
		String s="xxtttttiiiiiiiiyyxy";
		int i,j,l=s.length();
		String word="",maxword="";
		int c=0,max=0;
		char ch=' ';
		for(i=0;i<l;i++)
		{
			word=s.substring(i);
		
			for(j=i+1;j<l;j++)
			{
				if(i+word.indexOf(s.charAt(j))==j)
				break;
				
			}
			if(j-i>max)
			{
				max=j-i;
				ch=s.charAt(i);
			}
				}
			System.out.println(max);
	       System.out.println(ch);		
	}
			
}