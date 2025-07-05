  package encapsulation;

public class DriverCollege {
  public static void main(String[] args) {
	CollegeAddmission ca=new  CollegeAddmission();
	ca.setAge(19);
	System.out.println("age is "+ca.getAge());
	ca.setName("Mohan");
	System.out.println(ca.getName());
	ca.setFees(60000.0);
	System.out.println(ca.getFees());
}

}
