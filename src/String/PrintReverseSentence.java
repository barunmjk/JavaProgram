package String;

import java.util.Scanner;

public class PrintReverseSentence {
  public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the String:");
	String s=sc.nextLine();
	printReverseSentenceWithOutSplit(s);
}
  public static void printReverseSentenceWithOutSplit(String s) {
	  String word="";
	  for(int i=s.length()-1;i>=0;i--)
	  {
		  char c=s.charAt(i);
		  if(c!=' ')
			  word=c+word;
		  if((c==' ' ||i==0)&&!word.isBlank())
		  {
			  System.out.print(word+" ");
			  word="";
		  }  
	  }
  }
}
