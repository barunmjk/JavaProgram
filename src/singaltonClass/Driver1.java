package singaltonClass;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Laptop l1=Laptop.getInstance();
        Laptop l2=Laptop.getInstance();
        System.out.println(l1);
        System.out.println(l2);
	}

}
