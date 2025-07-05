package assginmentColletion;

import java.util.ArrayList;
import java.util.Collection;

public class A41 {
       public static void main(String[] args) {
	    int [] a1= { 1, 3, 5, 6};
	    int [] a2={ 3, 4, 6, 8};
	         intersection(a1,a2);


	}
       public static void intersection(int[] a1,int[] a2) {
    	    Collection<Integer> c1=new ArrayList<Integer>();
    	    Collection<Integer> c2=new ArrayList<Integer>();
    	    for(int p:a1)
    	    	c1.add(p);
    	    for(int p:a2)
    	    	c2.add(p);
    	    
    	    c1.retainAll(c2);
    	    System.out.println(c1);
       }
}
