package assginmentColletion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc= new Scanner(System.in);
          System.out.println("enter the range:");
          int range=sc.nextInt();
          System.out.println("enter the number which you want is kth num:");
          int kth=sc.nextInt();
          int count=0;
          int i;
          List< Integer> l1=new ArrayList<Integer>();
          for( i=2;i<=range;i++) {
        	  if(A15.isPrime(i)) {
        		  l1.add(i);
        		  count++;
        		  
        	  if(count==kth)
    			  System.out.println("number is kth prime number:"+i);
        	  }
          }
          System.out.println(range +":of list of prime number:"+l1);
         
       sc.close();   
	}

}
