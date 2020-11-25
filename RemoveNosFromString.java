
public class RemoveNosFromString {
	
	public static void main(String[] args){
		int i;
		String letter="";
		String s="as5hi40sh";

			    char[] arr=s.toCharArray();
			    String s1="";

			    for(char ch:arr){

			        if(!(ch>47 & ch<57)){

			            s1=s1+ch;
			        }
			            }
			    System.out.println(s1);
}
}
			    

//	public static void main(String[] args){
//	    String s= "as5hi40sh";
//	    char[] ch=s.toCharArray();
//	    int m = 0;
//		   char[] chr=new char[50];
//		   char[] k = {'0','1','2','3','4','5','6','7','8','9'};
//		   for(int i = 0 ; i < ch.length ; i++){
//		       for(int j = 0 ; j <k.length ; j++){  
//		           if(ch[i]==k[j]){
//		               m--;
//		               break;
//		           }else{
//		               chr[m]=ch[i];
//		           }
//		       }
//		       m++;
//		     }
//		System.out.println(chr);
//	}
//}
	
	
	    
	    
	    
