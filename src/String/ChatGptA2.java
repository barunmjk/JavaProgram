package String;

public class ChatGptA2 {

	 public static void main(String[] args) {
		
	    String s="wertyuiopasdfghjklxcvbnmz";
	    s=s.toLowerCase();
	   char [] c= s.toCharArray();
	   int vCount=0,cCount=0;
	   for(char ch:c)
	     {
		   
	    	 if(ch>='a'&&ch<='z')
	    	 {
	    		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	    			 vCount ++;
	    		 else
	    			 cCount++;
	    	 }
	    	 else 
	    		 System.out.println("not word");
	     }
	   System.out.println("vowvel count:"+vCount);
	   System.out.println("counsonant count:"+cCount);
	}
    
}
