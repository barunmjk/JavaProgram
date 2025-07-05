package list;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(14); l1.add(17); l1.add(16);
        System.out.println(l1);
        l1.add(1, 18);
        System.out.println(l1);
//        Object x=16;
//        l1.remove(2);
//        System.out.println(l1);
      ListIterator<Integer> itr= l1.listIterator();
       while(itr.hasNext()) {
    	   System.out.print(itr.next()+" ");
    	    
       }
       while(itr.hasPrevious()) {
   	    System.out.print(itr.previous()+" ");
   	    
      }
	}

}
