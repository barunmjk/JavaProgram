package collectionFrameWork;
import java.util.*;
public class A19 {

	public static void main(String[] args) {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter the Range:");
         int n=sc.nextInt();
         System.out.println(getRangePrime(n));
	}
         public static List<Integer> getRangePrime(int n) {
          List<Integer> l1=new ArrayList<Integer>();
 
         boolean []  b =new boolean[n];
          Arrays.fill(b, true);
          b[0]=b[1]=false;
          
          for(int i=2;i*i<n;i++) {
        	   if(b[i]) {
        	  for(int j=i*i;j<n;j+=i) 
        		   b[j]=false;
        	   }    
             }
           for(int i=0;i<n;i++) {
        	   if(b[i])
        	l1.add(i);
           }
          return l1;
   }
}