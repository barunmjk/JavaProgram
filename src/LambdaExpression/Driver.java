package LambdaExpression;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vehicle v1=()->System.out.println("drive the vehicle");
     Vehicle v2=()->System.out.println("drive the car");
     v1.start();
     v2.start();
	}

}
