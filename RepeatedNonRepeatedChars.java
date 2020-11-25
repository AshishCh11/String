import java.util.HashMap;
import java.util.Scanner;

public class RepeatedNonRepeatedChars {
	
	public static void main(String args [])
	{
		String s="ashishchavan";
		
		HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
		char [] ch=s.toCharArray();
		
		for(char c:ch)
		{
			if(!hm.containsKey(c))
			{
				hm.put(c,1);	
			}
			else
			{
				hm.put(c,hm.get(c)+1);
			}
		}
		 for(char c:ch)
		 {
			 if(hm.get(c)==1)
			 {
				 System.out.println("first non repeating char :"+c);
			   break;
			 }
		 }
		 for(char c :ch)
		 {
			 if(hm.get(c)>1)
			 {
				 System.out.println("first repeated char :"+c);
				 break;
			 }
		 }
	
    }

	
	
	
}
