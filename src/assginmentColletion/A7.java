package assginmentColletion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class A7 {
  public static void main(String[] args) {
	Collection<Integer> c1=new ArrayList<Integer>();
	c1.add(32);c1.add(12);c1.add(32);c1.add(22);c1.add(16);c1.add(15);c1.add(19);
//    int max= Collections.max(c1);
    int min=Collections.min(c1);
    System.out.println(min);
//    System.out.println("max nunmber in collection"+max);
  }
}
