package String;

import java.util.Scanner;

public class A71 {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
	char [] c=	s.toCharArray();
		removeDulicate(c);
	}
     public static void  removeDulicate(char [] c) {
    	    String str ="";
    	 int [] freq=new int[256];  
    	    for(char c1:c)
    	    	freq[c1]++;
//    	      freq[c[i]]++;
    	    
    	   for(int i=0;i<freq.length;i++)
    	   {
    		   if(freq[i]>=1) {
    		  	str=str+(char)i;
    			    
    		   }
    	   }
    	   System.out.print(str);
     }
}
