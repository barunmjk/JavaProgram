package Array;

public class A7 {
//ye question number 8 hai
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] x= {123,34,343,455,383,283};
       countTheBiggerOfAvg(x);
	}
	public static void countTheBiggerOfAvg(int[] x) {
		int sum=0,count=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		int avg=sum/x.length;
        for (int P:x)
        {
        	if(P>avg) {
        		count++;
        	}
        	
        }
        System.out.println("count of element who is bigger thab avarge:"+count);
	}

}
