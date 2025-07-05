package Loop;

import java.util.Scanner;

public class A21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the number:");
      int n=sc.nextInt();
     boolean b=diffAlterDigit(n);
     System.out.println(b);
	}
	public static boolean diffAlterDigit(int n) {
		int digit1=n%10;
		n/=10;
		while(n>0)
		{
			int digit2=n%10;
			if(digit1==digit2)
				return true;
				digit2=digit1;
				n/=10;
		}
		return false;
	}

}
