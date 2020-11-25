
public class RmoveWhiteSpace {
	 public static void main(String args[]){
			String s="ashish chavan ";
			char [] st=s.toCharArray();
			String new1="";
			
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)!=' ')
				{
					new1=new1+s.charAt(i);
				}
			}
			System.out.println(new1);
		}
}
