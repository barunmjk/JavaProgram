package assginmentColletion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 

public class A39 {
 public static void main(String[] args) {
	

	 int [] a1= {1,3,5,6};
   int [] a2= {3,4,6,8};
    
   int [] b= minus(a1,a2);
   for(int p:b) 
	   System.out.println(p+" ");
 }
 public static int [] minus(int [] a1,int []a2) {
 Set<Integer> l1=new HashSet<Integer>();
// List<Integer> l1=new ArrayList<Integer>(); //yaha doubt hai yaha list q ni use ho raha hai aur use honne ke baad error ho raha q 
	   for(int p:a1)
		   l1.add(p);
	    
	    for(int p1: a2) {
	    	if(l1.contains(p1));
	    	    l1.remove(p1);
	    	     
	         
	    }
	    int i=0;
	    int [] b=new int[l1.size()];
	    for(int p:l1)
	    	b[i++]=p;
	    return b;
 }
}
