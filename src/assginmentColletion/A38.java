package assginmentColletion;

import java.util.ArrayList;
import java.util.List;

public class A38 {
   public static void main(String[] args) {
	List<Integer > l1=new ArrayList<Integer>();
	 List<Integer> l2=new ArrayList<Integer>();
	 

	 l1.add(1); l1.add(3); l1.add(5); l1.add(8);
	 l2.add(1); l2.add(4); l2.add(6); l2.add(8);
	 

	List<Integer> l3=minus(l1,l2);
	System.out.println(l3);
}
   public static List<Integer> minus(List<Integer>l1,List<Integer>l2){
	          
	      l1.removeAll(l2);
	      
	      return l1;
   }
}
