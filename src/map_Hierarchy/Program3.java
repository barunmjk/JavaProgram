package map_Hierarchy;

import java.util.*;

public class Program3 {

	public static void main(String[] args) {
	    int [] a= {12,18,19,18,19,20,18,19,29};
            getAllUnique(a);
	}
 public static void  getAllUnique(int[] a) {
	 Map<Integer, Integer> m1=new LinkedHashMap<Integer, Integer>();
	 for(int x:a) {
	int val=m1.getOrDefault(x, 0);
	 
	 m1.put(x, val+1);
	 
	 }
	 
	 for(int k:m1.keySet()) {
		 if(m1.get(k)==1)
			 System.out.println(k);
	 }
 }
}
