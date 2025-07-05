package MethodChaining;

public class Employ {
            String name;
            int id;
            double salary;
            int age;
            Employ(int id,String name,int age,double salary)
            {
                this.id=id;
                this.name=name;
                this.age=age;
                this.salary=salary;
            }
        
        public Employ getId() {
             System.out.println("Id is:"+id);
        	return this;
        }
        public Employ getName() {
           System.out.println("name is:"+name);
        	return this;
        }
        public Employ getAge() {
        	System.out.println("Age is:"+age);
        	
        	return this;
        }
        public Employ getSalary() {
        	   System.out.println("Salary is:"+salary);
        	return this;
        }
        public void test() {
        	System.out.println("=====================================");
        }
        
}
