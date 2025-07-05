package String;

public class A27 {

	public static void main(String[] args) {
		 String s="wertyutewwerty";
		 char [] c=  s.toCharArray();
		   int n=c.length;
		 for(int i=0;i<n;i++)
		 {
			 int count =1;
			 for(int j=i+1;j<n;j++)
			 {
				 if(c[i]==c[j]) {
					count++;
					c[j]=c[n-1];
					n--;j--;
				 }
			 }
			 System.out.println(c[i] +" is "+count+" times");
		 }
	}

}
