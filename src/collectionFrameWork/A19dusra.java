package collectionFrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A19dusra {

	public static void main(String[] args) {
		  Scanner sc =new Scanner(System.in);
		  System.out.println("ENter the range:");
       int range =sc.nextInt();
        List<Integer> l1= rangeOfPrime(range);
          System.out.println(l1);
          System.out.println(l1.get(2));

	}
  public static List<Integer> rangeOfPrime(int range) {
	 List<Integer > l1=new ArrayList<Integer>();
	    int count=0;
	    for(int i=0;;i++) {
	       if(isPrime(i)) {
	    	   l1.add(i);
	           count++;
	       }
	       if(range==count)
	       break;
	    }
	    return l1;
  }
  public static boolean isPrime(int n) {
	       if(n<=1)
	    	   return false;
	       else if(n==2||n==3)
	    	   return true;
	       else if(n%2==0)
	    	   return false;
	       for(int i=3;i*i<=n;i+=2) {
	    	   if(n%i==0)
	    		   return false;
	       }
	       return true;
  }
}
