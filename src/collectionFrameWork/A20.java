package collectionFrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A20 {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("ENTER THE range to need Fibnacci:");
	   int n =sc.nextInt();
	  List<Integer> l1=getFib(n);
	  System.out.println(l1);
	}
  public static List<Integer> getFib(int n){
	    int n1=0,n2=1;
	    List<Integer> l1=new ArrayList<Integer>();
	    l1.add(n1);l1.add(n2);
	    for(int i=2;i<n;i++)
	    {
	        int n3=n1+n2;
	        l1.add(n3);
	        n1=n2;
	        n2=n3;
	    }
	    return l1;
  }
}
