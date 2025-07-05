package assginmentColletion;

import java.util.ArrayList;
import java.util.List;

public class A20 {

	public static void main(String[] args) {
		int n=100;
		List<Integer> l1=new ArrayList<Integer>();
		   int n1=0,n2=1;
		   l1.add(n1);l1.add(n2);
		for(int i=3;i<=n;i++)
		{
			int n3=n2+n1;
			l1.add(n3);
			n1=n2;
			n2=n3;
			
		}
		System.out.println("fiest n fibnacci series:"+l1);
	 
   }
}
