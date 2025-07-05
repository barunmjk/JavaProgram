package Anonynous_Class;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Vehicle v1=new Vehicle() {
            	public void start() {
            		System.out.println("Start the Vehicle");
            	}
            };
            Car v2=new Car(){
            	public void start(){
            		System.out.println("Start the Car");
            	}
            };
            v1.start();
            v2.start();
	}             

}
