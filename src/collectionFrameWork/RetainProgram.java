package collectionFrameWork;

 import java.util.*;

public class RetainProgram {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		Collection c2=new ArrayList();
		System.out.println(c1);
		c1.add(10);	c1.add(12);	c1.add(13);	c1.add(15);	c1.add(17); 	c1.add(18); 	c1.add(18);
		System.out.println(c1); 
		c2.add(13); c2.add(17);
		System.out.println(c2);
		c1.retainAll(c2);
		System.out.println(c1);
		c1.clear();
		System.out.println(c1);
		System.out.println(c2.contains(13));
	}

}

