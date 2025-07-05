package singaltonClass;

public class Cooler {
           private static  Cooler c;
           private static String brand;
           private static double price;
	private Cooler(String brand,double price) {
		 this.brand=brand;
		 this.price=price;
	}
	public static Cooler getFullDetails() {
   if(c==null)
   {
	   c=new Cooler("Crompton",5000.0);
   }
	return c;
	}
}
