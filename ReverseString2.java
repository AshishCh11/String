
public class ReverseString2 {
	
  public static void main(String args[])
  {
	  String old="ashish chavan";
	  System.out.println(old);
	  System.out.println(getRev(old));
  }
   static String getRev(String neww)
   {
	  String [] words=neww.split(" ");
	  String newww="";
	  int i,j;
	  for(i=words.length-1;i>=0;i--)
	  {
		  newww=newww+" "+words[i];
	  }
		return  newww=newww+" ";
	  
 }
	
	
}
