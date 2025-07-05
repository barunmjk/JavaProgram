package exceptionHandling;

public class Registration {
		public static void checkEligibility(int age) throws UnderAgeException {
			if(age>=18) {
				System.out.println("you are eligible for vote");
		}
			else {
				throw new  UnderAgeException("Hey !you are not eligible for vote!");
			}
		}

	

}
