package comparatorProgram;

public class Employ {
            int id;
            String name;
            double salary;
            int age;
	public Employ() {
		// TODO Auto-generated constructor stub
	}
   public Employ(int id ,String name,double salary,int age) {
	   this.id=id;
	   this.name=name;
	   this.salary=salary;
	   this.age=age;
   }
   public String toString() {
	   return id +"\t"+name +"\t"+salary +"\t"+age;
   }
}
