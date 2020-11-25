public class LongestWord {

public static void main(String[] args) {
	String s= "Today is the happiest day of my life by vijayakumar";
    String [] word = s.split(" ");
    String maxlethWord = "";
    for(int i = 0; i < word.length; i++){
     
    	if(word[i].length() >= maxlethWord.length()){
           maxlethWord = word[i];
     } 
}
     System.out.println(maxlethWord);  
     System.out.println(maxlethWord.length());

}
}