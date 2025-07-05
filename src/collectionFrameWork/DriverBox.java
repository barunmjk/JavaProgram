package collectionFrameWork;

public class DriverBox {
      public static void main(String[] args) {
		Box <Integer> b1=new Box<>(11);
		System.out.println(b1.getDetails());
		Box <String> b2=new Box<>("Mohan");
		System.out.println(b2.getDetails());
	}
}
