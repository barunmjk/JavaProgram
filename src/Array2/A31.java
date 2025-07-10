package Array2;
//WAJP to print Biggest and second biggest element of the array.
//int[] a= {80, 80, 43, 50, 38, 63, 58, 80};
//o/p
//80
//63

public class A31 {
   public static void main(String[] args) {
	int [] a= {50,50,30,40,20,10};
	FirstBigSBig(a);
}
   public static void FirstBigSBig(int []a) {
	   int fBig=a[0],sBig=Integer.MIN_VALUE;
	   for(int p:a) {
		   if(p>fBig)
		   {
			   fBig=p;
			   sBig=fBig;
		   }
		   else if(p>sBig && p!=fBig)
			   sBig=p;
	   }
	   System.out.println("Second big: " +sBig);
	   System.out.println("First big: " +fBig);
   }
}
