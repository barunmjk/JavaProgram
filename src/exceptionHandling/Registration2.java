package exceptionHandling;

public class Registration2 {
    public static void checkEligibity(int qual) throws UnderQualification{
    	if(qual <=12)
    		System.out.println("You have vaild qualifition");
    	else
    		throw new UnderQualification();
    	}
}
