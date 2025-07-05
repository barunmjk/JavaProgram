package exceptionHandling;

import java.util.Scanner;

public class RegistrationDriver {
       public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the salary: ");
		 double sal=sc.nextDouble();
		 try {
			Registration3.checkSalary(sal);
		} catch (checkEligibilitySal e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close(); 
	}
}
