package assginmentColletion;

import java.util.ArrayList;
import java.util.Collection;

public class A8 {
  public static void main(String[] args) {
	Collection<String> c1=new ArrayList<String>();
	c1.add("dfghjk");c1.add("oiuytrewq");c1.add("qwertyuio");c1.add("wertyu");c1.add("ddfghj");c1.add("dfh");
      for(String s:c1)
      {
    	  System.out.println(s+"  length is:"+s.length());
      }
  }
}
