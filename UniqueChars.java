import java.text.ParseException;
import java.util.Scanner;

public class UniqueChars {
	public static void main(String args[])
	{
		String s="abcdabceef fgglpab";
	    char [] ch= s.toCharArray();
	    int i;
	    int [] cnt=new int [200];
	    char c;
	    for(i=0;i<ch.length;i++)
	    if(ch[i]!=' ')
	    	{
	    		cnt[ch[i]]++;
	    	}
	    	for(i=0;i<ch.length;i++)
	    	{
	    	if(cnt[ch[i]]==1)
	    	{
	    	System.out.print(ch[i]);	
	    	}
	    	}
	    }	
    
} 