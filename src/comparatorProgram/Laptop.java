package comparatorProgram;

public class Laptop {
      int id;
      String brand;
      double price;
      String color;
      
      Laptop(){
    	  }
      Laptop(int id,String brand,double price,String color){
    	  this.id=id;
    	  this.brand=brand;
    	  this.price=price;
    	  this.color=color;
      }
      public String toString() {
    	  return id+"\t"+brand+"\t"+price+"\t"+color;
      }
      
}
