package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopDriver {
public static void main(String[] args) {
	List<Laptop> l1=new ArrayList<Laptop>();
	l1.add(new Laptop(12,"Lenevo",23442.09));
	l1.add(new Laptop(13,"Asus",33442.09));
	Collections.sort(l1);
	for(Laptop l2:l1)
		System.out.println(l2);
}
}
