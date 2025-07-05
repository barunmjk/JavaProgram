package String;

public class A26dusra {

	public static void main(String[] args) {
		 String s="wertyutewwerty";
		 char [] c=  s.toCharArray();
		   int n=c.length;
		 for(int i=0;i<n;i++)
		 {
			  
			 for(int j=i+1;j<n;j++)
			 {
				 if(c[i]==c[j]) {
				 
					c[j]=c[n-1];
					n--;j--;
				 }
			 }
			 System.out.println(c[i] );
		 }
	}

}
