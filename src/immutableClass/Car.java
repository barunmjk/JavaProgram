package immutableClass;

final class Car {
           private final String name;
         private final String color;
          private final double price;
 
        Car(String name,String color ,double price ){
        	this.name=name;
        	this.color=color;
        	this.price=price;
        }
        public String getName() {
    		return name;
    	}
        public String getColor() {
    		return color;
    	}
        public double getPrice() {
    		return price;
    	}

}
