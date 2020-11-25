
public class StringToIntWithoutParsInt {
	 public static void main (String args[])
		 {
				String s1="740";
				int i,result=0;
				for(i=0;i<s1.length();i++)
				{
					result=result*10;
					result=result+s1.charAt(i)-'0';
					
				}
			System.out.println(result);
			
			}
		}
