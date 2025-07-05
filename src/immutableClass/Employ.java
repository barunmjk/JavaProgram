package immutableClass;

 final class  Employ {
	   final String name;
	  final  int id ;
	  final double salary;
	  final int age;

	    Employ(String name,int id,double salary,int age) {
		 this.age=age;
		 this.name=name;
		 this.salary=salary;
		 this.id=id;
	}
       public String  getName() {
    	   return name;
       }
       public int   getId() {
    	   return id;
       }
       public  double  getSalary() {
    	   return salary;
       }
       public int  getAge() {
    	   return age;
       }
}
