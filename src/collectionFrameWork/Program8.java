package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Program8 {
 public static void main(String[] args) {
	Collection<Integer> c1=new ArrayList<Integer>();
	c1.add(37);c1.add(31);c1.add(24);c1.add(24);c1.add(25);c1.add(28);c1.add(29);
//    c1.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
c1=	c1.stream().filter(n->n%2==0).collect(Collectors.toList());
	System.out.println(c1);
    
 }
}
