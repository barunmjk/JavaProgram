package String;

import java.util.Scanner;

public class A73 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
 String [] str=s.split("[^0-9]+");
   String s1="";
       for(int i=0;i<str.length;i++)
    	   s1=str[i]+s1;
    	    
          char [] c=s1.toCharArray();
          countNoWord(c);
}
 public static void countNoWord(char [] c) {
	 int count=0;
     for(char ch:c)
     {
    	 if(ch>=48&&ch<=57)
    		 count++;
     }
     System.out.println("count is:"+count);
     
 }
 
}
