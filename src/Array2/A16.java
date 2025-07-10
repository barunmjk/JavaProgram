package Array2;

//Q16-WAJP to store n terms of Fibonacci series into an array.
import java.util.*;
class A16{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the NUmber:");
int n=sc.nextInt();
 int [] a=new int[n];
  for(int p: fibSeries(a,n))
System.out.print(p+" ");
    }
public static int [] fibSeries(int [] a,int n){
int count=0;  
for(int i=0; ; i++){
     a[i]=fib(i);
     count++;
      if(count==n)
        break;
  }
  return a;
 }
 public static int fib(int n){
 if(n==0)
return 0;
 else if(n==1)
  return 1;
 int n1=0,n2=1;

 for(int i=2;i<=n;i++)
{
 
  int n3=n1+n2;
  n1=n2;
  n2=n3;
 }
return n2;
 }
 }
