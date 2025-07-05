package exceptionHandling;

import java.util.Scanner;

public class DriverVaildAge {
	public static void main(String[] args) {
		
	
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the age:");
 int age=sc.nextInt();
     try {
		Registration4.CheckEligibilityAge(age);
	} catch (VaildAge e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}  
}
