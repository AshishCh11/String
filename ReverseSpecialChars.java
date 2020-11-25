
public class ReverseSpecialChars {
public static void main(String args[])
{
	String s="@as!&ch";
	char [] a=s.toCharArray();
	int l=0;
	int r=a.length-1;
	while(l<r)
	{
	if(!Character.isAlphabetic(a[l]))
			l++;
	else if(!Character.isAlphabetic(a[r]))
				r--;
	else 
			{   
		char temp=a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
			}
}
System.out.println(s);
System.out.println(a);
}
}



