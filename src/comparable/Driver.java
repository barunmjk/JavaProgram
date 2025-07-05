package comparable;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		List<Employ> l1=new ArrayList<Employ>();
//		  Employ e=new Employ("JACK",123,69696.69,69);
		l1.add(new Employ("Mohan",234,41300.99,29));
 
		l1.add(new Employ("Ravi",254,41300.99, 24));
		l1.add(new Employ("Rohan",234,41300.99,24));
		l1.add(new Employ("Johan",345,35000.3,21));
		 
		Collections.sort(l1);
		for(Employ e1:l1)
			System.out.println(e1+" ");
	}
}
