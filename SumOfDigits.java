import java.util.Scanner;

public class SumOfDigits {
	 public static void main(String[] args) {
		
		 String s="abcd12ef12";
		 char [] ch=s.toCharArray();
		 int i;
		 char c;
		 int sum=0;
		 for(i=0;i<ch.length;i++)
		 {
			c=ch[i];
			if(Character.isDigit(c))
			{
				int b=Integer.parseInt(String.valueOf(c));
				sum+=b;
			}
			
		 }
		 System.out.print(sum);
	 }
}
