package map_Hierarchy;

import java.util.*;

public class Program4 {

	public static void main(String[] args) {
	    int [] a= {18,19,18,19,12,20,18,19,29};
            getAllDuplicate(a);
 
	 }
 public static void  getAllDuplicate(int [] a) {
	    Map<Integer, Integer> m=new LinkedHashMap<Integer, Integer>();
	    for(int p:a) {
	   int val =m.getOrDefault(p,0);
	   
	   m.put(p, val+1);
	    }
	    System.out.println(m);
	    for(int x:m.keySet()) {
	    	if(m.get(x)>1)
	    		System.out.println(x);
	    }
 }
}
