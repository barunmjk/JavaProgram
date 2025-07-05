package String;
import java.util.*;
public class ProgramAnySpilit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the String name :");
      String s1=sc.nextLine();
      String [] str =s1.split("^[A-Za-z]+");
      System.out.print(str.length);
	}
}