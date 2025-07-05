package String;

import java.util.Scanner;

public class A103dusra {
  public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter the String :");
	 String s=sc.nextLine();
	   String [] str= s.split("[^A-za-z]+");
	 firstCapitalUpperCase(str);
}
  public static void firstCapitalUpperCase(String [] str) {
	  StringBuilder sb=new StringBuilder();
	    for(String s1:str)
	    {
	    	if(s1.length()>0)
	    	{
	    		s1=s1.trim();
	    	sb.append(Character.toUpperCase(s1.charAt(0))).append(s1.substring(1)).append(" ");
	    	}	
	    }
	    System.out.println(sb.toString());
  }
}
