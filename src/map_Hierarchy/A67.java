package map_Hierarchy;

//WAJP to print the frequency of each elements in Array.
import java.util.HashMap;
import java.util.Map;

public class A67 {
public static void main(String[] args) {
	int [] a= {12,13,15,18,12,13,15,19};
	getFrequency(a);
}
public static void getFrequency(int [] a) {
	Map<Integer, Integer> m=new HashMap<Integer, Integer>();
	for(int p:a) {
		int val=m.getOrDefault(p, 0);
		m.put(p, val+1);
	}
	for(Map.Entry<Integer, Integer>entry: m.entrySet())
  {
	  if(entry.getValue()>0)
		  System.out.println(entry.getKey()+" is"+entry.getValue()+" times");
  }
}
}
