package String;

import java.util.Arrays;
import java.util.Iterator;

public class Program5 {
 public static void main (String[] agrs) {
    String s1= new String ("abcd");
   s1=s1.intern();
   String s2="abcd";
   System.out.println(s1==s2);
//  byte [] b= s1.getBytes();
//   
//  for(int p:b)
//	   System.out.print(p+" ");
  
 char [] c= s1.toCharArray();
 for(char p:c)
	 System.out.print(p+" ");
 }
}
