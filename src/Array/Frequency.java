package Array;


public class Frequency{

	public static void main(String[] args) {

		int [] a= {10,20,10,30,40,10,20,90,100,0,0,100};
		getFrequency(a);
	}
	public static void getFrequency(int[] a) {
	int [] freq=new int[101];
	for (int i = 0; i < a.length; i++) {
		freq[a[i]]++;
	}
	 for (int i = 0; i < freq.length; i++) {
		if (freq[i]!=0) {
			System.out.println("Element:"+i+":occurs:"+freq[i]+":times");
		}
	 } 
	 
	}
	
	}
	

