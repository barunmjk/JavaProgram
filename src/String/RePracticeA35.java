package String;

public class RePracticeA35 {
   public static void main(String[] args) {
	        StringBuilder sb=new StringBuilder("abc");
	          change(sb);
	          System.out.println(sb);
}
   public static void change(StringBuilder sb) {
	   sb.append("xyz");
   }
}
