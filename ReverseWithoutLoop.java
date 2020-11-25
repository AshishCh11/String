import java.util.Arrays;

public class ReverseWithoutLoop {
static void getRev(String st,int pos)
{
if(pos > -1)

	 System.out.print(st.charAt(pos));

	getRev(st, pos-1);

}

	public static void main(String args[])
	{
		String s="ashish";
		int l=s.length()-1;
	
		getRev(s,l);
	}
	
	
	}