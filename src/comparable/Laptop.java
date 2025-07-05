package comparable;

public class Laptop implements Comparable <Laptop> {
      String brand;
      int id;
      double price;
      
      public Laptop() {
    	  
      }
      
      public Laptop( int id,String brand,double price) {
    	  this.id=id;
    	  this.brand=brand;
    	  this.price=price;
      }
      public String toString() {
    	  return id+"\t"+brand+"\t"+price;
      }
    

	@Override
	public int compareTo(Laptop l) {
		 return (int) (this.brand.compareToIgnoreCase(l.brand));
		
	}
}
