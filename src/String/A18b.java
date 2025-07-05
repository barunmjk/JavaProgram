package String;

import java.util.Scanner;

public class A18b {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the anything to want reverse: ");
		String s=sc.nextLine();
	char [] c=	s.toCharArray();
	char [] p=  reverse(c);
	  for(char x:p)
		  System.out.print(x+" ");
	}
 public static char [] reverse(char [] c) {
	 char [] b=new char[c.length];
	 for(int i=c.length-1;i>=0;i--)
		 b[c.length-1-i]=c[i];
	 
	 return b;
 }
 
}
