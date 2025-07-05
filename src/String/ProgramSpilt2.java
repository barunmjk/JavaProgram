package String;
import java.util.Scanner;
public class ProgramSpilt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name inclunding an:");
      String s1 =sc.nextLine();
      String[] str =s1.split("(an)+");
      System.out.println(str.length);
      
	}

}
