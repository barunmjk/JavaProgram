package Array;
public class A1 {

	public static void main(String[] args) {
		int[] x = { 11, 12, 13, 14, 15, 16, 17 };
		evenIndexElements(x);
	}

	public static void evenIndexElements(int[] x) {
		int i;
		for (i = 0; i < x.length; i++) {
			if (i % 2 == 0) {
				System.out.println(x[i]);
			}
		}
	}
}