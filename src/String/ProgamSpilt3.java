package String;
import java.util.Scanner;
public class ProgamSpilt3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String name :");
		String s1 =sc.nextLine();
//		String[] str =s1.split("[@!#]+");
		String[] str =s1.split("[a-z]+");
		System.out.println(str.length);
	}
}
