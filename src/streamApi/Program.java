package streamApi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Program {
         public static void main(String[] args) {
			int [] a= {10,12,32,23,23,11,33};
     IntStream s= Arrays.stream(a).sorted().distinct();
     s.forEach(n->System.out.print(n+" "));
        
		}
	}


