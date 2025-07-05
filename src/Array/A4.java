package Array;

public class A4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] x= {12,13,14,16,18,19};
     allElementsfromEnd(x);
	}
	public static void allElementsfromEnd(int [] x) {
		for(int i=x.length-1;i>=0;i--)
			System.out.println(x[i]);
	}

}
