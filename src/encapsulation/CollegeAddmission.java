 package encapsulation;

public class CollegeAddmission {
        private String name;
        private int age;
        private double fees;
        
        public void setName(String name) {
        	  if(name.matches("[A-Za-z\s]+"))
        	  this.name=name;
        	  
        	  else 
        		  System.out.println("invaild name");
        }
        public String getName() {
        	return name;
        }
        public void setAge(int age) {
      	  if(age>=18)
      	  this.age=age;
      	  
      	  else 
      		  System.out.println("invaild age");
      }
      public int getAge() {
      	return age;
      }
      public void setFees(double fees) {
    	  if(fees>=50000)
    	  this.fees=fees;
    	  
    	  else 
    		  System.out.println("plz fill the fees ");
    }
    public double getFees() {
    	return fees;
    }
}
