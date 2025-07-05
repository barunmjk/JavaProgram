package streamApi;

import java.util.stream.Stream;

public class Program3 {

	public static void main(String[] args) {
	 String [] str= {"ghj","ertyui","zxcvbnm"};
	  Stream.of(str).filter(n->n.length()%2==0).forEach(n->System.out.println(n));
 

	}

}
