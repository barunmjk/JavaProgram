package assginmentColletion;

import java.util.ArrayList;
import java.util.List;

public class A18 {

	public static void main(String[] args) {
		 int n=100;
		 int sum=0;
		 List<Integer>l1=new ArrayList<Integer>();
		 for(int i=2;i<=n;i++)
		 {
			 if(A15.isPrime(i))
				 l1.add(i);
			 sum=sum+i;
		 }
         System.out.println("first prime number:"+l1);
         System.out.println("sum of first number: "+sum);
	}

}
