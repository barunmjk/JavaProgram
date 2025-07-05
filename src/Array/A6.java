package Array;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] x= {123,34,343,455,383,283};
       avgOfAllElement(x);
	}
	public static void avgOfAllElement(int[] x) {
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		double avg=sum/x.length;
		System.out.println("Avarage of element is:"+avg);
	}

}
