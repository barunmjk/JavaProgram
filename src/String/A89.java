package String;

import java.util.Scanner;

public class A89 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the 1st String  :");
	  String s1=sc.nextLine();
	  s1=s1.toLowerCase();
	  System.out.println("Enter the 2nd String :");
	  String s2=sc.nextLine();
	  s2=s2.toLowerCase();
	  if(anagram(s1,s2))
		  System.out.println("Anagram");
	  else 
		  System.out.println("not anagram");
}
  public static boolean anagram(String s1,String s2) {
	     if(s1.length()!=s1.length())
	    	 return false;
	      char [] c1=s1.toCharArray();
	    	 int [] freq2 =getFrequency(c1);
	    	   char [] c2=s2.toCharArray();
		    	 int [] freq1= getFrequency(c2);
		    	 
		    	 for(int i=0;i<26;i++) {
		    		 if(freq1[i]!=freq2[i])
		    			 return false;
		    	 }
		    	 return true;
  }
  public static int[] getFrequency(char[] c ) {
	  int [] freq=new int[26];
	  
	  for(char ch:c)
		  freq[ch-97]++;
	  
	  return freq;
  }
}
