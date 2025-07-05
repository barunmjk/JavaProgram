package String;

import java.util.Scanner;

public class A96 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String :");
	String s=sc.nextLine();
	String [] str=s.split("[^A-Za-z]+");
     for(String s1:reverse(str))
    	 System.out.print(s1+" ");
		 
}
  public static String [] reverse(String [] str) {
	   int start =0,end=str.length-1;
	    while(end>start) {
	    	 String temp=str[start];
	    	 str[start]=str[end];
	    	 str[end]=temp;
	    	 start++;end--;
	    }
	   return str;
  }
}
