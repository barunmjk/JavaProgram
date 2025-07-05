package AggregationHasRelationship;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method st'ub
		Address a1=new Address("noida ","Up",123342);
		Student s1=new Student("mohan",56.6,a1);
		System.out.println(a1);
		System.out.println(s1);
s1=null;
System.out.println(a1.city);
System.out.println(a1.state);
	}

}
