package String;

public class A87 {
   public static void main(String[] args) {
	   String s="36521";
	   int sum=0;
	   int n=s.length();
	   int fsum=(n+1)*(n+2)/2;
       for(int i=0;i<s.length();i++)
    	  sum=sum +s.charAt(i)-48;
       
       System.out.println(fsum-sum);
}
}
