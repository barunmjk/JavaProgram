package String;

import java.util.Scanner;

public class EnterUnderScoge {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		String [] str=s.split("\s+");
		enterUnder(str);
}
 public static void enterUnder(String [] str) {
	 StringBuilder sb=new StringBuilder();
	 for(String s:str)
		 sb.append(s).append(s.substring(s.length())).append("_");
	 System.out.println(sb);
 }
 
}
