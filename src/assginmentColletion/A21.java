package assginmentColletion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A21 {

	public static void main(String[] args) {
		      Scanner sc= new Scanner(System.in);
		     System.out.println("enter the range:");
		      int range=sc.nextInt();
		      List<Integer> l1=new ArrayList<Integer>();
		      int n1=0,n2=1;
		      l1.add(n1);l1.add(n2);
		      for(int i=3;i<=range;i++)
		      {
		    	  int n3=n1+n2;
		    	  l1.add(n3);
		    	  n1=n2;
		    	  n2=n3;  
		      }
		      System.out.println(range+":the range of fib is:"+l1);
	}

}
