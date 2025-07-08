package String;

import java.util.Scanner;

public class A103tisra {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String :");
	String s=sc.nextLine();
	 String [] str=s.split("\s+");
	  String s1=firstUppercase(str);
	  System.out.println(s1);
	
}
  public static String  firstUppercase(String [] str) {
	StringBuilder sb=new StringBuilder();
	  for(String s:str)
		sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
		
	return  sb.toString();
  }
}
