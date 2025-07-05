package MethodChaining;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employ e1=new Employ(123,"Mohan",25,24443.83);
        Employ e2=new Employ(121,"ravi",27,26626.82);
        Employ e3=new Employ(122,"sohan",25,45000.99);
        
        e1.getId().getName().getAge().getSalary().test();
        e2.getId().getName().getSalary().getName().test();
        e3.getId().getName().getSalary();
	}

}
