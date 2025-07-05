package encapsulation;

public class Driver {

	  public static void main(String[] args) {
		MarriageRegistration msg=new MarriageRegistration();
	       msg.setAge(71);
	       System.out.println(msg.getAge());
	       msg.setName("12345");
	       System.out.println(msg.getName());
	       msg.setSalary(24000);
	       System.out.println(msg.getSalary());
	       msg.setAge(32);
	       System.out.println(msg.getAge());
	       msg.setName("Mohan");
	       System.out.println(msg.getName());
	       msg.setSalary(29000);
	       System.out.println(msg.getSalary());
	}

}
