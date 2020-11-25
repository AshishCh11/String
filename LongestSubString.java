import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class LongestSubString {
	public static void main(String args[])
	{
	String s1="javaconceptoftheday";
	int len=0;
	String nonrep="";
	char [] ch=s1.toCharArray();
	
	LinkedHashMap<Character,Integer> lh= new LinkedHashMap<Character,Integer>();
	int i;
	for(i=0;i<ch.length;i++)
	{
		char a=ch[i];
		if(!lh.containsKey(a))
		{
			lh.put(a,i);
		}
		else
		{
			i=lh.get(a);
			lh.clear();
		}
	if(lh.size()>len)
	{
		len=lh.size();
		nonrep=lh.keySet().toString();
	}
	
	}
	System.out.println("non repeating substring "+nonrep);
	System.out.println("length :"+len);
	    }   
	}