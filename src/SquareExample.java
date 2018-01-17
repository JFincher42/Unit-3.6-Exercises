
public class SquareExample {

	public static void main(String[] args) {

		int n = 1;
		while (n < 5) {
			System.out.println(n*n);
			n++;
		}
		System.out.println("Final n: " + n);
	}
	
	public static void refactor() {
		int n;
		for (n=1; n < 5; n++) {
			System.out.println(n*n);
		}
		System.out.println("Final n: " + n);
	}

}
