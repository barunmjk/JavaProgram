package exceptionHandling;

public class UnderQualification extends Exception {
        UnderQualification(){
        	
        }
        UnderQualification(String msg){
        	super(msg);
        }
}
