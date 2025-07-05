package collectionFrameWork;

import java.util.*;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Collection<Integer> c1=new ArrayList<>();
       c1.add(16);c1.add(17);c1.add(12);c1.add(14);c1.add(15);c1.add(13);
       System.out.println(c1);
       Iterator<Integer> itr = c1.iterator();
            while(itr.hasNext()) {
            	System.out.print(itr.next()+" ");
            }
	}

}
