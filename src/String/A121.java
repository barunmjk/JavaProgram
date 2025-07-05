package String;

import java.util.*;

public class A121 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the paranthesis:");
	String s=sc.nextLine();
	if(isValidParanthesis(s))
		System.out.println("Vaild paranthesis");
	else
	System.out.println("invaild paranthesis");
}
public static boolean isValidParanthesis(String s) {
	  String op="({[";
	  String clo=")}]";
	  Stack<Character> st=new Stack<Character>();
	  for(char c:s.toCharArray())
	  {
		if(op.indexOf(c)>=0)
			st.push(c);
		else if(clo.indexOf(c)>=0)
		{
			if(st.isEmpty())
				return false;
		
		else if(op.indexOf(st.pop())!=clo.indexOf(c))
			return false;
	  }}
	  return st.isEmpty();
}
}
