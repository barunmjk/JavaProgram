package comparatorProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopDriver {
 public static void main(String[] args) {
	List<Laptop> l1=new ArrayList<Laptop>();
	l1.add(new Laptop(123,"Lenevo",34000.90,"white"));
	l1.add(new Laptop(126,"Hp",35000.90,"black"));
	l1.add(new Laptop(173,"Asus",34000.90,"white"));
	l1.add(new Laptop(143,"Dell",34000.90,"white"));
	Collections.sort(l1,(l2,l3)->l2.brand.compareToIgnoreCase(l3.brand));
	l1.forEach(n->System.out.println(n));
	System.out.println("==================================================");
	Collections.sort(l1,(l2,l3)->-(l2.id-l3.id));
	l1.forEach(n->System.out.println(n));
}
}
