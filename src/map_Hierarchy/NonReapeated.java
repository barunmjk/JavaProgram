package map_Hierarchy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class NonReapeated {
    public static void main(String[] args) {
		int [] a={1,1,2,2,3,4,5,5,6,6};
		List<Integer> l1=nonReapeat(a);
		System.out.println(l1);
	}
    public static List<Integer> nonReapeat(int [] a){
    	Map<Integer, Integer> m=new  HashMap<Integer, Integer>();
    	List<Integer> l1=new ArrayList<Integer>();
    	for(int p:a)
    	{
    		int val =m.getOrDefault(p, 0);
    		m.put(p,val+1);
    		
    	}
    	for(Map.Entry<Integer, Integer> entry:m.entrySet()) {
    	    if(entry.getValue()==1)
    	    	l1.add(entry.getKey());
    	}
    	return l1;
    }
}
