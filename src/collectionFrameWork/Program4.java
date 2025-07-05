package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Collection<String> c1=new ArrayList<>();
       c1.add("Mohan");    c1.add("Kaushik");   c1.add("Vickky");   c1.add("sohan");   c1.add("rohan");
       System.out.println(c1);
       Iterator<String> itr = c1.iterator();
       while(itr.hasNext()) {
    	   System.out.print(itr.next()+" ");
    	   
       }
	}

}
