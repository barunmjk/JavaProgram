package singaltonClass;

public class Printer {
	private static Printer p;
   private final String brand;
   private final int price;
   private final String color;
	private Printer(String brand,int price,String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public static Printer getInstance() {
		 if(p==null) {
			 p=new Printer("Hp",23456,"white");
		 }
return p;
	} 
	 
	
}
