package objectClassMethods;

public class  Employ {
	   int id;
	   String name;
	   double salary;
	   int age;
	    Employ(){
	    	
	    }
                      
	public Employ (int id,String name,double salary,int age) {
		   this.name=name;
		   this.id=id;
		   this.salary=salary;
		   this.age=age;
		   
	}       @Override
         public String toString() {
			return id+"\t"+name+"\t"+salary+"\t"+age;
        	 
         }
}
