
public class ReverseString1 {
	public static void main(String args[])
	{
        String old="ashish chavan";
        String new1="";
        int i,j;
        String word;
        String [] words=old.split(" ");
        
        for(i=0;i<words.length;i++)
        {
        	word=words[i];
        	
        	for(j=word.length()-1;j>=0;j--)
        	{
        		new1=new1+word.charAt(j);
        		
        	}
        	new1=new1+" ";
        }
        System.out.println(new1);
}
	 }



