package collectionFrameWork;

import java.util.*;

public class A18 {
    public static void main(String[] args) {
		    List<Integer> l1= new ArrayList<Integer>();
		    Scanner sc =new Scanner(System.in);
		    System.out.println("Enter the range of num:");
		    
		    int num=sc.nextInt();
		 
		    for(int i =1;i<=num;i++) {
		    	System.out.println("enter the first num:"+i+"st");
		    int n=sc.nextInt();
		    	l1.add(n);
		    }
		    System.out.println(l1);
		        for(int p:l1) {
		        	if(isPrime(p))
		        		System.out.println("prime number is:"+p);
        }
	}
    public static boolean  isPrime(int n) {
    	if(n<=1)
    		return false ;
    	else if(n==2||n==3)
    		return true;
    	else if(n%2==0)
    		return false ;
    	for(int i=3;i*i<n;i+=2) {
    		if(n%i==0)
    			return false;
    	}
    	return true;
    }
}

