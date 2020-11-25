
public class RemoveSpaceWithoutFnlity {

 public static void main(String[] args) {

	        char c = ' ';
	        //int ascii = (int) c;
	    // System.out.println(ascii);

	        String str = " ash ish chavan";
	        char ch[] = str.toCharArray();

	        for (int i = 0; i < ch.length; i++) {
	            if (ch[i] == c) {
	            	// if (ch[i] == ascii) {
	            	continue;
	            } else {
	                System.out.print(ch[i]);
	            }
	        }

	    }

	}



