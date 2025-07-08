package String;

import java.util.Scanner;

public class A104 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String :");
	String s=sc.nextLine();
	String [] str=s.split("\s+");
	firstLowercase(str);
}
public static void firstLowercase(String [] str) {
	StringBuilder sb=new StringBuilder();
	for(String s:str) {
		sb.append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).append(" ");
	}
	System.out.println(sb);
}
}
