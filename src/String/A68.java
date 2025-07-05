package String;

public class A68 {
   public static void main(String[] args) {
	  String s="Maedam";
	  s=s.toLowerCase();
	  if(palindromeString(s))
		  System.out.println("PAlindrome");
	  else 
	  System.out.println("not PAlindrome");
}
   public static boolean palindromeString(String s) {
	    int start=0;
	    int end=s.length()-1;
	    while(end>=start) {
	    	if(s.charAt(start)!=s.charAt(end))
	    		return false;
	    	
	    	end--;start++;
	    }
	    return true;
   }
}
