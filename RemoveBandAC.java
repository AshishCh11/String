import java.util.Arrays;

public class RemoveBandAC {

	public static void main(String[] args) {
		String s="abrambacbasc";
		System.out.println("arter Remove ");
		Remove(s,"ac","b");
	}
	
	static void Remove(String s,String s1,String s2)
	{
		int ptr=0;
		char [] a1=s.toCharArray();
		int i;
		for(i=0;i<a1.length;i++)
		{
			if(a1[i]=='b')
				continue;
			else if(i+1<a1.length && a1[i]=='a' && a1[i+1]=='c' )
			{
				i++;
			}
			else
			{
				a1[ptr++]=a1[i];
			}
		}
	 char [] re=Arrays.copyOfRange(a1,0,ptr)	;
  System.out.println(new String(re));
		
	}

}
