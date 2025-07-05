package singaltonClass;

public class Laptop {
	             private static Laptop l;
                 private String brand;
                 private String color;
                 private double price; 
	private Laptop(String brand ,String color,double price) {
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	public static  Laptop getInstance() {
		if(l==null)
		{
			l=new Laptop("Lenovo","silver",34563.4);
		}
		return l;
	}
}
