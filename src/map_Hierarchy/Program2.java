package map_Hierarchy;

import java.util.*;

public class Program2 {

	public static void main(String[] args) {
	 Map<Integer, Integer> m1=new HashMap<Integer, Integer>();
	 m1.put(1, 3);m1.put(2, 4);m1.put(3, 6);
//	 m1.forEach((k,v)->System.out.println(k +":is:"+v+":times"));
	 Set<Map.Entry<Integer, Integer>> mse= m1.entrySet();
//	   this is first way to entry print by lambda expression
//	   mse.forEach(n->System.out.println(n.getKey()+" is "+n.getValue()+" times"));
//	 for(Map.Entry<Integer,Integer> me :mse)
//		 System.out.println(me.getKey()+" is "+me.getValue()+"  times");
//	 this is 2nd way to entry print 
	Iterator <Map.Entry<Integer, Integer>>  itr=  mse.iterator();
	    while(itr.hasNext()) {
	    Map.Entry<Integer, Integer> m=	itr.next();
	    	System.out.println(m.getKey() +" is "+m.getValue()+ " times");
	    }
	  }
}
