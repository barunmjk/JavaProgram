package collectionFrameWork;

import java.util.*;
 

public class RemoveProgram {
	public static void main(String[] args) {
		
	
       Collection c1=new ArrayList();
      c1.add(13);c1.add(15); c1.add(11); c1.add(17); c1.add(19);
      System.out.println(c1);
      c1.remove(11);
      System.out.println(c1);
     Collection c2= new ArrayList();
     c2.add(13);c2.add(15);
     System.out.println(c2);
     c1.removeAll(c2);
     System.out.println(c1);
     
      
      
	}
}
