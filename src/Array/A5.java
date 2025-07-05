package Array;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
//      System.out.println("Enter the number:");
      int [] x= {172,373,387,333,12};
      countAllThreeDigit(x);
       }
public static void  countAllThreeDigit(int [] x) {
	int count=0;
	for(int i=0;i<x.length;i++)
	{
		if(x[i]>=100 &&x[i]<=999) {
			count++;
//			System.out.println("number is three digit:"+count);
		}
			else {
			System.out.println(x[i]+":number is not three digit");
			}
		}
	System.out.println("number is three digit:"+count);
	}
 
}

