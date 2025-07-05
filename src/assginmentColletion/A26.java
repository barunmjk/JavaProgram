package assginmentColletion;

import java.util.HashMap;
import java.util.Map;

public class A26 {

	public static void main(String[] args) {
		 int [] a= {12,1,5,24,34,1,12,24};
		  printDuplicate(a);
	}
 public static void printDuplicate(int []a) {
	  Map< Integer, Integer> m=new HashMap<Integer, Integer>();
	  for(int p:a)
	  {
		 int val= m.getOrDefault(p, 0);
		  m.put(p, val+1);
	  }
	  for(Map.Entry<Integer , Integer> entry:m.entrySet())
	  {
		  if(entry.getValue()>1)
			 System.out.println(entry.getKey());
	  }
 }
}
