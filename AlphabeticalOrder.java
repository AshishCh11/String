import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {

    public static void main(String[] input)
    {
    	 int n;
         String temp;
         Scanner s = new Scanner(System.in);
         System.out.print("Enter number of names you want to enter:");
         n = s.nextInt();
         String names[] = new String[n];
         Scanner s1 = new Scanner(System.in);
         System.out.println("Enter all the names:");
         for(int i = 0; i < n; i++)
         {
             names[i] = s1.nextLine();
         }
         for (int i = 0; i < n; i++) 
         {
             for (int j = i + 1; j < n; j++) 
             {
                 if (names[i].compareTo(names[j])>0) 
                 {
                     temp = names[i];
                     names[i] = names[j];
                     names[j] = temp;
                 }
             }
         }
         System.out.print("Names in Sorted Order:");
         for (int i = 0; i < n - 1; i++) 
         {
             System.out.print(names[i] + ",");
         }
         System.out.print(names[n - 1]);
         
     }
 }	
    	
    	
    	
    	
    	
    
//        int i, j;
//        String temp;
//        Scanner scan = new Scanner(System.in);
//        
//        String names[] = new String[5];
//		
//        System.out.print("Enter 3 Names/Words : ");
//        for(i=0; i<3; i++)
//        {
//            names[i] = scan.nextLine();
//        }
//		
//        //System.out.println("\nSorting Words/Names in Alphabetical Order...\n");
//        for(i=0; i<3; i++)
//        {
//            for(j=1; j<3; j++)
//            {
//                if(names[j-1].compareTo(names[j])>0)
//                {
//                    temp=names[j-1];
//                    names[j-1]=names[j];
//                    names[j]=temp;
//                }
//            }
//        }
//		
//        System.out.print("Words/Names Sorted in Alphabetical Order Successfully..!!");
//		
//        System.out.println("\nNow the List is :\n");
//        for(i=0;i<3;i++)
//        {
//            System.out.println(names[i]);
//        }
//        
//    }
//
//}
