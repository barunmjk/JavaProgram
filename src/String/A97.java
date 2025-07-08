package String;

import java.util.Scanner;

public class A97 {
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the String :");
	//mohan is here 
	//ereh
	String s=sc.nextLine();
	ReverseSenWord(s);
}
  public static void ReverseSenWord(String s) {
	  String word="";
	  for(int i=s.length()-1;i>=0;i--) {
		  char c=s.charAt(i);
		  if(c!=' ')
			  word=word+c;
		  if((c==' '||i==0)&&!word.isBlank()) {
			  System.out.println(word);
			  word="";
		  }
	  }
  }
}
