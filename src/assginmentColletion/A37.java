package assginmentColletion;

import java.util.HashSet;
import java.util.Set;

public class A37 {
   public static void main(String[] args) {
	 int [] a1= {1,3,5,6};
	 int [] a2= {4,6,8};
         int [] b= union(a1,a2);
         for(int p:b)
        	 System.out.print(p+" ");
         
}
   public static int[] union(int [] a1,int[] a2) {
	    Set<Integer > union=new HashSet<Integer>();
	     for(int p:a1) {
	    	 union.add(p);
	     }
	     for(int p:a2) {
	    	 union.add(p);
	     }
	     int i=0;
	     int [] b=new int[union.size()];
	     for(int p:union)
	        b[i++]=p;
	     return b;
   }
   
}
