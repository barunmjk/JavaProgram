package map_Hierarchy;
import java.util.*;
import java.util.Map.Entry;

public class A94 {
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the String:");
   String s=sc.nextLine();
      char [] c=s.toCharArray();
 maxString(c);
}
   public static void  maxString(char [] c) {
	   Map<Character, Integer> m=new HashMap<>();
   for(char ch:c) {
	   if ((ch>=65&& ch<=90)||(ch>=97&&ch<=122)) {
	 
	   int val=m.getOrDefault(ch, 0);
	   m.put(ch, val+1);
	   
	   }
	   }
   int max=0;
   
     for(Map.Entry<Character, Integer> entry :m.entrySet())
     {
    	 
    	 if(entry.getKey()>max)
    		 max=entry.getKey();
    	 System.out.println(max);
     }
    
   }
}
