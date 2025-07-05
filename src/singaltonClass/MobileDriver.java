package singaltonClass;

public class MobileDriver {

	public static void main(String[] args) {
		 Moblie m1 =Moblie.getdetail();
		 Moblie m2 =Moblie.getdetail();
		 System.out.println(m1);
		 System.out.println(m2);

	}

}
