package Array;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] x= {12,13,14,16,17,18};
	countAllEvenElement(x);
	}
	public static void countAllEvenElement(int[] x) {
		int count=0;
		for (int i =0;i<x.length;i++)
		{
			if(x[i]%2==0) {
				count++;
				
			}
		}
		System.out.println("count all even element:"+count);
	}
}
