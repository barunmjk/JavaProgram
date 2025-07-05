package assginmentColletion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A36 {

	public static void main(String[] args) {
	  List<Integer> l1=new ArrayList<Integer>();
	     l1.add(1);  l1.add(3); l1.add(5); l1.add(6);
	     List<Integer> l2=new ArrayList<Integer>();
	     l2.add(4);  l2.add(6); l2.add(8);
	   System.out.println(union(l1,l2)); 
	     
	}
  public static Set<Integer> union(List<Integer> l1,List<Integer>l2){
	     Set<Integer> union=new HashSet<Integer>();
	     union.addAll(l1);
	     union.addAll(l2);
	     return union;
  }
}
