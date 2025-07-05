package String;

public class A37 {
  public static void main(String[] args) {
//	  StringBuilder sb1=new StringBuilder();
//	  StringBuilder sb2=new StringBuilder();
//	  System.out.println(sb1.equals(sb2));//false builder and buffer not override of equal method
//	  
//	  StringBuilder sb=new StringBuilder();
//	  sb.append("hello");
//	  sb.append("Java").append("8.0").append("are ");
//	  System.out.println(sb);
//	   StringBuilder sb1=new StringBuilder();
//	   sb1=null;
//	   System.out.println(sb1);
//	   
//
//	  StringBuilder sb=new StringBuilder();
//	  sb.append("Hello java 8.0");
//	  System.out.println(sb);
//	  sb.delete(2, 6);
//	  System.out.println(sb);
	  
//	  StringBuilder sb = null;
//	  sb.append("abc");
//	  System.out.println(sb);
	  
	  StringBuffer sb = new StringBuffer("Java");
	  sb.setCharAt(2, 'X');
	  System.out.println(sb);
	  
	  


}
}
