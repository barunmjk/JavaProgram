package String;

import java.util.Scanner;

public class A16 {

	public static void main(String[] args) {
 
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the charcter:");
     String s=sc.nextLine();
     char [] c=s.toCharArray();
     int sum=0; 
       for(char p:c)
    	   if(isNumericChar(p))
    		  sum=sum+(p-48);
       System.out.println(sum);
	}
  public static boolean  isNumericChar(char c){
	     if(!(c>=48&& c<=57))
	    	 return false ;
	   return true; 	 
  }
}
