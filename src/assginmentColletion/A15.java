package assginmentColletion;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class A15 {

	public static void main(String[] args) {
		
     List<Integer> l1=new ArrayList<Integer>();
   l1.add(12);l1.add(19);l1.add(12);l1.add(18);
	System.out.println(l1);
	     
	 int sum =0; 		   
	 for(int p:l1)
	 {
		 if(isPrime(p))
		 {
			 sum=sum+p;
		 System.out.println("sum os prime number :"+sum);
		 }
		 }
	}
  public static boolean isPrime(int n) {
	  if(n<=1)
		  return false;
	  else if(n==2||n==3)
		  return true;
	  else if(n%2==0)
		  return false;
	  for(int i=3;i*i<n;i+=2) {
		  if(n%i==0) 
			  return false;
              }
		  return true;
  }
}
