package assginmentColletion;

import java.util.HashMap;
import java.util.Map;

public class A24 {

	public static void main(String[] args) {
		 int [] a= {12,32,33,43,12,43};
		 getUnique(a);
	}
   public static void getUnique(int [] a) {
	     Map<Integer, Integer> m=new HashMap<Integer, Integer>();
	     for(int p:a) {
	     int val=m.getOrDefault(p, 0);
	      m.put(p, val+1);
	     }
	  for(Map.Entry<Integer, Integer> entry:m.entrySet())
	  {
		   if(entry.getValue()==1)
		   {
			   System.out.println(entry.getKey());
		   }
	  }	   
   }
}
