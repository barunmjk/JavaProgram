package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program6 {

	public static void main(String[] args) {
		Collection<Double> c1=new ArrayList<Double>();
		c1.add(176.4);c1.add(12.6);c1.add(28.8);c1.add(18.6);c1.add(77.7);
		System.out.println(c1);
         Iterator<Double> itr=c1.iterator();
         while(itr.hasNext()) {
        	Double d = itr.next();
        	if(d%2.0==1)
        		itr.remove();
        	
         }
         System.out.println(c1);
	}

}
