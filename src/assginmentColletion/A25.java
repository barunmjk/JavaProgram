package assginmentColletion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A25 {

	public static void main(String[] args) {
	 
		 List<Integer> l1=new ArrayList<Integer>();
		 l1.add(12);l1.add(15);l1.add(13);l1.add(15);
		 printDuplicate(l1);
	}
   public static void printDuplicate(List <Integer>l1) {
	   Map<Integer , Integer> m=new HashMap<Integer, Integer>();
	   for(Integer p:l1) {
		  int val= m.getOrDefault(p, 0);
		   m.put(p, val+1);
		   
	   }
	    for(Map.Entry<Integer, Integer> entry: m.entrySet()) {
	    	if(entry.getValue()>1)
	    		 System.out.println(entry.getKey());
	    				 
   } }
}
