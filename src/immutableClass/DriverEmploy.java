package immutableClass;

public class DriverEmploy {

	public static void main(String[] args) {
		 Employ e1=new Employ("Mohan", 123, 43000, 29);
		 System.out.println(e1.getName());
		 System.out.println(e1.getSalary());
		 System.out.println(e1.getId());
		 System.out.println(e1.getAge());
//		 e1.name="Rohan";
//		 e1.age=28;
	}

}
