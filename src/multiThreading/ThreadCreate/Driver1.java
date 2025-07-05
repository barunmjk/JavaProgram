package multiThreading.ThreadCreate;

public class Driver1 {
	public static void main(String[] args) {
		
	
Vehicle v1=new Vehicle();
Thread t1=new Thread(v1);
t1.start();
Vehicle v2=new Vehicle();
Thread t2=new Thread(v2);
t2.start();
Vehicle v3=new Vehicle();
Thread t3=new Thread(v3);
t3.start();
// System.out.println(Thread.currentThread().getName());//name aayr=ega Thraed ka main
//System.out.println(Thread.currentThread().getId()); //id aayega thread ka 
  System.out.println(t2.currentThread().getPriority());
  System.out.println(t1.currentThread().getPriority());
  System.out.println(t3.currentThread().getPriority());
	}
}
