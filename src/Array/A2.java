package Array;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] x= {11,12,13,14,15,16};
      allEvenElements(x);
	}
   public static void  allEvenElements(int [] x) {
       int i;
       for(i=0;i<x.length;i++)
	   {
		   if(x[i]%2==0)
			   System.out.println(x[i]);
	   }
	   
   } 
}
