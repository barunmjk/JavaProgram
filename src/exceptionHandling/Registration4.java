package exceptionHandling;

public class Registration4 {
     public static void CheckEligibilityAge(int age) throws VaildAge {
    	 if(age>=18)
    	 
    		 System.out.println("Vaild age");
    	 else 
    		 throw new VaildAge();
     }
}
