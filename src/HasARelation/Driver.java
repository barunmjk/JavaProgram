package HasARelation;

public class Driver {

	public static void main(String[] args) {
		Car c1=new Car("Tata",new Engine(150));
  System.out.println(c1);
  System.out.println(c1.e);
  System.out.println(c1.e.hp);
  System.out.println("Car name is "+c1.name);
// c1=null;
	}

}
