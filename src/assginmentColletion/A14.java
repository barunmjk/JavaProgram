package assginmentColletion;

import java.util.Arrays;

public class A14 {

	public static void main(String[] args) {
		int n=64;
		boolean [] x=new boolean [n];
		Arrays.fill(x, true);
		x[0]=false;x[1]=false;
		for(int i=2;i*i<n;i++)
		{
			if(x[i]) {
				for(int j=i*i;j<n;j+=i) {
					if(j%i==0)
						x[j]=false;
				 
				}
			}
			 
		}
 
	}

}
