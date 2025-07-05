package encapsulation;

public class MarriageRegistration {
                     private  String name;
                      private int age;
                      private double salary;

	public void setAge(int age) {
		  if(age>=25&& age<=40)
		  {
			  this.age=age;
			 System.out.println("you have vaild age for marriage ");
		  }  
		    else
		    	System.out.println("invaild age");
	  }
	  public int getAge() {
		        
		    return age; 
	  }
 
		public void setName(String name) {
			  if(name.matches("[A-Za-z\s]+"))
			  {
				  this.name =name;
				
			  }  
			    else
			    	System.out.println("invaild name");
		  }
		  public String getName() {
			        
			    return name; 
		  }
			public void setSalary(double salary) {
				  if(salary>=25000.0)
				  {
					  this.salary=salary;
					 System.out.println("you have vaild salary for marriage");
				  }  
				    else
				    	System.out.println("invaild salary");
			  }
			  public double getSalary() {
				        
				    return salary; 
			  }
}
