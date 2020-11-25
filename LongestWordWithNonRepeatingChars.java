import java.util.Arrays;

public class LongestWordWithNonRepeatingChars {

	public static void main(String args[])
	{
		String s="ashish chaqwet bbgh trdsi qwerrtyuio  ";
        String [] words=s.split(" ");
        String word="",maxword="";
        char [] mx=new char[0];
        int i,j,k,l=words.length;
        for(i=0;i<l;i++)
        {
        word=words[i];
        char a[]=word.toCharArray();
       for(j=0;j<a.length;j++)
       {
    	   for(k=j+1;k<a.length;k++)
    	   {
    			    if( a[j]!=a[k])
    			    {
  			    	if(a.length>mx.length)
 			    	{
    					 mx=a;
    				 }
    				 }

       	   }
    	   }
       
         
       
       
        System.out.println(mx);
	}
	}

