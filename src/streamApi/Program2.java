package streamApi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program2 {
         public static void main(String[] args) {
	    String [] s= {"mohan","sohan","rohan","ravi"};
	    String [] s1= {"mohan","sohan","rohan","ravi","lohan"};
	   Stream<String> str=Stream.of(s);
	   str.filter(n->n%2==0).forEach(n->System.out.println(s));
}
}
