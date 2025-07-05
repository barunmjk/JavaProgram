package Array;

public class A11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] x= {12,24,53,21,54};
        sumOf3Div(x);
	}
	public static void   sumOf3Div(int [] x) {
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
			if(sum%3==0)
				System.out.println("Element is who divide by 3 is:"+x[i]);
		}
		
	}

}
