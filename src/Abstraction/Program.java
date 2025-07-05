package Abstraction;

import java.util.Scanner;

class A29{
	 public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60,70};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to rotate:");
		int k=sc.nextInt();
		leftRotate(a,k);
		 
	}
	 public static void leftRotate(int [] a,int k) {
		k=k%a.length;
		if(k==0)
			return ;
		reverse(a,0,a.length);
		reverse(a,a.length-k,a.length);
		reverse(a,0,a.length-1-k);
		
		for(int p:a)
			System.out.println(p+" ");
	}
	 public static void reverse(int [] a,int start,int end) {
		 while(start<end)
		 {
			 int temp=a[start];
			 a[start]=a[end];
			 a[end]=temp;
			 end--;start++;
		 }
	}
}