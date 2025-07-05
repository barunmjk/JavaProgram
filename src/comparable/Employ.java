package comparable;

public class Employ implements Comparable <Employ>{
	String name;
	int id;
	double salary;
	int age;
	
	public Employ() {
	 
	}
   public  Employ(String name,int id,double salary,int age){
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.age=age;
	}
    public String toString() {
    	return name+"\t"+id +"\t"+salary +"\t"+age;
    }
    
//    public int compareTo(Employ e) {
//    	return  this.id-e.id;
//    }
    public int compareTo(Employ e) {
    	return  (int)(this.name.compareToIgnoreCase(e.name));
    }
//    public int compareTo(Employ e) {
//    	return  (int)(this.salary-e.salary);
//    }
//    public int compareTo(Employ e) {
//    	return  this.age-e.age;
//    }
    
}
