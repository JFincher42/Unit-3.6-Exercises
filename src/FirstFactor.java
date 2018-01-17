
public class FirstFactor {

	public static void main(String[] args) {
		// finds the first factor of 91, other than 1
		int n = 91;
		int factor = 2;
		while (n % factor != 0) {
			factor++;
		}
		System.out.println("First factor is " + factor);
		// output:  First factor is 7

	}
	
	public static void refactor() {
		int n=91, factor=2;
		for (; n % factor != 0; factor++);
		System.out.println("First factor is " + factor);	
	}
}
