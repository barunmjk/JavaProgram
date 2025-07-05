package String;

public class A36 {
    public static void main(String[] args) {
    	String s = String.format("Value is: %d", 100);
    	System.out.println(s);
     
    	StringBuilder sb1 = new StringBuilder("hello");
    	StringBuilder sb2 = new StringBuilder("hello");
    	System.out.println(sb1.equals(sb2));

	}
}
