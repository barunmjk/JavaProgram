package singaltonClass;

public class Moblie{ 
	 private static Moblie m;
	   private String brand;
	  
       
	private Moblie(String brand) {
		 this.brand=brand;
	}
     public static Moblie getdetail() {
    	if (m==null) {
    	    m=new Moblie("Noika");
    	}
    	return m;
    	
     }
}
