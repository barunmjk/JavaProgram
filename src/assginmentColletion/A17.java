package assginmentColletion;

import java.util.ArrayList;
import java.util.List;

public class A17 {

	public static void main(String[] args) {
               int n=100;
               List<Integer > l1=new ArrayList<Integer>();
               for(int i=2;i<=n;i++)
               {
            	   if(isPrime(i))
            		   l1.add(i);
               }
               System.out.println("first n prime number:"+l1);
	}
   public static boolean isPrime(int n) {
	    if(n<=1)
	    	return false;
	    else if(n==2||n==3)
	    	return true;
	    else if(n%2==0)
	    	return false;
	    for(int i=3;i*i<n;i+=2)
	    {
	    	 if(n%i==0)
	    		 return false;
	    	 
	    }
	    return true;
   }
}
