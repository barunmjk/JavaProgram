package String;

public class A103 {
  public static void main(String[] args) {
	String s="Mohan and sohan are";
	   String [] str= s.split("[^a-z]+");
	   StringBuilder sb=new StringBuilder();
	    
	   for(String s1:str) 
	   {
		   if(s1.length()>0) {
			  s1= s1.trim();
         sb.append(Character.toUpperCase(s1.charAt(0))).append(s1.substring(1)).append(" ");
		   }
	   }
	   System.out.println(sb);
	   
}
}
