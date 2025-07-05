package collectionFrameWork;

import java.util.*;

public class CantainAllProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Collection c1= new ArrayList();
   c1.add(12);c1.add(17);c1.add(19);c1.add(20); c1.add(12);c1.add(17);
   System.out.println(c1);
   Collection c2= new ArrayList();
   c2.add(12);c2.add(17);c2.add(19);
   System.out.println(c2);
   System.out.println(c1.containsAll(c2));
   System.out.println(c1.size());
   System.out.println(c1.hashCode());
   System.out.println(c2.hashCode());
   Collection c3= new ArrayList();
   c3.add(12);c3.add(17);c3.add(19);
   System.out.println(c2.equals(c3));
   c1.forEach(n->System.out.println(n));
   
	}

}
