package exceptionHandling;

public class Registration3 {
     public static void checkSalary(double salary) throws checkEligibilitySal {
    	 if(salary>=25000.0)
    		 System.out.println("You can apply for loan");
    	 else
    		 throw new checkEligibilitySal();
     }
}
