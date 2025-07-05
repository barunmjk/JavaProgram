package singaltonClass;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Printer p1=Printer.getInstance();
       
        Printer p2=Printer.getInstance();
        System.out.println(p1);
        System.out.println(p2);
	}

}
