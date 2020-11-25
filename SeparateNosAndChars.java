
public class SeparateNosAndChars {
	public static void main(String[] args) 
	{   
		int i;
		String letter="";
          String s="1a2b3c4defgh567jkl";
         
        	    char[] arr=s.toCharArray();
        	    String s1="";
                String s2="";
                
        	    for(char ch:arr){

        	        if(!(ch>47 & ch<57)){

        	            s1=s1+ch;
        	        }
        	        else
        	        {
        	        	s2+=ch;
        	        	
        	        }
        	            }
        	    System.out.println("Alphabets :"+s1);
        	    System.out.println("Numbers :"+s2);
        	    
}
}