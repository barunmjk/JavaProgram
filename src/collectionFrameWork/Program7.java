package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program7 {
       public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<Integer>();
		c1.add(13);c1.add(16); c1.add(12); c1.add(17); c1.add(18); c1.add(24); c1.add(29);
		System.out.println(c1);
	 
	Iterator<Integer> itr=	c1.iterator();
		while(itr.hasNext()) {
			  int n= itr.next();
			  if(n%2==1)
				  break;
			  
		}
		 itr.forEachRemaining(n->System.out.println("element of"+n));
	}
}
