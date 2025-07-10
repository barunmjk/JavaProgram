package String;

import java.util.Scanner;

public class A107 {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		String [] str=s.split("\s+");
		getFrequency(str);
}
public static void getFrequency(String [] str) {
	int n=str.length,max=0;
	for(int i=0;i<n;i++) {
		int count=1;
		for(int j=i+1;j<n;j++) {
			if(str[i].equalsIgnoreCase(str[j])) {
				count++;
				str[j]=str[n-1];
				j--;n--;
			}
		}
		
		if(max<count) 
			max=count;
			 
	}
	System.out.println(str[max]);
}
}
