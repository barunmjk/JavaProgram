package map_Hierarchy;

//WAJP to print the element in a List with highest Frequency.


import java.util.*;
public class A73{
  public static void main(String[] args) {
	List<Integer>l1=new ArrayList<Integer>();
	l1.add(14);l1.add(14);l1.add(14);l1.add(14);l1.add(15);l1.add(14);l1.add(16);l1.add(16);
	getFrequency(l1);
}
  public static void getFrequency(List<Integer>l1) {
		 int max=0;
	Map<Integer , Integer> m=new  TreeMap<Integer, Integer>();
	 for(int p:l1) {
		 int val=m.getOrDefault(p,0);
		 m.put(p, val+1); 
	 }
	 for(Map.Entry<Integer, Integer>entry:m.entrySet()) {
		 if(entry.getValue()>max)
			 max=entry.getKey();
	
	 }
	 System.out.println("maximum key is "+max);
  }
}
