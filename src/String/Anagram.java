package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st String:");
      String s1=sc.nextLine();
      System.out.println("Enter the 2nd String:");
      String s2=sc.nextLine();
//      s1=s1.toLowerCase();
//      s2=s2.toLowerCase();
         char [] c1=s1.toCharArray();
         char [] c2=s2.toCharArray();
     Arrays.sort(c1);
     Arrays.sort(c2);
     System.out.println(c1);
     
     
     System.out.println(c2);
     if(c1.equals(c2))
    	 System.out.println("anagram");
	}
//  static boolean isAnagram(String s1,String s2) {
//	  
//	   char [] c1= s1.toCharArray();
//	   char [] c2= s1.toCharArray();
//	    
//	   
//	     Arrays.sort(c1);
//	     Arrays.sort(c2);
//
//return  Arrays.equals(c1, c2);	   
//}  
}
