package map_Hierarchy;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		 Map<Integer, String> m=new HashMap<Integer, String>();
		 m.put(1, "Mohan"); m.put(3, "Ravi");m.put(3, "Suresh");m.put(4, "gukesh");
          System.out.println(m);
         System.out.println(m.get(3));
         System.out.println(m.containsKey(3));
         System.out.println(m.containsKey(5));
         System.out.println(m.containsValue("gukesh"));
         System.out.println(m.containsValue("mukesh"));
         Set<Integer> s=  m.keySet();
         System.out.println(s);
         Collection<String> c1= m.values();
         System.out.println(c1);
         System.out.println(m.getOrDefault(2, "dukesh"));
//        Set<Map.Entry<Integer, String> > msp=  m.entrySet();
//        System.out.println(msp);
        
         System.out.println(m.putIfAbsent(5, "nana patekar"));
         System.out.println(m);
         m.replace(3, "Suresh", "sohan");
         System.out.println(m);
       
         
	}

}
