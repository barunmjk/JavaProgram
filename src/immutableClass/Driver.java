package immutableClass;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Car c1=new Car("Tata","Black",120000.0);
             System.out.println(c1.getName());
//             c1.name="bata"; //name is name change as well as color and price so this immutable class 
	}

}
