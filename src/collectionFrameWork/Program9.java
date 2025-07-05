package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;

public class Program9 {

	public static void main(String[] args) {
		 Collection<Integer> c1=new ArrayList<Integer>();
		 c1.add(222); c1.add(26); c1.add(21); c1.add(21); c1.add(13); c1.add(45);
// boolean  b=c1.stream().allMatch(n->n%2==0);
// boolean  b=c1.stream().anyMatch(n->n%2==0);
// System.out.println(b);
//		 c1.stream().dropWhile(n->n%2==0).forEach(n->System.out.println(n));
//		 c1.stream().takeWhile(n->n%2==0).forEach(n->System.out.println(n));
//		c1.stream().map(n->n*n+1).forEach(n->System.out.println(n));
//		 c1.stream().map(n->Integer.toHexString(n)).forEach(n->System.out.println(n));
//int sum =c1.stream().mapToInt(n->n).sum();
//   System.out.println(sum);
		 double avg=c1.stream().mapToInt(n->n).average().getAsDouble();
			System.out.println("Average is: "+avg);
			
	}

}
