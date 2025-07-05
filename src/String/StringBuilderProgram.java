package String;

public class StringBuilderProgram {
   public static void main(String[] args) {
	   StringBuilder sb=new StringBuilder();
	   System.out.println(sb.capacity());
	   sb.append("Hello");
	   System.out.println(sb.capacity());
	   sb.ensureCapacity(16);
	   sb.append("Mohan are here");
	   System.out.println(sb.capacity());
	   StringBuffer sb1 = new StringBuffer("abc");
	   StringBuffer sb2 = new StringBuffer("abc");
	   System.out.println(sb1.equals(sb2));

	  
}
}
