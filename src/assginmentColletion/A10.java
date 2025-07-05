package assginmentColletion;

import java.util.ArrayList;
import java.util.Collection;

public class A10 {
public static void main(String[] args) {
	Collection<Integer> c1=new ArrayList<Integer>();
	c1.add(12);c1.add(15);c1.add(17);c1.add(19);
	System.out.println(c1);
	c1.removeAll(c1);
	System.out.println(c1);
   }

}
