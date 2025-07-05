package String;

public class A35 {
          public static void main(String[] args) {
        	  StringBuilder s = new StringBuilder("abc");
              change(s);
              System.out.println(s);
          }
         public  static void change(StringBuilder s) {
              s.append("xyz");
          }
  
		}

