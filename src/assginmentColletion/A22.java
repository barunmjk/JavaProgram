package assginmentColletion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the range :");
           int range =sc.nextInt();
           List<Integer> l1=new ArrayList<Integer>();
             for(int i=1;i<=range;i++) {
            	  
            int num=pascal(i);
            	 l1.add(num);
             } 
             System.out.println(l1);
            	 
          	 
	}
	public static int pascal(int n) {
        int comb=1;
        	 if(n==1)
        		 return 1;
             for(int i=0;i<n;i++)
            	 comb=comb*(n-i)/(i+1) ;
              
             return comb;
	}
}
