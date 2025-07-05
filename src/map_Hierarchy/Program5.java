package map_Hierarchy;

import java.util.*;

public class Program5 {

	public static void main(String[] args) {
	  Scanner sc =new Scanner (System.in);
	  System.out.println("Eneter the String:");
	  String s=sc.nextLine();
	  getFrequency(s);
 
 }
	public static void  getFrequency( String s) {
		Map<Character, Integer> m=new LinkedHashMap<Character, Integer>();
		for(char c:s.toCharArray()) {
		int v=	m.getOrDefault(c, 0);
		m.put(c, v+1);
		}
		m.forEach((k,v)->System.out.println(k +"is "+v +" times"));
	}
}
