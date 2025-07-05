package String;

public class A98 {
 public static void main(String[] args) {
	String s="ab45cde20xyz5pq40dd";
      String [] str =s.split("[^0-9]+");
      int sum=0;  
      for(String s1:str)
      {
    	  if(s1!="") {
    	 
    	  sum=sum+Integer.parseInt(s1);
    	  }
    	  
      }
      System.out.println(sum);
}
} 
