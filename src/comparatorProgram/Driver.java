package comparatorProgram;

import java.util.*;

public class Driver {
       public static void main(String[] args) {
    		List<Employ> l1=new ArrayList<>();
//		Employ e1=new Employ(123,"mohan",34444.94,23);
//	
//		l1.add(e1);
		l1.add(new Employ(121,"jhon",36000.90,24));
		l1.add(new Employ(126,"jack",37000.90,27));
		l1.add(new Employ(127,"PMohan",36000.90,24));
		l1.add(new Employ(128,"Rack",34000.90,27));
		l1.add(new Employ(129,"jhonny",36000.90,24));
		l1.add(new Employ(120,"aam",38000.90,27));
	 for (Employ e : l1) {
		System.out.println(e);
		
	}
	 System.out.println("==================before Sorting============");
	 Collections.sort(l1, new AgeComparator());

	 for (Employ e : l1) {
		System.out.println(e);
		
	}
	 System.out.println("======================");
	 l1.forEach(n->System.out.println(n));
	 System.out.println("=================after name sorting======");
	 Collections.sort(l1, (e1,e2)->e1.name.compareToIgnoreCase(e2.name));
	 l1.forEach(n->System.out.println(n));
	 System.out.println("======================");
	 l1.forEach(n->System.out.println(n));
	 System.out.println("=================after salary sorting======");
	 Collections.sort(l1, (e1,e2)->-(int)(e1.salary-e2.salary));
	 l1.forEach(n->System.out.println(n));
	}
}
