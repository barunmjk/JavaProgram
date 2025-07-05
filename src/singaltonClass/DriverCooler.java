package singaltonClass;

public class DriverCooler {
   public static void main(String[] args) {
	
	  Cooler c1= Cooler.getFullDetails();
	
	  Cooler c2= Cooler.getFullDetails();
	  System.out.println(c1);
	  System.out.println(c2);
   }
}
