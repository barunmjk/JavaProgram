package While;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner driver =new Scanner(System.in);
           System.out.println("Enter the String name:");
           String str=driver.nextLine();
           upperCaseString(str);
	}
	public static void upperCaseString(String str) {
		int i=0;
		while(i<str.length())
		{
			char c=str.charAt(i);
			if(c>=65 && c<=90)
			System.out.println(c);
			i++;
		}
	}

}
