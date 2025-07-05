package assginmentColletion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Range:");
            int range=sc.nextInt();
            List<Integer> l1=new ArrayList<Integer>();
            for(int i=2;i<=range;i++)
            {
            	if(A15.isPrime(i))
            	l1.add(i);
          
            }
            System.out.println(range+": range of list of prime number is:"+l1);
            sc.close();
	}

}
