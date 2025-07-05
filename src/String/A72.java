package String;

import java.util.Scanner;

public class A72 {
   public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the String:");
	 String s=sc.nextLine();
	 int count =0;
	 char [] c=s.toCharArray();
	 for(char ch:c) {
		 if(ch>=48&&ch<=57)
			count++;
	 }
	 System.out.println(count);
	 sc.close();
}
}
