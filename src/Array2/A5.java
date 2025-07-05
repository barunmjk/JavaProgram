package Array2;

class A5{
	public static void main(String[] args) {
		int [] a={16,17,101,31,91,123,2882,23332,28};
	   for (int i : a) {
		if(isPrime(i))
		    System.out.println("number is prime array is :"+i);
	     
	   }
		 
	 
	}
	public static boolean isPrime(int[] a){
		int i=0;
		if (a[i]<=1) {
			return false;
		}
		else if(a[i]==2||a[i]==3)
		{
			return true;
		}
		else if (a[i]%2==0){
			return false;
		}
		
		
		for ( i = 3; i< a.length; i+=2) {
			if (a[i]%i==0) {
				return false;
			} 
   
		}
		return true;
		}	
	}
