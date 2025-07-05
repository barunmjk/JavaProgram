package Array2;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] x= {11,10,13,32};
       biggestSmallestDiff(x);
	}
	public static void biggestSmallestDiff(int[] x){
		int biggest=x[0],smallest=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>biggest) {
				biggest=x[i];
			}
			if(x[i]<smallest) {
				smallest=x[i];
			}
		}
		int diff=biggest-smallest;
		System.out.println("Biggest and Smallest diffrece is :"+diff);
	}

}
