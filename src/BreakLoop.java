
public class BreakLoop {

	public static void main(String[] arg) {

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (col + row > 5) {
					break;
				}
				System.out.print(row*col + " ");
			}
			System.out.println();
		}
	}
}
