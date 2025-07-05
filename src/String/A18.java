package String;

import java.util.Scanner;

public class A18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the anything to want reverse: ");
		String s=sc.nextLine();
	char [] c=	s.toCharArray();
	char [] p=  reverseToZero(c);
	  for(char x:p)
		  System.out.print(x+" ");
	}
 public static char [] reverseToZero(char [] c) {
	 char [] b=new char[c.length];
	 for(int i=0;i<c.length;i++)
		 b[i]=c[c.length-1-i];
	 
	 return b;
 }
 
}
