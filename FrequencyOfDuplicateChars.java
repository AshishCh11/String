import java.util.Scanner;

public class FrequencyOfDuplicateChars {
	public static void main(String args[])
	{
	    char c,ch;
	    int k=0;
	    String s1="ashish";
	    char [] chr=s1.toCharArray();
	    for(c='A';c<='z';c++)
	    {
	    
	    	for(int j=0;j<chr.length;j++){
	    	 
	    	ch=chr[j];
	    	if(c==ch)
	    	{
	    		k++;
	    	} 
	    }
	    if(k>0){
	    	System.out.println(c+"-->>"+k);
	    }
	 k=0;
	    } 
	}
}
