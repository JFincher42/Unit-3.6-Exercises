
public class FencePost {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			System.out.print(i + ", ");
		}
	}
	
	public static void first() {
		System.out.print(1);
		for (int i=2; i<=5; i++) {
			System.out.print(", " + i);
		}
	}
	
	public static void last() {
		for (int i=1; i<5; i++) {
			System.out.print(i + ", ");
		}
		System.out.print(5);
	}
}
